package com.sales.teste.alelo.api;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.sales.teste.alelo.entity.Debt;

@Component
public class DebtApiImpl implements DebtApi {

	@Override
	public ResponseEntity<Debt> getDebt(UUID id) {
		
		Debt debt = Debt.builder().withDescription("Teste").withValue(new BigDecimal(100)).build();
		
		return ResponseEntity.ok(debt);
	}
	
	@Override
	public ResponseEntity<List<Debt>> getAllDebts() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public ResponseEntity<Debt> postDebt(Debt debt) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public ResponseEntity<Debt> putDebt(Debt debt) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public ResponseEntity<Debt> deleteDebt(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}
}
