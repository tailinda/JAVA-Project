package work6;

import java.util.Scanner;

public class exp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empolyee[] HTC = new Empolyee[5];
		Scanner scanner = new Scanner(System.in);
		int i, sum = 0;
		for(i = 0; i < HTC.length ; i++){
			HTC[i] = new Empolyee();
			System.out.println("���u" + i + "�~��:");
			HTC[i].setSalary(scanner.nextInt());
		}
		System.out.println("���u�s��\t�~��");
		for(i = 0; i < HTC.length ; i++){
			System.out.println(i + "           " + HTC[i].getSalary());
			sum += HTC[i].getSalary();
		}
		System.out.println("total     " + sum);
		System.out.println("����             " + (sum/5.0));
	}

}
