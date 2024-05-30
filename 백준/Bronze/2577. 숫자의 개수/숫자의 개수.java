import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numA = sc.nextInt();
		int numB = sc.nextInt();
		int numC = sc.nextInt();
		
		int total = (numA * numB * numC);
		
		String str = Integer.toString(total);
		
		for(int i=0; i<10; i++) {
			
			int count = 0;
			
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(j) - '0' == i) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
