import java.util.HashSet;
import java.util.Set;

public class EmployeesContainer {

	private static Set<Employee> employees=new HashSet<>();
	static {
		EmployeeSupplier s=(id,sal,name,dept)->new Employee(id,sal,name,dept);
		for(int i=1;i<=10;i++) {
			employees.add(s.get(i, 12000, "Employee"+i, "Dept"+i));
		}
		
	}
	
	public  static Set<Employee> getEmployees(){
		return employees;
	}
}
