package day9_OOps_UC9;

public class UC3 {
	public static int Part_time = 8;
	public static int Wage_per_Hour = 20;
	public static int Full_day_Hour = 8;
	public static int Total_wage = 0;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee wage computation program");
		int status = (int) (Math.random() * 2);
		if (status == 0) {
			System.out.println("employee is Absent");
		} else if (status == 1) {
			System.out.println("employee is present");
			int status1 = (int) (Math.random() * 3);
			switch (status1) {
			case 0: {
				System.out.println("employee is Absent");
				break;
			}
			case 1: {
				System.out.println("employee is present");
				Total_wage = Full_day_Hour * Wage_per_Hour;
				break;
			}
			default: {
				System.out.println("Part time");
				Total_wage = Wage_per_Hour * Part_time;
				break;
			}
			}
			System.out.println(Total_wage);
		}
	}

}
