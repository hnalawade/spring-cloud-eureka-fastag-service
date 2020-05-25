package com.demo.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FastagCustomer {

	@Id
	private Integer fastagId;
	private String customerName;
	private String phone;
	private BigDecimal currentBalance;

}
