import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AlternatingCharacters {

    static int alternatingCharacter(String s){
        // Complete this function
    	int count = 0;
    	for(int i=1; i< s.length(); i++){
    		char chBrfore = s.charAt(i-1);
    		char chCurrent = s.charAt(i);
    		
    		if(chBrfore == chCurrent)
    			count++;
    	}
    	
    	return count;
    	
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = alternatingCharacter(s);
            System.out.println(result);
        }
    }
}
