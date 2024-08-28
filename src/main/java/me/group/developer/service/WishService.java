package me.group.developer.service;

import me.group.developer.domain.WishItem;
import me.group.developer.repository.WishRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishService {

    private final WishRepository wishRepository;

    public WishService(WishRepository wishRepository) {
        this.wishRepository = wishRepository;
    }

    public WishItem addWish(Long userId, Long itemId) {
        WishItem wishItem = new WishItem(userId, itemId);
        return wishRepository.save(wishItem);
    }

    public List<WishItem> getWishList(Long userId) {
        return wishRepository.findByUserId(userId);
    }

    public void removeWish(Long userId, Long itemId) {
        wishRepository.deleteByUserIdAndItemId(userId, itemId);
    }
}