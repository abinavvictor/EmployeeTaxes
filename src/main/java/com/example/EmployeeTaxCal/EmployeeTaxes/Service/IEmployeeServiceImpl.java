package com.example.EmployeeTaxCal.EmployeeTaxes.Service.IEmployeeServiceImpl;
import com.example.EmployeeTaxCal.EmployeeTaxes.Employee
import com.example.EmployeeTaxCal.EmployeeTaxes.Service.IEmployeeService;
import com.example.EmployeeTaxCal.EmployeeTaxes.DAO.IEmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private IEmployeeDao employeeDao;
    @Override
    public Employee save(Employee employee) {
        return employeeDao.save(employee);
    }

    @Override
    public Employee update(Employee employee) {
        return employeeDao.save(employee);
    }

    @Override
    public List<Employee> getEmployees() {
        return employeeDao.findAll();
    }

    @Override
    public Optional<Employee> getEmployeeById(Long id) {
        return employeeDao.findById(id);
    }

    @Override
    public List getTaxDed(Long Emp_id,Date fiscalYear, double empSalary) {

        List<Employee> result = new ArrayList<>();
        Double taxes = IEmployeeService.calTax();
        Employee.forEach((e) -> {

            result.add(e);
        })

         return result.add(taxes);
    }

    private Double calTax(Double empSalary, Long Emp_id) {
        if (salary <= 250000) {
            return 0;
        }
        if (salary <= 1000000) {
            return (salary - 500000) * 0.1
                    + (250000 * 0.05);
        }
        return (salary - 1000000) * 0.2 + (500000 * 0.1)
                + (250000 * 0.05);

    }
}
