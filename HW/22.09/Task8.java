public class Task8 {
	public static void main (String [] args) {
		int a = Integer.parseInt(args[0]);
		int s1 = 0; 
		int a1 = 0; 
		int s1max = 0;
		
			while (a >=1) {
				a1= a%2;
				if (a1 == 0){
					s1=s1+1;
					if (s1 > s1max) {
						s1max=s1;
					}
				}
				else {
					s1=0;
				}
				a /=2;
				}
				System.out.println("Number of zeros" + s1max);
	}
}