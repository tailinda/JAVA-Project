package Java20151001;

public class Example6 {
	// �D�{��
	public static void main(String[] args) {
		// �ܼƫŧi
		int i, j;
		System.out.print("    "); // ��ܼ��D�C
		for (i = 1; i <= 9; i++)
			System.out.print(i + "      ");
		System.out.println();
		i = 1;
		while (i <= 9) { // �_���j��-�Ĥ@�hwhile�j��
			// �������D
			System.out.print(i + " ");
			for (j = 1; j <= 9; j++) {
				// �ĤG�hfor�j��
				System.out.print(i + "*" + j + "=");
				System.out.print(i * j + " ");
				if ((i * j) < 10 && j != 1)
					System.out.print(" ");// �վ���ܦ�m
			}
			i++; // �p�ƾ��ܼƥ[�@
			System.out.println();
		}
	}
}