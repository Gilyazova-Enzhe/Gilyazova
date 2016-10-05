public class Task6 {
	
	public static void main(String[] args) {
	

		String text = args[0];
		if (text.length() == 0) {
		
			System.out.print("String length must be greater than zero");
			System.exit(0);
		}
		char[] line = text.toCharArray();

		boolean S = true;

		for (int i = 0; i < line.length/2; i++) {
			
			if (line[i] != line[line.length - 1 - i])
				
				S = false;
		}
			if (S) System.out.print("It is palindrome");
			
			else System.out.print("It isn't palindrome");

	}
		}