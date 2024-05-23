package com.example.notiserver.port.out;

import com.example.notiserver.entity.SentNoti;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SentNotiRepository extends JpaRepository<SentNoti, Long> {
}
