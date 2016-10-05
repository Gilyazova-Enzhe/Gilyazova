public class Task4 {
	
    public static void main(String[] args) {

        String a = args[0];
        String b = args[1];
		
        char[] a1 = first.toCharArray();
        char[] b1 = second.toCharArray();
        String result = "";

        
		if (a.length() == 0 || b.length() == 0) {
            System.out.print("String length must be greater than zero");
            System.exit(0);
        }

        
		if (a.length() != b.length()) {
            System.out.print("String is different");
            System.exit(0);
        }

       
	   for (int i = 0; i < a.length(); i++) {
            
			if (a1[i] < b1[i] || a1[i] > b1[i]) {
                result = "String is different";
                break;
        }
        if (result.length() > 0) System.out.print(result);
        else System.out.print("String is same");
    }
}
}