package com.hr.algo.string.easy;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class GemStone {

    static int gemstones(String[] arr){
        // Complete this function
    	Map<Character, Integer[]> characterMap = new HashMap<>();
    	int index = 0;
    	for(String str:arr){
    		for(int i=0; i<str.length(); i++){
    			if(index == 0 && !characterMap.containsKey(str.charAt(i)))
    				characterMap.put(str.charAt(i), new Integer[]{1,index});
    			else if(characterMap.containsKey(str.charAt(i)) && characterMap.get(str.charAt(i))[1] != index){
    				characterMap.put(str.charAt(i), new Integer[]{characterMap.get(str.charAt(i))[0] + 1,index});
    			}
    			
    		}
    		
    		index++;
    	}
    	
    	int count = 0;
    	
    	for(Entry<Character, Integer[]> entry: characterMap.entrySet()){
    		if(entry.getValue()[0] == arr.length)
    			count++;
    	}
    	
    	return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.next();
        }
        int result = gemstones(arr);
        System.out.println(result);
    	
    	//System.out.println(validateURL("https://training-lms-test.redhat.com/amq/in/redhat/REDHAT_I_EXAM"));
    	
    }
    
    public static Boolean validateURL(String url) {
        try {
         final URLConnection connection = new URL(url).openConnection();
            connection.connect();
            return true;
        } catch (final MalformedURLException e) {
            throw new IllegalStateException("Bad URL: " + url, e);
        } catch (final IOException e) {
            return false;
        }
        
       }
}
