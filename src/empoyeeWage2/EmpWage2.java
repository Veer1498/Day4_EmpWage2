package empoyeeWage2;

public class EmpWage2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		System.out.println("Welcome to Employee Wage Computation Program");
		int employeePresent = 1;
		int isPresent = (int) Math.floor(Math.random()*10) %2;
		if (isPresent == employeePresent)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}

}
