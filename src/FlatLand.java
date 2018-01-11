import java.util.Arrays;
import java.util.Scanner;

public class FlatLand {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int spaceStation[] = new int[m];
        for(int c_i=0; c_i < m; c_i++){
        	spaceStation[c_i] = in.nextInt();
        }
        
        Arrays.sort(spaceStation);
        
        int first = spaceStation[0];
        int last = spaceStation[spaceStation.length-1];
        
        int maxDistance=0;
        
        if(m == n){
        	System.out.println(maxDistance);
        	System.exit(0);
        }
        
        for(int i=0;i<n;i++){
        	int distance = 0;
        	if(i<first)
        		distance = first - i;
        	else if(i>last)
        		distance = i - last;
        	else{
        		int minNodeDist = Integer.MAX_VALUE;
        		for(int station:spaceStation){
        			if(station == i){
        				minNodeDist = 0;
        				break;
        			}
        			distance = Math.abs(station - i);
        			minNodeDist = (distance<minNodeDist)? distance:minNodeDist;
        			}
        		distance = minNodeDist;
        	}
        	
        	if(distance >maxDistance)
    			maxDistance = distance;
    		}
        
        System.out.println(maxDistance);
        }

	}
