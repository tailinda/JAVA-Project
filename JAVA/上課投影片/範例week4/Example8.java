package Java20151001;

public class Example8 {
	// ���O��k: ��ܦr���T����
	static void printTriangle(char ch, int level) {
		// �ܼƫŧi
		int i, j;
		for (i = 1; i <= level; i++) { // �Ĥ@�hfor�j��
			// �ĤG�hfor�j��
			for (j = 1; j <= i; j++)
				System.out.print(ch);
			System.out.println();
		}
	}

	// ���O��k: �p��1��N���`�M
	static void add2N(int max) {
		// �ܼƫŧi
		int i, total = 0;
		for (i = 1; i <= max; i++)
			// for�j��ԭz
			total += i;
		System.out.println("1�[��" + max + " = " + total);
	}

	// �D�{��
	public static void main(String[] args) {
		// �إ�Scanner����
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("�п�J�T���γ̤j�h��=> ");
		int level = sc.nextInt();
		printTriangle('@', level); // ���O��k���I�s
		System.out.println("�п�J1�[��N���̤j��=> ");
		int max = sc.nextInt();
		add2N(max); // ���O��k���I�s
	}
}