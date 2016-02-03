package project1;
import java.util.Scanner;
public class HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int total;
		double tax;
		System.out.print("½Ð¿é¤J©Ò±o²bÃB:");
		total = sc.nextInt();
		if(total <= 370000){
			tax= (total*0.06);
			System.out.println("¦©µ|ª÷ÃB:"+tax);
		}
		else if(370001 <= total && total <= 990000){
			tax= (22200+((total-370000)*0.13));
			System.out.println("¦©µ|ª÷ÃB:"+tax);
		}
		else if (990001 <= total && total <= 1980000){
			tax= (102800+((total-990000)*0.21));
			System.out.println("¦©µ|ª÷ÃB:"+tax);
		}
		else if (1980001 <= total && total <= 3720000){
			tax= (310700+((total-1980000)*0.3));
			System.out.println("¦©µ|ª÷ÃB:"+tax);
		}
		else {
			tax= (832700+((total-3720000)*0.4));
			System.out.println("¦©µ|ª÷ÃB:"+tax);
		}
	}

}
