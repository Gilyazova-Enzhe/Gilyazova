import java.util.Arrays;
public class Task1 {
	public static void main(String [] args) {
			int[] a = {0,3,5,8,9,4,2,-1};
    	boolean S = false;
    	int k;

    	while(!S) {

    		S =true;

    		for (int i = 0; i < a.length - 1; i++) {

    			if (a[i] > a[i+1]) {

    				k = a[i+1];
    				a[i+1] = a[i];
    				a[i] = k;
    				S=false;

    			}
    		}
    	}

    	System.out.print(Arrays.toString(a));

    }
}
	
