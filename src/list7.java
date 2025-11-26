import java.util.*;
public class list7 {
    public static final Scanner scanner = new Scanner(System.in);

    public static ArrayList<String> createArrayOfNames() {

        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the name of your " + (i + 1) + "th person: ");
            String name = scanner.nextLine();
            names.add(name);
        }
        return names;
    }

    public static void printArrayOfNames(ArrayList<String> names) {

        System.out.println("Names: ");

        String names2 = names.toString();
        for (String name : names2.split(" ")) {
            System.out.println(name);
        }

    }

    public static void removeOneName(ArrayList<String> names) {

        System.out.println("Removing names one by one");

        while (!names.isEmpty()) {

            String removedName = names.remove(0);

            System.out.println("Removed: " + removedName);
            System.out.println("Updated list: " + names);
        }

        System.out.println("List is now empty.");
    }


    public static void main(String[] args) {


        ArrayList<String> names = createArrayOfNames();
        printArrayOfNames(names);
        removeOneName(names);


    }
}

