package Java20151008;

public class Example {

	public static void main(String[] args) {
		int i, sum = 0;
		double average, total = 0.0;
		int[] temp; // �ŧi�}�C�ܼ�
		int[] grades = { 87, 78, 95 }; // �إ�int�}�C
		// �إ�double�}�C
		double[] sales = new double[4];
		sales[0] = 145.6;sales[1] = 178.9;
		sales[2] = 197.3;sales[3] = 156.7;
				
		temp = grades;
		// �ϥΰj����ܰ}�C�ȩM�p���`�M
		for (int ele : temp) {
			sum += ele;
			System.out.print("| " + ele);
		}
		System.out.println("\n���Z�`��: " + sum);
		// �ϥΰj����ܰ}�C�ȩM�p�⥭��
		for (i = 0; i < sales.length; i++) {
			total += sales[i];
			System.out.print("| " + sales[i]);
		}
		System.out.println("\n�~�Z�`�M: " + total);
		average = total / (double) sales.length;
		System.out.println("�����~�Z: " + average);
	}
}
