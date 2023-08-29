import java.util.Scanner;

public class IfStatements {
	public void statements() {
		System.out.println("Enter the mark:");
		Scanner S = new Scanner(System.in);
		int i = S.nextInt();
		if(i>=40 && i<=50) {
			System.out.println("Pass-'E'Grade");
		}
		else if (i>50 && i<=60) {
			System.out.println("Pass-'D'Grade ");	
		}
		else if (i>60 && i<=70) {
			System.out.println("Pass-'C'Grade ");	
		}
		else if (i>70 && i<=80) {
			System.out.println("Pass-'B'Grade ");	
		}
		else if (i>80 && i<=90) {
			System.out.println("Pass-'A'Grade ");	
		}
		else if (i>90 && i<=100) {
			System.out.println("Pass-'S'Grade ");	
		}
		else  {
			System.out.println("Fail");
		}
		
	}
	public static void main(String[] args) {
		IfStatements I = new IfStatements();
		I.statements();
		
	
		
	}

}
