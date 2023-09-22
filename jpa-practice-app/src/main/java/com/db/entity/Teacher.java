package com.db.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Teacher {
	
	@SequenceGenerator(
			name = "teacher_sequence",
			sequenceName = "teacher_sequence",
			allocationSize = 2
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator ="teacher_sequence"
			
			)
	@Id
	private long teacherId;
	private String name;
	private String email;
	
	

}
