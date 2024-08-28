package me.group.developer.controller;

import me.group.developer.domain.WishItem;
import me.group.developer.service.WishService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/wishes")
public class WishController {

    private final WishService wishService;

    public WishController(WishService wishService) {
        this.wishService = wishService;
    }

    @PostMapping
    public ResponseEntity<WishItem> addWish(@RequestParam Long userId, @RequestParam Long itemId) {
        WishItem wishItem = wishService.addWish(userId, itemId);
        return ResponseEntity.ok(wishItem);
    }

    @GetMapping
    public ResponseEntity<Object> getWishList(@RequestParam Long userId) {
        List<WishItem> wishList = wishService.getWishList(userId);
        return ResponseEntity.ok(wishList);
    }

    @DeleteMapping
    public ResponseEntity<Void> removeWish(@RequestParam Long userId, @RequestParam Long itemId) {
        wishService.removeWish(userId, itemId);
        return ResponseEntity.noContent().build();
    }
}
