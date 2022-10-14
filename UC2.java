package day9_OOps_UC9;

public class UC2 {
	 public static int Wage_per_Hour = 20;
	 public static int Full_day_Hour = 8;
	 public static int Total_wage=0;
	    public static void main(String[] args) {
	        System.out.println("Welcome to Employee wage computation program");
	        int randomCheck = (int)(Math.random()*2);
	        if(randomCheck == 0){
	            System.out.println("employee is Absent");
	        }
	        else if(randomCheck == 1){
	            System.out.println("employee is present");
	            Total_wage = Full_day_Hour*Wage_per_Hour;
	        }
	        System.out.println(Total_wage);
	    }
}
