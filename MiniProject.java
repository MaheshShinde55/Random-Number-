package randomNumber;
import java.util.Scanner;
public class MiniProject {

	public static void main(String[] args) {
		// Random Number Mini Project
		int MyNum=(int)(Math.random()*10);
				int i=0;
	
		Scanner sc = new Scanner(System.in);
		
	do {	System.out.print("Guess The random number in between 0 to 100 : ");
		int UserIn= sc.nextInt();
		if(UserIn==MyNum) {
			System.out.println("HURREYYYY........YOU GUESS THE CORRECT NUMBER !!!!!!");
			break;
			
		}
		if(UserIn<MyNum) {
			System.out.println("Your guess is too small !!!");
		}else {
			System.out.println("Your guess is too big !!!");
		}
		i++;
	}
	while(true) ;
		
		System.out.println(" Mahesh !!!");
	}
}


