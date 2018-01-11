import java.util.Scanner;

public class SherlockAndSquare {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		int cases = sc.nextInt();
		
		
		for(int i=0;i<cases;i++){
			long a = sc.nextLong();
			long b = sc.nextLong();
			
			int count = 0;
			
			/*for(long num = a;num<=b;num++){
				
				//long sqrt = (long) Math.sqrt(num);Math.pow(sqrt, 2) == num
				
				if(PerfectSquare(num)){
					count++;
				}
			}*/
			
			System.out.println(PerfectSquare(a,b));
		}
	
	}
	
	static int PerfectSquare(long a, long b)
	{
	    /*long h = n & 0xF; // last hexadecimal "digit"
	    if (h > 9)
	        return false; // return immediately in 6 cases out of 16.

	    // Take advantage of Boolean short-circuit evaluation
	    if ( h != 2 && h != 3 && h != 5 && h != 6 && h != 7 && h != 8 )
	    {
	        // take square root if you must
	        int t = (int) Math.floor( Math.sqrt((double) n) + 0.5 );
	            return t*t == n;
	    }
	    return false;*/
		
		return (int) (Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a)) + 1);
	}

}
