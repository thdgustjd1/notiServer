package com.example.notiserver.port.out;

import com.example.notiserver.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {
    List<UserEntity> findAll();
    //Optional<UserEntity> ExiByUsername(String userName);
    boolean existsByEmailAddress(String emailAddress);

}
