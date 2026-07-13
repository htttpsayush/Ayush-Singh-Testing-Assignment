package program.Example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharacters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        HashMap<Character, Integer> characterCount = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (characterCount.containsKey(ch)) {
                characterCount.put(ch, characterCount.get(ch) + 1);
            } else {
                characterCount.put(ch, 1);
            }
        }

        System.out.println("Duplicate Characters:");

        for (Map.Entry<Character, Integer> entry : characterCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
        }

        sc.close();
    }
}