package exp1;

public class exp1 {

	private static void bubble(int[] data){
		int i, j, temp;
		for ( j = data.length; j > 1; j--)
			for ( i = 0; i < j - 1; i++)
				if(data[i+1] < data[i])
				{
					temp = data[i+1];
					data[i+1] = data[i];
					data[i] = temp;
				}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 50, 100, 4, 16 };
		int i;
		System.out.print("­ì©l°}¦C:");
		for (i = 0; i < data.length; i++)
			System.out.print("[" + data[i] + "]");
		System.out.print("\n");
		bubble(data);
		System.out.print("±Æ§Ç°}¦C:");
		for ( i = 0; i < data.length; i++ )
			System.out.print("[" + data[i] + "]");
		System.out.print("\n");		
	}
}
