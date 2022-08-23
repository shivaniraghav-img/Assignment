import java.util.Scanner;
public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char operator;
		Double number1, number2,result;
		
		//Creating an object of Scanner class
		Scanner s = new Scanner(System.in);
		
		//asking user to enter operator
		System.out.println("Choose an operator: +,-,*or /");
		operator = s.next().charAt(0);
		
		//asking user to enter numbers
		System.out.println("Enter first number");
		number1= s.nextDouble();
		
		System.out.println("Enter second number");
		number2= s.nextDouble();
		
		switch(operator) {
		
		//performing addition between two numbers
		case '+':
			result= number1 + number2;
			System.out.println(number1+ "+" +number2 + "=" + result);
			break;
			
		case '-':
			result= number1 - number2;
			System.out.println(number1+ "-" +number2 + "=" + result);
			break;
			
		case '*':
			result= number1 * number2;
			System.out.println(number1+ "*" +number2 + "=" + result);
			break;
			
		case '/':
			result= number1 / number2;
			System.out.println(number1+ "/" +number2 + "=" + result);
			break;
			
		default:
			System.out.println("Invalid operator!");
			break;
			
		}
		s.close();
				
		}

	


	}


