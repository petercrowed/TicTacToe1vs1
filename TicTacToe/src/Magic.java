import java.util.ArrayList;

public class Magic
{
	
	 public ArrayList<Integer> MagicNumbers(ArrayList<Integer>  mNumbers)
	    { 
	            int n = 3;
	         
	         
	            int[][] magic = new int[n][n];

	            int row = n-1;
	            int col = n/2;
	            magic[row][col] = 1;

	            for (int i1 = 2; i1 <= n*n; i1++) {
	                if (magic[(row + 1) % n][(col + 1) % n] == 0) {
	                    row = (row + 1) % n;
	                    col = (col + 1) % n;
	                }
	                else {
	                    row = (row - 1 + n) % n;
	                    // don't change col
	                }
	                magic[row][col] = i1;
	              
	            }

	            // print results
	            for (   int i = 0  ; i < n; i++) {
	                for (   int j = 0; j < n; j++) {
	                    
	             mNumbers.add(magic[i][j]);
	                }
	               
	            }
	           ;
			return mNumbers;

	        }

        
}
    
