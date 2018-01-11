import java.util.Scanner;

public class Pangrams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String output = "pangram";
		
		int[] alpha = new int[26];
		
		String lowerInp = input.toLowerCase();
		
		for(int i = 0; i<lowerInp.length(); i++){
			char ch = lowerInp.charAt(i);
			if(65<=ch && ch<=122)
				alpha[ch - 97]++;
		}
		
		for(int a:alpha){
			if(a == 0){
				output = "not pangram";
				break;
			}
				
		}
		
		System.out.println(output);
	}

}
