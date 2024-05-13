package com.example.alarmserver.repository;

import com.example.alarmserver.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {
    Boolean existsByUsername(String username);
    UserEntity findByUsername(String username);

}

