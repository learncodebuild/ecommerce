package com.lcb.ecommercebackend.project.repositories;

import com.lcb.ecommercebackend.project.model.dbSchema.ProductEntity;
import com.lcb.ecommercebackend.project.model.dbSchema.WhishlistEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WhishlistRepository extends JpaRepository<WhishlistEntity, Long> {
    public List<WhishlistEntity> findByUserId(Long userId);
    public WhishlistEntity findByWhishlistId(Long whishlistId);
}
