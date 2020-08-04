import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        Set<String> str = new TreeSet<>();
        int size = scanner.nextInt();
        while(size > 0) {
            String input = scanner.next();
            str.add(input);
            size--;
        }
        for (String item : str) {
            System.out.println(item);
        }

    }
}