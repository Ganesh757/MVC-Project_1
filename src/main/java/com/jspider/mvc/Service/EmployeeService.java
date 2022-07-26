package com.jspider.mvc.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.mvc.DAO.EmployeeDAO;
import com.jspider.mvc.DTO.EmployeeDTO;

@Service
public class EmployeeService implements EmployeeServiceInterface {
	@Autowired
	private EmployeeDAO dao;

	@Override
	public EmployeeDTO insert(String name, String email, String designation, String userName, String password) {
		EmployeeDTO employee = dao.insert(name, email, designation, userName, password);
		return employee;
	}

	@Override
	public EmployeeDTO remove(int id) {
		EmployeeDTO employee = dao.search(id);
		if (employee != null) {
			dao.remove(id);
			return employee;
		}
		return null;

	}

	@Override
	public List<EmployeeDTO> findAllEmployees() {
		List<EmployeeDTO> employees = dao.findAllEmployees();
		return employees;
	}

	@Override
	public EmployeeDTO search(int id) {
		EmployeeDTO employee = dao.search(id);
		return employee;
	}

	@Override
	public EmployeeDTO login(String userName, String password) {
		EmployeeDTO employee = dao.login(userName, password);
		if (employee != null) {
			return employee;
		}
		return null;
	}

	@Override
	public void update(int id, String name, String email, String designation, String userName, String password) {
		dao.update(id, name, email, designation, userName, password);
	}
}
