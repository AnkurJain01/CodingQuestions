import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HappyLadybugs {
	
	public static String isBugHappy(String s, int n){
		
		Map<Character, Integer> characterMap = new HashMap<>();
		int noOfEmptySlots = 0;
		
		for(int i=0; i< s.length(); i++){
			if(!characterMap.containsKey(s.charAt(i)))
				characterMap.put(s.charAt(i), 1);
			else
				characterMap.put(s.charAt(i), characterMap.get(s.charAt(i)) + 1);
		}
		
		for(Entry<Character, Integer> entry: characterMap.entrySet()){
			if(entry.getKey() != '_' && entry.getValue() == 1){
				return "NO";
			}else if(entry.getKey() == '_'){
				noOfEmptySlots = entry.getValue();
			}
		}
		
		if(noOfEmptySlots < 1){
			// check if color already consecutive
			for(int i=0; i< s.length()-1; i++){
				
				if(i==0 && s.charAt(i) != s.charAt(i+1))
					return "NO";
				else if(s.charAt(i) != s.charAt(i+1) && s.charAt(i) != s.charAt(i - 1))
					return "NO";
			}
		}
		
		return "YES";
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Q = in.nextInt();
        for(int a0 = 0; a0 < Q; a0++){
            int n = in.nextInt();
            String b = in.next();
            System.out.println(isBugHappy(b, n));
        }
    }
}
