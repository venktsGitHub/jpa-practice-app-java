package com.db.repo;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

@SpringBootTest
public class StudentTestClass {


	@Autowired
	private StudentRepo sRepo;
	
	@Autowired
	private TeacherRepo tRepo;
	
//	@Test
//	void addStudentDetails() {
//		
//		Teacher teach = Teacher.builder().name("Rajech").email("b1315@gmail.com").build();
//		
//		Student st = Student.builder()
//						.fName("venkat")
//						.lName("Mogga")
//						.dob(Date.valueOf("1930-05-11"))
//						.address("trichy")
//						.teacher(teach)
//						.build();
//		
//		sRepo.save(st);
//	}
//
//	@Test
//	void findByLname() {
//		
//		Pageable firstPage = PageRequest.of(0, 2); 
//		
//		System.out.println(sRepo.findAll(firstPage).getContent());
//	}

	
	@Test
	void findTeachers() {
		
		System.out.println("AARYA is ____");
		System.out.println(tRepo.findById((long) 1).get());
	}
	
	
	
}
