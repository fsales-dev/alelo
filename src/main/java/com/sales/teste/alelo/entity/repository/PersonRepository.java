package com.sales.teste.alelo.entity.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sales.teste.alelo.entity.Person;

public interface PersonRepository extends JpaRepository<Person, UUID> {

	public Optional<Person> findByLegalName(String legalName);
}
