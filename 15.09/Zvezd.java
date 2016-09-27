public class Zvezd {
	
	public static void main(String[] args) {
        short n = Short.parseShort(args[0]);
		
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++){
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}