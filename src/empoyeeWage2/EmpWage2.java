package empoyeeWage2;

public class EmpWage2 {
	public static final int employeePresent = 1;
	public static final int employeePartTime = 2;
	public static final int WagePerHour = 20;
	public static final int NumberOfWorkingDays =20;
	public static final int TotalHoursinMonth = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		System.out.println("Welcome to Employee Wage Computation Program");
	
		int numberOfHours = 0;
		int empWagePerDay = 0;
		int totalWorkDays = 0 , totalWorkHours = 0;
		int totalEmployeeWage =0;
		while (totalWorkHours<= TotalHoursinMonth && totalWorkDays < NumberOfWorkingDays) {
		totalWorkHours++;
		totalWorkDays++;
		int isPresent = (int) Math.floor(Math.random()*10) %3;
		switch (isPresent) {
			case employeePresent :
				numberOfHours =8;
				break;
			case employeePartTime :
				numberOfHours =4;
				break;
			default :
				numberOfHours = 0;
		}
		totalWorkHours += numberOfHours;
		System.out.println("day  = " + totalWorkDays + " No. of Hours = " +numberOfHours);
		}
		totalEmployeeWage= totalWorkHours * WagePerHour;
		System.out.println("Total Employee Wage is "+ totalEmployeeWage);
	}

}
