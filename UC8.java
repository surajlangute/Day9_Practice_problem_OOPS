package day9_OOps_UC9;

import java.util.Scanner;

public class UC8 {
	public static int Total_Hours = 100;
	public static int Days = 20;
	public static int Part_time = 8;
	public static int Wage_per_Hour = 20;
	public static int Full_day_Hour = 8;
	public static int Total_wage = 0;

	public static void main(String[] args) {
	        System.out.println("Welcome to Employee wage computation program");
	        int status = (int)(Math.random()*2);
	        if(status == 0){
	            System.out.println("employee is Absent");
	        }
	        else if(status == 1){
	            System.out.println("employee is present");
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter wage per hour");
	        Wage_per_Hour = in.nextInt();
	        System.out.print("Enter full day hour");
	        Full_day_Hour = in.nextInt();
	        System.out.print("Enter part time ");
	        Part_time = in.nextInt();
	        System.out.print("Enter working Days");
	        Days = in.nextInt();
	        System.out.print("Enter Total hours");
	        Total_Hours =in.nextInt();
	        employeeWage(Wage_per_Hour,Full_day_Hour,Part_time);
	        in.close();
	    }
	}

	public static void employeeWage(int Wage_per_hour, int Fulldayhour, int parttime) {
		while (Days > 0 && Total_Hours > 0) {
			int status = (int) (Math.random() * 3);
			if (Total_Hours < 8 && status != 0) {
				System.out.println("remaining Hours  " + Days);
				Total_wage += Wage_per_Hour * Total_Hours;
				System.out.println(Total_wage);
				break;
			}

			switch (status) {
			case 0: {
				System.out.println("employee is Absent");
				break;
			}
			case 1: {
				System.out.println("employee is present");
				Total_wage += Full_day_Hour * Wage_per_Hour;
				Total_Hours -= Full_day_Hour;
				break;
			}
			default: {
				System.out.println("Part time");
				Total_wage += Wage_per_Hour * Part_time;
				Total_Hours -= Full_day_Hour;
				break;
			}
			}
			Days--;
			System.out.println("remaining Hours  " + Days);
			System.out.println(Total_wage);
		}
	}
}
