package Java20151001;

public class Example5 {
	// �D�{��
	public static void main(String[] args) {
		// �إ�Scanner����
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("�п�̤j��=> ");
		int max = sc.nextInt();
		int i = 1, sum = 0; // �ܼƫŧi
		do { // do/while�j��ԭz
			System.out.print("|" + i);
			sum += i;
			i++;
			if (i > max)
				break; // ���X�j��
		} while (true);
		System.out.println("\n�`�M: " + sum);
		for (sum = 0, i = 1; i <= max; i++) { // for�j��ԭz
			if ((i % 2) == 1)
				continue; // �~��j��
			System.out.print("|" + i);
			sum += i;
		}
		System.out.println("\n���ƪ��`�M: " + sum);
	}
}