
public class Employee {

	private Integer empId;
	private Integer salary;
	private String name;
	private String departmant;
	
	public Employee() {
		
	}
	
	public Employee(Integer empId, Integer salary, String name, String departmant) {
		super();
		this.empId = empId;
		this.salary = salary;
		this.name = name;
		this.departmant = departmant;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartmant() {
		return departmant;
	}
	public void setDepartmant(String departmant) {
		this.departmant = departmant;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", salary=" + salary + ", name=" + name + ", departmant=" + departmant
				+ "]";
	}
	
	
	
	
}
