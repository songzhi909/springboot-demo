package com.songzhi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.songzhi.domain.Employee;

public interface EmployeeRepository extends JpaRepository<Employee , String> {

}
