package Statements;

public class ControlStatements {
	public static void main(String[] args) {
		int i=85;
		if(i>=40 && i<=50) {
			System.out.println("E Grade");
		}
		else if(i>50 && i<=60){
			System.out.println("D Grade");
		}
		else if(i>60 && i<=70){
			System.out.println("C Grade");
		}
		else if(i>71 && i<=80){
			System.out.println("B Grade");
		}
		else if(i>80 && i<=90){
			System.out.println("A Grade");
		}
		else if(i>90 && i<=100){
			System.out.println("S Grade");
		}
		else {
			System.out.println("Fail");
		}
		
	}

}
