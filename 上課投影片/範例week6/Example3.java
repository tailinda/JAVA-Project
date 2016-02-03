package Java20151022;

abstract class ShapeQ { // Shape��H���O�ŧi
	// �������
	public double x; // X�y��
	public double y; // y�y��

	abstract void area(); // ��H��k: �p�⭱�n
}

class CircleQ extends Shape { // Circle���O�ŧi
	// �������
	public double r; // �b�|

	// �غc�l
	public Circle(double x, double y, double r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}

	// ������k: ��@��H��karea()
	public void area() {
		System.out.println("�ꭱ�n: " + 3.1416 * r * r);
	}
}

// �D�{�����O
public class Example3 {
	// �D�{��
	public static void main(String[] args) {
		// Circle���O�������ܼ�
		Circle c;
		// �ŧiCircle���O���A���ܼƥB�إߪ���
		Circle c1 = new Circle(5.0, 10.0, 4.0);
		Shape c2 = new Circle(10.0, 10.0, 7.0);
		// ��ܶ��c1�����
		System.out.println("���c1����� =====");
		System.out.println("X�y��: " + c1.x);
		System.out.println("Y�y��: " + c1.y);
		System.out.println("�b�|: " + c1.r);
		c1.area(); // �I�s���󪺹�Ҥ�k
		// ��ܶ��c2�����, �ˬd�O�_��Circle�����
		if (c2 instanceof Circle)
			System.out.println("----->c2�OCircle����");
		System.out.println("���c2����� =====");
		System.out.println("X�y��: " + c2.x);
		System.out.println("Y�y��: " + c2.y);
		c = (Circle) c2; // ���A�ഫ
		System.out.println("�b�|: " + c.r);
		c2.area(); // �I�s���󪺹�Ҥ�k
	}
}