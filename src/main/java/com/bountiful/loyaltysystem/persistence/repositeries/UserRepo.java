package com.bountiful.loyaltysystem.persistence.repositeries;

import com.bountiful.loyaltysystem.persistence.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByEmailOrPhoneNumber(String Email, String phoneNumber);
}
