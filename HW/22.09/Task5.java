public class Task5 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int s = 0; 
		int s1 = 0; 
		int a1 = 0;
		double b = 0;
		
		while (a >= 1) {
			a1 = a % 2;
			s += a1 * Math.pow(10.0,b); //s = s + a;
			b++;
			a = a / 2;
			
			if (a1 == 1){
				s1 = s1 + 1;
			}
			
		}
		System.out.println("units " + s1);
		System.out.println("number in the binary system " + s);
		
	}
}