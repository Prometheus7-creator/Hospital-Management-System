package com.hospital.management.entity;

import java.util.*;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employee extends Person{
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long eid;
	@Column private Date joinDate;
	@Column private String role;
	@Column private String qualification;
	@Column private String salary;
	
}