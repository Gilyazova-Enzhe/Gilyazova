
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine(); //считывается с конс строку

        System.out.println(isRightLine(line, 0, 0)); 
    }

    static boolean isRightLine(String line, int count, int i) { //i номер символа (счетчик) который пробегает от начала до конца строки 
        char tmp = line.charAt(i); //метод который возвращает символ по номеру
        if (tmp == '(') {
			count++; // прибавляет к счетчику 1
		} else if (tmp == ')') {
			count--;
		}

        if (count < 0) return false;
        if (i != line.length() - 1) return isRightLine(line, count, i + 1);
        return count == 0;
    }
}