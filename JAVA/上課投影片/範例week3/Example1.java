package Java20151001;

public class Example1 {
	// �D�{��
	public static void main(String[] args) {
		// �إ�Scanner����
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("�п�̤j��=> ");
		int max = sc.nextInt();
		int counter, sum = 0; // �ܼƫŧi
		// ���Wfor�j��ԭz
		for (counter = 1; counter <= max; counter++) {
			System.out.print("|" + counter);
			sum += counter;
		}
		System.out.println("\n�q1��max���`�M: " + sum);
		System.out.println(" ----------------- ");
		// ����for�j��ԭz
		for (sum = 0, counter = max; counter >= 1; counter--) {
			System.out.print("|" + counter);
			sum += counter;
		}
		System.out.println("\n�qmax��1���`�M: " + sum);
	}
}