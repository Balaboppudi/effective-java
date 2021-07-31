
public class ValidateMethodArgs {
	public static EmployeeDetails employeeDetails=new EmployeeDetails();
	public static void main(String[] args) {
	Employee employee=employeeDetails.getEmployeeById(1);
	System.out.println(employee);
	String employeeName=employeeDetails.getNameById(9);
	System.out.println(employeeName);
	
	employeeDetails.getNameById(null);
	
	}
}
