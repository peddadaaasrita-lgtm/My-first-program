import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the Student");
		String name=sc.nextLine();
		System.out.println("Enter the marks");
	
		int marks=sc.nextInt();
			System.out.println(name+" "+"got"+" "+marks+"marks");
			System.out.println("Remarks:");
		if(marks>=80){
		    System.out.println("Excellent");
		    }else if(marks>=60&&marks<80){ 
		    System.out.println("Average");
		    }else if(marks>=40&&marks<60){
		        System.out.println("Below Average");
		
		    }else {
		        System.out.println("Fail");
		    }
		    
		sc.close();
	}
}