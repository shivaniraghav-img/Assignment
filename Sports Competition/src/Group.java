import java.util.Scanner;
public class Group {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Ënter your roll_no");
		int roll_no= sc.nextInt();
		
		if (roll_no%4==1) {
			System.out.println("Sapphire Group");
		}
		else if(roll_no%4==2) {
				System.out.println("Pearl Group");
		}
		else if(roll_no%4==3) {
			System.out.println("Ruby Group");
		}
		else if(roll_no%4==0) {
				System.out.println("Emerald Group");
		}
		
          sc.close();
	}


	}


