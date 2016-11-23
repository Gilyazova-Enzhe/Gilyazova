public class Task9 {	
	public static void main(String[] args) {

		int k = Integer.parseInt(args[0]); 
		if (k > 0) {
			for ( int i = 1; i <= (int) Math.sqrt(k); i++) { //берем от 1 до корня этого числа
				if (k % i == 0) { //число делим на все i , от единицы до корня, если число деится на цело, то-
					System.out.print(i + " ");
					if (i != (k / i)) 
						System.out.print((k / i) + " "); 
				}
			}
		} else {
			System.out.print("Number must be greater than 0");
		}
	}
}