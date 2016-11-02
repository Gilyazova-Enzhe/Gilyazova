public class Task2 {
	public static void main (String[] args) {
		int[] a = new int[10];
		for (int i = 0; i < 2; i++) {
			a[i] = (int) (Math.random()*10);
		}	
		for (int i = 2; i < a.length; i++) {
			a[i] = a[i - 1] * a[i - 2];
		}
		for (int n : a) { //for(int i = 0; i < a.length; i++)
			System.out.println(n);	
		}
		
	}
}