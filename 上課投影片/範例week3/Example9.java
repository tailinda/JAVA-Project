package Java20151001;

public class Example9 {
	// ���O��k: �N���ū��ন�ؤ�ū�
	static double convert2F(double c) {
		// �ܼƫŧi
		double f;
		f = (9.0 * c) / 5.0 + 32.0; // �ഫ�ū�
		return f; // �Ǧ^��
	}

	// �D�{��
	public static void main(String[] args) {
		// �إ�Scanner����
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("�п�J���ū�=> ");
		double c = sc.nextDouble();
		double f = convert2F(c); // ���O��k���I�s
		System.out.println("���" + c + " = �ؤ�" + f);
	}
}