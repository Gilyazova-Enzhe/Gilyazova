public class Rand {
	public static void main (String[] args) {
		int [] a = new int [10];
		int b = 0;
		System.out.println("The array:");
		for (int i=0; i<a.length; i++){
		a [i]= (int) (Math.random()*100);
		System.out.print(a[i] + " ");
		}
		
		System.out.println ("\n" + "\n" + "reversed");
		for (int i=0; i<a.length/2; i++){
			b= a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=b;
		}
		
		for (int i=0; i<a.length; i++){
			System.out.print(a[i] + " ");
		}
	}
}