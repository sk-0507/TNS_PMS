package com.suraj.placement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.suraj.placement.service.StudentServices;
import com.suraj.placement.entity.placementDetail;
@RestController
@RequestMapping("/placement")
public class StudentController {
@Autowired
StudentServices studentServices;

public StudentServices getStudentServices() {
	return studentServices;
}

public void setStudentServices(StudentServices studentServices) {
	this.studentServices = studentServices;
}

@PostMapping("/create")
public placementDetail addplacementDetail(@RequestBody placementDetail placement) {
	return studentServices.save(placement);
}

@GetMapping(path="/{id}")
public placementDetail getplacementDetail(@PathVariable int id)
{
return studentServices.getEmployee(id); 
}

@PutMapping(path="/{id}") 
public placementDetail updateplacementdetails(@RequestBody placementDetail emp,@PathVariable int id)
{
return studentServices.update(id,emp); 
}

@DeleteMapping(path="/{id}")
public String deleteplacementDetail(@PathVariable int id)
{
return studentServices.delete(id); 
}

@GetMapping
public List<placementDetail> getAllEmployee()
{
return studentServices.getEmplist();
}



}
