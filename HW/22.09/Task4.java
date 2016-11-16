public class Task4 {
	public static void main(String[]args) {
		int a1=Integer.parseInt(args[0]);
		int a2=Integer.parseInt(args[1]);
		int a3=Integer.parseInt(args[2]);
		int diff=a2-a1;
		
		if ( a3 >= 1) {
			int an = a1 + (a3 -1) * diff;

			System.out.println(an);
		}
	}	
}