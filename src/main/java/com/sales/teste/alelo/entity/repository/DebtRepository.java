package com.sales.teste.alelo.entity.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sales.teste.alelo.entity.Debt;

public interface DebtRepository extends JpaRepository<Debt, UUID> {

}
