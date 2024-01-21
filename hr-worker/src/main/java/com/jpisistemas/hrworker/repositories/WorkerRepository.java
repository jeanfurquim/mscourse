package com.jpisistemas.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpisistemas.hrworker.entities.Worker;


@Repository
public interface WorkerRepository extends JpaRepository <Worker, Long> {

}
