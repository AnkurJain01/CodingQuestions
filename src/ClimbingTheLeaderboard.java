import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ClimbingTheLeaderboard {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        
        List<Integer> distinctSortedScores = new ArrayList<Integer>();
        
        for(int scores_i = 0; scores_i < n; scores_i++){
            scores[scores_i] = in.nextInt();
        }
        
        for(int scores_i = 0; scores_i < n; scores_i++){
            if(scores_i == 0 || distinctSortedScores.get(distinctSortedScores.size() - 1) != scores[scores_i])
            	distinctSortedScores.add(scores[scores_i]);
        }
        
        int m = in.nextInt();
        int[] alice = new int[m];
        for(int alice_i = 0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
        }
        // Write Your Code Here
        in.close();
        
        for(int i = 0; i<m; i++){
        	int marks = alice[i];
        	int end = distinctSortedScores.size();
        	int start = 0;
        	while(end>=start){
        		int mid = start + (end - start)/2;
        		if(mid == distinctSortedScores.size() - 1){
        			System.out.println(mid);
        			distinctSortedScores.add(mid, marks);
        			break;
        		}
        		else if(distinctSortedScores.get(mid) == marks){
        			System.out.println(mid);
        			break;
        		}
        		else if(distinctSortedScores.get(mid + 1) == marks){
        			System.out.println(mid + 1);
        			break;
        		}
        		else if(distinctSortedScores.get(mid +1) < marks && distinctSortedScores.get(mid) > marks){
        			System.out.println(mid);
        			distinctSortedScores.add(mid, marks);
        			break;
        		}else if(distinctSortedScores.get(mid) > marks){
        			start = mid+1;
        		}else if(distinctSortedScores.get(mid) < marks){
        			end = mid-1;
        		}
        	}
        	
        	
        	
        	
        	
        	
        	/*int rank = findRank(distinctSortedScores, 0, distinctSortedScores.size(), marks);
        	distinctSortedScores.add(rank - 1, marks);
        	System.out.println(rank);*/
        }
    }
    
    
    /*private static int findRank(List<Integer> lst, int start, int end, int mark){
    	
    	 if (end>=start)
         {
    	
    	int mid = start + (end - start)/2;
    	
    	if(mid <= 0)
    		return lst.size() + 1;
    	else if(mid >=lst.size() -1 )
    		return lst.size();
    	else if(lst.get(mid +1) <= mark && lst.get(mid) >= mark)
    		return mid;
    	else if(lst.get(mid) > mark)
    		return findRank(lst, start, mid-1, mark);
    	else
    		return findRank(lst, mid + 1, end, mark);
         }
    	 
    	 return lst.size() + 1;
    }*/
}
