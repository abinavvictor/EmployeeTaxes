import com.example.EmployeeTaxCal.EmployeeTaxes.Employee;
import lombok.Data;
import javax.validation.constraints.*;

@Data
public class ImagEmployee {

    @NotNull(message = "Enter a valid Employee Id")
    private Long Emp_id;

    @NotNull(message = "Enter a valid phonenumber")
    @Pattern(regexp="(^$|[0-9]{10})")
    @Size(min = 0, max = 10, message = "Phone number should be between 0 and 10 characters")
    private String empPhoneNumber;

    @NotBlank(message = "FirstName cant be empty")
    private String empFirstName;

    @NotBlank(message = "LastName cant be empty")
    private String empLastName;


    @Email(message = "Please enter a valid email Id")
    @NotNull(message = "Email cannot be NULL")
    private String empEmailId;

    @Pattern(regexp = "(19|20)[0-9][0-9]", message = "Employee joining date cannot be blank.")
    private Date empDOJ;

    @NotNull(message = "Salary cannot be NULL")
    private Double empSalary;

    @NotNull(message = "Email cannot be NULL")
    @Pattern(regexp="(^(19|20)\\d{2}$)")
    private String fiscalYear;
}
