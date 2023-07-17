package org.mma.training.java.springboot.cache.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "EMPLOYEES")
public class Employee {
	
	@GeneratedValue
	@Id
	private Long id;
	private String name;
	private String position;
	private String department;
	private String manager;
	
}
