package com.sales.teste.alelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.sales.teste.alelo.entity.Person;
import com.sales.teste.alelo.entity.PersonType;
import com.sales.teste.alelo.entity.repository.PersonRepository;

@Component
public class InitPerson implements ApplicationListener<ApplicationReadyEvent>{
	
	@Autowired
	private PersonRepository personRepository;

	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {

		if (!personRepository.findByLegalName("FULANO").isPresent()) {
			Person person1 = Person.builder()
					.withAge(33)
					.withLegalName("FULANO")
					.withPersonType(PersonType.INDIVIDUAL)
					.build();
			
			personRepository.save(person1);
		}
		
		if (!personRepository.findByLegalName("CICLANO S.A.").isPresent()) {
			Person person2 = Person.builder()
					.withAge(25)
					.withLegalName("CICLANO S.A.")
					.withPersonType(PersonType.CORPORATE)
					.build();
			
			personRepository.save(person2);
		}

		if (!personRepository.findByLegalName("BEUTRANO").isPresent()) {
			Person person3 = Person.builder()
					.withAge(40)
					.withLegalName("BEUTRANO")
					.withPersonType(PersonType.INDIVIDUAL)
					.build();
			
			personRepository.save(person3);
		}
		
	}
}
