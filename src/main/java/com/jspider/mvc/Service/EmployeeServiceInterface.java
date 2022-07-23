package com.jspider.mvc.Service;

import java.util.List;

import com.jspider.mvc.DTO.EmployeeDTO;

public interface EmployeeServiceInterface {

	EmployeeDTO insert(String name, String email, String designation, String userName, String password);

	EmployeeDTO remove(int id);

	List<EmployeeDTO> findAllEmployees();

	EmployeeDTO search(int id);

	EmployeeDTO login(String userName, String password);

	void update(int id, String name, String email, String designation, String userName, String password);
}
