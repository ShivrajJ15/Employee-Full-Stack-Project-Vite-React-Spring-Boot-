package org.shiv.emp.service;

import org.shiv.emp.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getAllEmployees();

    void deleteEmployee(Long employeeId);


    EmployeeDto updateEmployee(Long employeeId,EmployeeDto updatedEmployee);


}
