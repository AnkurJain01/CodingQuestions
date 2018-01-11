import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GameofThronesI {

    static String gameOfThrones(String s){
        // Complete this function
    	Map<Character, Integer> characterMap = new HashMap<>();
    	
    	for(int i=0;i<s.length();i++){
    		  if(characterMap.containsKey(s.charAt(i)))
    			  characterMap.put(s.charAt(i), characterMap.get(s.charAt(i)) + 1);
    		  else
    			  characterMap.put(s.charAt(i), 1);
    	}
    	
    	int count = 0;
    	for(Entry<Character, Integer> entry: characterMap.entrySet()){
    		
    		if((entry.getValue()) % 2 != 0){
    			count ++;
    		}
    	}
    	
    	if(count > 1){
    		return "NO";
    	}
    	
    	return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = gameOfThrones(s);
        System.out.println(result);
    }
}
