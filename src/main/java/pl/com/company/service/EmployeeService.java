package pl.com.company.service;

import pl.com.company.controller.cview.EmployeeView;
import pl.com.company.model.Employee;

import java.math.BigDecimal;
import java.util.List;

public interface EmployeeService {

    Employee create(EmployeeView employeeview);

    Employee get(String pesel);

    List<Employee> getAll();

    boolean delete(String pesel);

    Employee update(EmployeeView employee);

}
