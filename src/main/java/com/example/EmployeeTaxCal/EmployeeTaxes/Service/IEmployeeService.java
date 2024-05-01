package com.example.EmployeeTaxCal.EmployeeTaxes.Service;
import com.example.EmployeeTaxCal.EmployeeTaxes.Employee;
import java.util.List;
import java.util.Optional;

public interface IEmployeeService {

    public Employee save(Employee employee);
    public Employee update(Employee employee);
    public List<Employee> getEmployees();
    public Optional<Employee> getEmployeeById(Long id);
    public Optional<Employee> getTaxDed(Long id,Date fiscalYear,double empSalary )

}