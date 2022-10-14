package day9_OOps_UC9;

public class UC1 {
	public static void main(String[] args) {
        System.out.println("Welcome to Employee wage computation program");
        int randomCheck = (int)(Math.random()*2);
        if(randomCheck == 0){
            System.out.println("employee is Absent");
        }
        else if(randomCheck == 1){
            System.out.println("employee is present");
        }
    }
}
