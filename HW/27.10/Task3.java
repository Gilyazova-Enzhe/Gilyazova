public class Task3 {
	public static void main(String[] args) {
		int[] a = new int [5];
		a[0] = (int) (Math.random()*2 + 1);
		
		for (int i = 1; i < a.length; i++) {
			a[i] = a[i - 1] * a[i - 1];
		}
		
		for (int n : a) { 
			System.out.println(n);	
		}
	}
}