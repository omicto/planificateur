package com.planificateur.eventplanner.repository;

import com.planificateur.eventplanner.models.Local;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalRepository extends JpaRepository<Local, Long> {
}
