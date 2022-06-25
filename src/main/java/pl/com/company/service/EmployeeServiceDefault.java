package pl.com.company.service;

import pl.com.company.controller.cview.EmployeeView;
import pl.com.company.model.Employee;
import java.util.List;

public class EmployeeServiceDefault implements EmployeeService {

    @Override
    public Employee create(EmployeeView employeeview) {
        return null;
    }

    @Override
    public Employee get(String pesel) {
        return null;
    }

    @Override
    public List<Employee> getAll() {
        return null;
    }

    @Override
    public boolean delete(String pesel) {
        return false;
    }

    @Override
    public Employee update(EmployeeView employee) {
        return null;
    }
}
