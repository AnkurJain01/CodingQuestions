import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StrangeCounter {

    static long strangeCode(long t) {
        // Complete this function
    	
    	long startN = 3;
    	long startT = 1;
    	long endT = 3;
    	long endN = 1;
    	long i=0;
    	long currentSize = 3;
    	long reqStartTime = startT;
    	
    	while(startT < t){
    		//startT = (int) (Math.pow(2, i)*3);
    		//if(i != 0){
    			//startT = (int) (Math.pow(3, i) + 1);
    			reqStartTime = startT;
    			startT = endT + 1;
    		//}
    		currentSize *= 2;
    		//i++;
    		endT += currentSize; 
    		/*endN = (int) (Math.pow(2, i + 1)*3) - 1;
    		endT = (int) (Math.pow(3, i + 1) + 1) - 1;*/
    	}
    	
    	long currentValue = 3; 
    	
    	if(startT == t){
    		reqStartTime = startT;
    	}
    	
    	long startTime = 1;
    	//if(i!=0){
    	//	i--;
    		startTime = (int) (Math.pow(3, i) + 1);
    		currentValue = currentSize;
    	//}
    	

    	long startValue = (int) (Math.pow(2, i )*3);
    	
    	
    	long counterPosition = t - reqStartTime;
    	
    	return currentValue - counterPosition;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        long result = strangeCode(t);
        System.out.println(result);
        in.close();
    }
}
