import com.example.EmployeeTaxCal.EmployeeTaxes.Employee;
import com.example.EmployeeTaxCal.EmployeeTaxes.Controller.EmpController;
import com.example.EmployeeTaxCal.EmployeeTaxes.Service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class EmployeeController {

    @Autowired
    IEmployeeService employeeService;
    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("employees")
    public List<Employee> getEmployees(){
        return employeeService.getEmployees();
    }

    @GetMapping("employees/{id}")
    public Employee getEmployee(@PathVariable("id") Long id){
        return employeeService.getEmployeeById(id).get();
    }

    @GetMapping("employees/{id}")
    public Employee getEmployeeTaxDeductions(@PathVariable("id") Long id, Date fiscalYear, Double empSalary){
        return employeeService.getTaxDed();
    }

    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.save(employee);
    }
    @PutMapping("employees/{id}")
    public Employee updateEmployee(@RequestBody Employee employee,@PathVariable long id){
        Employee emp=employeeService.getEmployeeById(id).get();
        emp.setAge(employee.getAge());
        emp.setEmail(employee.getEmail());
        emp.setFullName(employee.getFullName());
        emp.setPhoneNumber(employee.getPhoneNumber());
        return employeeService.update(emp);
    }

}
