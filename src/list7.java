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

    public static ArrayList<Integer> createIntegerArray() {
        Random rand = new Random();
        System.out.println("Write numbers of random numbers");
        int numbers = scanner.nextInt();
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < numbers; i++) {
            integers.add(rand.nextInt(10) + 1);
        }
        return integers;

    }


    public static void printArrayOfNames(ArrayList<String> names) {

        System.out.println("Names: ");

        String names2 = names.toString();
        for (String name : names2.split(" ")) {
            System.out.println(name);
        }

    }

    public static void printArrayOfIntegers(ArrayList<Integer> numbers) {
        System.out.println("Numbers: ");
        for (Integer number : numbers) {
            System.out.println(number);
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

    public static void revereseElements(ArrayList<Integer> numbers) {

        System.out.println("Elements reversed... ");

        int start = 0;
        int end = numbers.size() - 1;


        while (start < end) {

            int temp = numbers.get(start);

            numbers.set(start, numbers.get(end));

            numbers.set(end, temp);

            start++;
            end--;
        }
    }


    public static void main(String[] args) {


        ArrayList<String> names = createArrayOfNames();
        printArrayOfNames(names);
        removeOneName(names);


        ArrayList<Integer> integers = createIntegerArray();
        printArrayOfIntegers(integers);
        revereseElements(integers);
        printArrayOfIntegers(integers);



    }
}

