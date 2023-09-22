package com.db.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@ToString(exclude = "teacher")
public class Student {

	@Id
	@SequenceGenerator(
			name = "student_sequence",
			sequenceName = "student_sequence",
			allocationSize = 1)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "student_sequence"
			)
	private long studentId;
	
	private String fName;
	private String lName;
	private Date dob;
	private String address;
	
	@ManyToOne(
			cascade = CascadeType.ALL,
			fetch = FetchType.EAGER
			)
	@JoinColumn(
			name = "teacher_id",
			referencedColumnName = "teacherId",
			foreignKey = @ForeignKey(name="FK_TEACHER_ID")
			)
	private Teacher teacher;
	
}
