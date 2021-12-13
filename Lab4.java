
import java.util.Scanner;
import java.util.ArrayList;

public class Lab4 {
    public static void main(String[] Args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String input = null;
        int element = 0;
        System.out.println("Enter as many integer numbers " +
                "as you want \n" +
                "type quit when you're done");
        do {
            input = scan.nextLine();
            try {
                element = Integer.parseInt(input);
            } catch (Exception NumberFormatException) {
                if (!input.equals("quit")) {
                    System.out.println("Not an integer");
                }
            }
            list.add(element);
        }
        while (!input.equals("quit"));
        System.out.println("Which number do you want to exclude from this list");
        int ban = 0;
        while (!scan.hasNextInt()) {
            System.out.println("Not an integer");
            scan.next();
        }
        ban = scan.nextInt();
        scan.close();
        ArrayList<Integer> OriginalList = list;
        System.out.println("Original list looks " +
                "as follows: " + OriginalList);
        System.out.println("You chose to ban number " + ban);
        int c = list.size();
        for (int i = c - 1; i >= 0; i--) {
            int index = list.get(i);
            if (index == ban) {
                list.remove(i);
            }
        }
        System.out.println("The new list looks like that:" + list);
    }
}