package project1;
import java.util.Scanner;
public class homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("½Ð¿é¤J©Ò±o²bÃB=>");
		float total=sc.nextFloat();
		float tax;
		
		if(total>0&&total<=370000){
			tax=(total*0.06);
			System.out.println("¦©µ|ª÷ÃB"+tax);
		}
		else if(total>370000&&total<=990000){
			tax=(22200+((total-370000)*0.13));
			tax=total-370000;;
			System.out.println("¦©µ|ª÷ÃB"+tax);
		}
		else if(total>990000&&total<=1980000){
			tax=370000*0.06+620000*0.13+((total-990000)*0.21);
			System.out.println("¦©µ|ª÷ÃB"+tax);
		}
		else if(total>1980000&&total<=3720000){
			tax=370000*0.06+620000*0.13+990000*0.21+((total-1980000)*0.3);
			System.out.println("¦©µ|ª÷ÃB"+tax);
		}
		else{
			tax=370000*0.06+620000*0.13+990000*0.21+1740000*0.3+((total-3720000)*0.4);
			System.out.println("¦©µ|ª÷ÃB"+tax);
		}
	}

}
