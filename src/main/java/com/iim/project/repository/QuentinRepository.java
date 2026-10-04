package com.iim.project.repository;

import com.iim.project.model.Quentin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuentinRepository extends JpaRepository<Quentin, Long> {
}