package com.joe.dejesus.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.joe.dejesus.model.Vacante;

public interface VacantesRepository extends JpaRepository<Vacante, Integer> {

}
