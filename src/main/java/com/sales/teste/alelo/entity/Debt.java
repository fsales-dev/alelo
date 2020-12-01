package com.sales.teste.alelo.entity;

import java.math.BigDecimal;
import java.util.UUID;
import javax.annotation.Generated;

public class Debt {

	private UUID id;
	
	private BigDecimal value;
	
	private String description;
	
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

	public Debt() {
		
	}

	@Generated("SparkTools")
	private Debt(Builder builder) {
		this.id = builder.id;
		this.value = builder.value;
		this.description = builder.description;
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

		public Debt build() {
			return new Debt(this);
		}
	}
	
	
}
