import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] iArr = new int[26]; 
		String str = sc.next(); 
		
		for(int i = 0; i <str.length(); i++) {
			
			if(65 <= str.charAt(i) && str.charAt(i) <= 90) {
				iArr[str.charAt(i) - 65]++;
				  
			}else {
				 iArr[str.charAt(i) - 97]++;
			}
		}
		
		int max = -1;
		char ch = '?';
		
		for(int i=0; i<iArr.length; i++) {
			if(iArr[i] > max) { 
				max = iArr[i]; 
				ch = (char)(i+65); 
			}else if(iArr[i] == max) {
				ch = '?';
			}
		}
		System.out.println(ch);
	}
}
