package com.sales.teste.alelo.api;

import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sales.teste.alelo.entity.Debt;

@RestController
@RequestMapping("/alelo/v1/debt")
public interface DebtApi {

	@GetMapping("{id}")
	public ResponseEntity<Debt> getDebt(@PathVariable UUID id);
	
	@GetMapping("/all")
	public ResponseEntity<List<Debt>> getAllDebts();
	
	@PostMapping
	public ResponseEntity<Debt> postDebt(@RequestBody Debt debt);
	
	@PutMapping
	public ResponseEntity<Debt> putDebt(@RequestBody Debt debt);
	
	@DeleteMapping("{id}")
	public ResponseEntity<Debt> deleteDebt(@PathVariable UUID id);
}
