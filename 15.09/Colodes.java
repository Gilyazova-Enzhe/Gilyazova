public class Colodes {
    public static void main(String[] args) {
		double t = Double.parseDouble(args[0]);
		
		if ( t > 0) {
			System.out.print((9.8*t*t)/2);
		} else {
			System.out.print("Time must be > 0");
		}
		
	}
}