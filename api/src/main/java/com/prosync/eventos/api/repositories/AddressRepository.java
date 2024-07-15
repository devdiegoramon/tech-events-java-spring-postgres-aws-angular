package com.prosync.eventos.api.repositories;

import com.prosync.eventos.api.domain.adress.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AddressRepository extends JpaRepository<Address, UUID> {
}
