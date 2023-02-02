package com.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.Entities.Student;
import com.demo.repository.StudentRepository;

@SpringBootTest
class DemoCrud1ApplicationTests {

    @Autowired
	private StudentRepository studentRepo;
	
	@Test
	void saveOneStudent() {
		
		Student s1= new Student();
		s1.setName("maahi");
		s1.setCourse("All");
		s1.setFee(7000);
	
		studentRepo.save(s1);
	}
     @Test	
	void deleteStudent() {
studentRepo.deleteById(4L);

}
     


}