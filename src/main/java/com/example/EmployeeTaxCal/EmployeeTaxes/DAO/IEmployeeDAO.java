package com.example.EmployeeTaxCal.EmployeeTaxes.DAO;
import com.example.EmployeeTaxCal.EmployeeTaxes.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface IEmployeeDao extends PagingAndSortingRepository<Employee,Long> {
    public Optional<Employee> findById(Long id);

   public  Page<Employee> findAll(Pageable pageable);

}
