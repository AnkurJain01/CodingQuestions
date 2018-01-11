import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MakingAnagrams {

    static int makingAnagrams(String s1, String s2){
        // Complete this function
    	
    	Map<Character, Integer> characterMap = new HashMap<>();
    	int count = s1.length();
    	
    	for(int i=0;i<s1.length();i++){
    		  if(characterMap.containsKey(s1.charAt(i)))
    			  characterMap.put(s1.charAt(i), characterMap.get(s1.charAt(i)) + 1);
    		  else
    			  characterMap.put(s1.charAt(i), 1);
    	}
    	
    	for(int i=0;i<s2.length();i++){
  		  if(characterMap.containsKey(s2.charAt(i))){
  			  int len = characterMap.get(s2.charAt(i));
  			  
  			  if(len < 1){
  				  count ++;
  			  }else{
  			  characterMap.put(s2.charAt(i), len - 1);
  			  count --;
  			  }
  		  }
  		  else
  			  count++;
    	}
    	
    	return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int result = makingAnagrams(s1, s2);
        System.out.println(result);
    }
}
