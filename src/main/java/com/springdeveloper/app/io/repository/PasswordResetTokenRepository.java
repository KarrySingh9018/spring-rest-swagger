package com.springdeveloper.app.io.repository;

import org.springframework.data.repository.CrudRepository;

import com.springdeveloper.app.io.entity.PasswordResetTokenEntity;

public interface PasswordResetTokenRepository extends CrudRepository<PasswordResetTokenEntity, Long>{
	PasswordResetTokenEntity findByToken(String token);
}
