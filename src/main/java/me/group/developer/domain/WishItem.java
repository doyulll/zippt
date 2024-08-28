package me.group.developer.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;  // 이 부분이 중요합니다

@Entity
public class WishItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;  // 찜한 사용자
    private Long itemId;  // 찜한 상품 또는 게시글

    // 기본 생성자 추가
    public WishItem() {
    }

    public WishItem(Long userId, Long itemId) {
        this.userId = userId;
        this.itemId = itemId;
    }

    // Getter 메서드 추가 (포스트맨)
    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getItemId() {
        return itemId;
    }
}
