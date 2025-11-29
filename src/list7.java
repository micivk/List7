import java.util.*;
public class list7 {
    public static final Scanner scanner = new Scanner(System.in);

    public static ArrayList<String> createArrayOfNames() {

        ArrayList<String> names = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the name of " + (i + 1) + "th person: ");
            String name = scanner.nextLine();
            names.add(name);
        }
        return names;
    }

    public static ArrayList<String> createArrayOfWords() {

        ArrayList<String> words = new ArrayList<>();
        System.out.println("Write how many words you want to create: ");
        int number_of_words = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < number_of_words; i++) {
            System.out.println("Enter the " + (i + 1) + "th word: ");
            String word = scanner.nextLine();
            words.add(word);
        }
        return words;
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


    public static void printArrayOfWords(ArrayList<String> words) {

        String words2 = words.toString();
        for (String word : words2.split(" ")) {
            System.out.println(word);
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


    public static String buildSentence(ArrayList<String> list){
        String sentence = "";

        for (String word: list) {
            sentence += word + " ";
        }
        return sentence.trim();
    }




    public static void main(String[] args) {


        ArrayList<String> names = createArrayOfNames();
        System.out.println("Names: ");
        printArrayOfWords(names);
        removeOneName(names);


        ArrayList<Integer> integers = createIntegerArray();
        printArrayOfIntegers(integers);
        revereseElements(integers);
        printArrayOfIntegers(integers);


        ArrayList<String> words = createArrayOfWords();
        System.out.println("Words: ");
        printArrayOfWords(words);
        String sentence = buildSentence(words);
        System.out.println(sentence);








    }
}

