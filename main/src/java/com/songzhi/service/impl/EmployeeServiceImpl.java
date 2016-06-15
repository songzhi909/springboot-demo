package com.songzhi.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.songzhi.dao.EmployeeRepository;
import com.songzhi.domain.Employee;
import com.songzhi.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService   {
  private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeServiceImpl.class);
  private final EmployeeRepository repository;
  
  @Autowired
  public EmployeeServiceImpl(EmployeeRepository repository) {
    this.repository = repository;
  }
  
  /* (non-Javadoc)
   * @see com.songzhi.service.impl.EmployeeService#save(com.songzhi.domain.Employee)
   */
  @Override
  @Transactional
  public Employee save(Employee employee) {
    LOGGER.debug("Creating {}", employee);
    return repository.save(employee);
  }
  
  /* (non-Javadoc)
   * @see com.songzhi.service.impl.EmployeeService#findAll()
   */
  @Override
  @Transactional
  public List<Employee> findAll() {
    LOGGER.debug("Retrieving the list of all users");
    return repository.findAll();
  }
  
}
