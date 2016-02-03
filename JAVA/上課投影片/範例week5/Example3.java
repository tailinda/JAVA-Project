package Java20151008;

class Timeee { // Time���O�ŧi
	// �������
	private int second;
	private int minute;
	private int hour;

	// ������k: �ˬd�ɶ����
	public boolean validateTime(int h, int m, int s) {
		// �ˬd�ɶ���ƬO�_�b�d��
		if (h < 0 || h > 23)
			return false;
		if (m < 0 || m > 59)
			return false;
		if (s < 0 || s > 59)
			return false;
		return true; // �X�k�ɶ����
	}

	// ������k: �]�w�ɶ����
	public boolean setTime(int h, int m, int s) {
		// �ˬd�ɶ��ѼƬO�_�X�k
		if (validateTime(h, m, s)) {
			hour = h; // �]�w�p��
			minute = m; // �]�w����
			second = s; // �]�w���
			return true; // �]�w���\
		} else
			return false; // �]�w����
	}

	// ������k: ��ܮɶ����
	public void printTime() {
		// ��X������ƪ���, ���M��
		System.out.println(hour + ":" + minute + ":" + second);
	}
}

// �D�{�����O
public class Example3 {
	// �D�{��
	public static void main(String[] args) {
		// �ŧiTime���O���A���ܼ�, �B�إߪ���
		Time open = new Time();
		Time close = new Time();
		// �I�s��Ҥ�k�]�wopen���󪺮ɶ����
		open.setTime(10, 10, 40);
		// �I�s�ƥ���k�]�wclose���󪺮ɶ����
		close.setTime(22, 30, 30);
		// �I�s���󪺹�Ҥ�kprintTime()
		System.out.print("������~�ɶ� = ");
		close.printTime();
		System.out.print("�}�l��~�ɶ� = ");
		open.printTime();
		// �ϥΪ����Ҥ�kvalidateDate()�ˬd�ɶ����
		if (close.validateTime(18, 30, 20))
			System.out.println("18:30:20�O�X�k�ɶ�!");
		if (!open.validateTime(23, 32, 60))
			System.out.println("23:32:60�O���X�k�ɶ�!");
	}
}