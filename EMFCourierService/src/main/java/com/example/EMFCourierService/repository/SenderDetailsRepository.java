package com.example.EMFCourierService.repository;

import com.example.EMFCourierService.entity.SenderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SenderDetailsRepository extends JpaRepository<SenderDetails, Integer> {
}
