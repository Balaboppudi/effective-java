@FunctionalInterface
public interface EmployeeSupplier {

	Employee get(Integer empId, Integer salary, String name, String departmant);
}
