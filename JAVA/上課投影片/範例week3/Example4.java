package Java20151001;

public class Example4 {
	// �D�{��
	public static void main(String[] args) {
		// �إ�Scanner����
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("�п�ūפU��=> ");
		int lower = sc.nextInt(); // �ūפU��
		System.out.print("�п�ūפW��=> ");
		int upper = sc.nextInt(); // �ūפW��
		int c = lower, step = 10; // �W�q
		double f;
		System.out.println("���\t�ؤ�");
		do { // do/while�j��ԭz
			f = (9.0 * c) / 5.0 + 32.0;
			System.out.println("���: " + c);
			System.out.println("=>�ؤ�: " + f);
			c += step;
		} while (c <= upper);
	}
}