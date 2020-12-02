package com.sales.teste.alelo.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Debt {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	
	private BigDecimal value;
	
	private String description;
	
	private LocalDate dueDate;
	
	@ManyToOne
	@JoinColumn(name = "id", insertable = false, updatable = false)
	private Person person;

	@Generated("SparkTools")
	private Debt(Builder builder) {
		this.id = builder.id;
		this.value = builder.value;
		this.description = builder.description;
		this.dueDate = builder.dueDate;
	}
	
	public Debt() {}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	/**
	 * Creates builder to build {@link Debt}.
	 * @return created builder
	 */
	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link Debt}.
	 */
	@Generated("SparkTools")
	public static final class Builder {
		private UUID id;
		private BigDecimal value;
		private String description;
		private LocalDate dueDate;

		private Builder() {
		}

		public Builder withId(UUID id) {
			this.id = id;
			return this;
		}

		public Builder withValue(BigDecimal value) {
			this.value = value;
			return this;
		}

		public Builder withDescription(String description) {
			this.description = description;
			return this;
		}

		public Builder withDueDate(LocalDate dueDate) {
			this.dueDate = dueDate;
			return this;
		}

		public Debt build() {
			return new Debt(this);
		}
	}
	
	
	
}
