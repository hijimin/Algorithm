import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";
		
		int numA = sc.nextInt();
		int numB = sc.nextInt();
		
		str = (numA > numB) ? ">" : (numA < numB) ? "<" : "==";
		
		System.out.println(str);
	}
}
