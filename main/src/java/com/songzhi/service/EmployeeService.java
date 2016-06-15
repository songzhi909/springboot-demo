package com.songzhi.service;

import java.util.List;

import com.songzhi.domain.Employee;

public interface EmployeeService {

  Employee save(Employee employee);

  List<Employee> findAll();

}