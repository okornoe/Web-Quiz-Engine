import java.util.HashMap;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        HashMap<Character, Integer> dictionary = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        char[] inputOne = scanner.next().toLowerCase().toCharArray();
        char[] inputTwo = scanner.next().toLowerCase().toCharArray();

        boolean flag = true;
        int count;

        if (inputOne.length == inputTwo.length) {
            for(int i = 0; i<inputOne.length; i++){
                count = 0;

                if(dictionary.containsKey(inputOne[i])){
                    count = dictionary.get(inputOne[i]);
                }

                dictionary.put(inputOne[i], ++count);

                count = 0;

                if(dictionary.containsKey(inputTwo[i])){
                    count = dictionary.get(inputTwo[i]);
                }

                dictionary.put(inputTwo[i], --count);
            }

            for(int i : dictionary.values()){
                if(i != 0){
                    flag = false;
                    break;
                }
            }
            if(flag) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        } else {
            System.out.println("no");
        }
    }
}