package com.suraj.placement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.suraj.placement.repository.StudentRepository;
import com.suraj.placement.entity.placementDetail;
@Service
public class StudentServices {
@Autowired
StudentRepository StudentRepository;

public placementDetail save(placementDetail emp) {
return StudentRepository.save(emp);
}

public placementDetail getEmployee(int id) {
return StudentRepository.findById(id).get();
}

public placementDetail update(int id,placementDetail emp) {
placementDetail emps=StudentRepository.findById(id).get();
emps.setName(emp.getName());
emps.setQualification(emp.getQualification());
emps.setYear(emp.getYear());
emps.setDate(emp.getDate());
emps.setCollege(emp.getCollege());
return StudentRepository.save(emps); 
}


public String delete(int id)
{
StudentRepository.deleteById(id);
return "Entity deleted : " +id;
}

public List<placementDetail> getEmplist()
{
return StudentRepository.findAll();
}

public StudentRepository getStudentRepository() {
	return StudentRepository;
}

public void setStudentRepository(StudentRepository studentRepository) {
	StudentRepository = studentRepository;
}


}
