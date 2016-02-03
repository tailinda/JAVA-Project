package Java20151001;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int level = 1, n = 1;

		while (level <= 5) {
			n *= level;
			System.out.println(level + "!=" + n);
			level++;
		}

	}

}
