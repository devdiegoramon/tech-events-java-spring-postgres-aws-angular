package com.prosync.eventos.api.repositories;

import com.prosync.eventos.api.domain.coupon.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CouponRepository extends JpaRepository<Coupon, UUID> {
}
