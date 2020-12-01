package com.sales.teste.alelo.entity;

import java.util.List;
import java.util.UUID;
import javax.annotation.Generated;
import java.util.Collections;

public class Person {

	private UUID id;
	
	private String name;
	
	private Integer age;
	
	private PersonType personType;
	
	private List<Debt> debts;

	public Person() {}

	@Generated("SparkTools")
	private Person(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.age = builder.age;
		this.personType = builder.personType;
		this.debts = builder.debts;
	}
	
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public PersonType getPersonType() {
		return personType;
	}

	public void setPersonType(PersonType personType) {
		this.personType = personType;
	}

	public List<Debt> getDebts() {
		return debts;
	}

	public void setDebts(List<Debt> debts) {
		this.debts = debts;
	}

	/**
	 * Creates builder to build {@link Person}.
	 * @return created builder
	 */
	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link Person}.
	 */
	@Generated("SparkTools")
	public static final class Builder {
		private UUID id;
		private String name;
		private Integer age;
		private PersonType personType;
		private List<Debt> debts = Collections.emptyList();

		private Builder() {
		}

		public Builder withId(UUID id) {
			this.id = id;
			return this;
		}

		public Builder withName(String name) {
			this.name = name;
			return this;
		}

		public Builder withAge(Integer age) {
			this.age = age;
			return this;
		}

		public Builder withPersonType(PersonType personType) {
			this.personType = personType;
			return this;
		}

		public Builder withDebts(List<Debt> debts) {
			this.debts = debts;
			return this;
		}

		public Person build() {
			return new Person(this);
		}
	}
}
