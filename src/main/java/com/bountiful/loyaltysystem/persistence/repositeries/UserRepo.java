package com.bountiful.loyaltysystem.persistence.repositeries;

import com.bountiful.loyaltysystem.persistence.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;


interface UserRepo extends JpaRepository<UserEntity, Long> {
}
