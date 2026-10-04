package com.iim.project.repository;

import com.iim.project.model.Anisse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnisseRepository extends JpaRepository<Anisse, Long> {
}