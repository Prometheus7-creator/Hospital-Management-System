package com.hospital.management.entity;

import java.util.Date;
import java.util.List;

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
public class Patient extends Person{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long pid;
	@Column private Date registrationDate;
	@Column private String bloodGroup;
	@Column private String doctorId;
}