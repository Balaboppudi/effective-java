import java.util.Objects;
import java.util.function.Predicate;

public class EmployeeDetails {

	public Employee getEmployeeById(Integer id) throws IllegalArgumentException {
		Objects.requireNonNull(id);
		Predicate<Employee> idFinder = (empId) -> empId.getEmpId().equals (id);
		return EmployeesContainer.getEmployees().stream().filter(idFinder).findFirst()
				.orElseThrow(IllegalArgumentException::new);

	}

	public String getNameById(Integer id) throws IllegalArgumentException {
		Objects.requireNonNull(id);
		Predicate<Employee> idFinder = (empId) -> empId.getEmpId().equals (id);
		return EmployeesContainer.getEmployees().stream().filter(idFinder).findFirst().map(Employee::getName)
				.orElse("No Employee Found");

	}
}
