package com.bountiful.loyaltysystem.services;

import com.bountiful.loyaltysystem.exceptions.ErrorCode;
import com.bountiful.loyaltysystem.exceptions.ErrorException;
import com.bountiful.loyaltysystem.exceptions.ErrorMessage;
import com.bountiful.loyaltysystem.persistence.entities.UserEntity;
import com.bountiful.loyaltysystem.persistence.repositeries.UserRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public UserEntity saveUser(UserEntity userEntity) {
        Optional<UserEntity> user = userRepo.findByEmailOrPhoneNumber(userEntity.getEmail(), userEntity.getPhoneNumber());
        if (user.isEmpty()) {
            return userRepo.save(userEntity);
        }
        throw new ErrorException(
                new ErrorMessage("You are already registered! Please check your email or phone number",
                        ErrorCode.Conflict));
    }

}