import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoCharacters {

    static int twoCharaters(String s) {
        // Complete this function
    	boolean isConcurrent = true;
    	while(isConcurrent){
    		boolean continueLoop = true;
    		for(int i = 0; i< s.length() - 1; i++){
    			if(s.charAt(i) == s.charAt(i+1)){
    				s = s.replace(s.substring(i,i+1), "");
    				continueLoop = false;
    				break;
    			}
    		}
    		
    		if(continueLoop)
    			isConcurrent = false;
    	}
    	
    	return s.length();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        String s = in.next();
        int result = twoCharaters(s);
        System.out.println(result);
        in.close();
    }
}
