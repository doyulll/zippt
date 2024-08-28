package me.group.developer.repository;

import me.group.developer.domain.WishItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WishRepository extends JpaRepository<WishItem, Long> {
    List<WishItem> findByUserId(Long userId);
    void deleteByUserIdAndItemId(Long userId, Long itemId);
}
