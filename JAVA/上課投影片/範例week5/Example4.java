package Java20151008;

class Timee { // Time���O�ŧi
	// �������
	private int second;
	private int minute;
	private int hour;

	// �غc�l(1): �S���Ѽ�
	public Time() {
		// �]�w�ɶ���ƹw�]��
		hour = 12;
		minute = 30;
		second = 10;
	}

	// �غc�l(2): �ϥΰѼƳ]�w������ƪ�l��
	public Time(int h, int m, int s) {
		// �ˬd�ɶ��ѼƬO�_�X�k
		if (validateTime(h, m, s)) {
			hour = h; // �]�w�p��
			minute = m; // �]�w����
			second = s; // �]�w���
		} else { // �]�w�ɶ���ƹw�]��
			hour = 12;
			minute = 30;
			second = 10;
		}
	}

	// ������k: �ˬd�ɶ����
	private boolean validateTime(int h, int m, int s) {
		// �ˬd�ɶ���ƬO�_�b�d��
		if (h < 0 || h > 23)
			return false;
		if (m < 0 || m > 59)
			return false;
		if (s < 0 || s > 59)
			return false;
		return true; // �X�k�ɶ����
	}

	// ������k: �Ǧ^�p��
	public int getHour() {
		return hour;
	}

	// ������k: �Ǧ^����
	public int getMinute() {
		return minute;
	}

	// ������k: �Ǧ^���
	public int getSecond() {
		return second;
	}

	// ������k: ��ܮɶ����
	public void printTime() {
		// ��X������ƪ���, ���M��
		System.out.println(hour + ":" + minute + ":" + second);
	}
}

// �D�{�����O
public class Example4 {
	// �D�{��
	public static void main(String[] args) {
		// �ܼƫŧi
		int hour, minute, second;
		// �ŧiTime���O���A���ܼ�, �B�إߪ���
		Time open = new Time(10, 10, 40);
		Time now = new Time();
		// �I�s��Ҥ�k��ܮɶ����
		System.out.print("�}�l��~�ɶ� = ");
		open.printTime();
		System.out.print("�{�b�ɶ� = ");
		now.printTime();
		// �I�s��Ҥ�k���o�ɶ����
		hour = open.getHour();
		minute = open.getMinute();
		second = open.getSecond();
		System.out.print("�}�l��~�ɶ� = "); // ��ܮɶ�
		System.out.println(hour + "-" + minute + "-" + second);
	}
}