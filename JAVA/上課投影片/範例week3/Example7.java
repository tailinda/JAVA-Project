package Java20151001;

public class Example7 {
	// ���O��k: ��ܰT��
	private static void printMsg() {
		System.out.println("Hello World!");
	}

	// ���O��k: ���1�[��10���`�M
	public static void add2Ten() {
		// �ܼƫŧi
		int i, total = 0;
		for (i = 1; i <= 10; i++)
			// for�j��ԭz
			total += i;
		System.out.println("1�[��10 = " + total);
	}

	// �D�{��
	public static void main(String[] args) {
		printMsg(); // �P�@�����O�����O��k�I�s
		Example7.add2Ten(); // ��L���O�����O��k�I�s
	}
}