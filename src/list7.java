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


    public static void fillArray(List<Integer> array, int number) {
        for (int i = 0; i < number; i++) {
            array.add(i);
        }
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


    public static long measureTime(List<Integer> array, int accessCount) {

        Random rand = new Random();
        int size = array.size();
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < accessCount; i++) {
            int randomIndex = rand.nextInt(size);
            array.get(randomIndex);
        }

        return System.currentTimeMillis() - startTime;

    }

    public static long measureInsertTime(List<Integer> array, int insertCount) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < insertCount; i++) {
            array.add(0,i);
        }
        return System.currentTimeMillis() - startTime;
    }
    public static long measureRandomInsertTime(List<Integer> array, int insertCount) {

        Random rand = new Random();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < insertCount; i++) {
            int size = array.size();
            array.add(rand.nextInt(size),i);
        }
        return System.currentTimeMillis() - startTime;
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


        int element = 1000000;
        int access = 10000;
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        fillArray(arrayList, element);
        fillArray(linkedList, element);

        long ArrayListTime = measureTime(arrayList, access);
        long LinkedListTime = measureTime(linkedList, access);
        System.out.println("ArrayList time: " + ArrayListTime + "ms");
        System.out.println("LinkedList time: " + LinkedListTime + "ms");





        int element2 = 1000000;
        int insert = 10000;
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        LinkedList<Integer> linkedList2 = new LinkedList<>();

        fillArray(arrayList2, element2);
        fillArray(linkedList2, element2);

        long ArrayListInsertTime = measureInsertTime(arrayList, insert);
        long LinkedListInsertTime = measureInsertTime(linkedList, insert);
        System.out.println("ArrayList insert time: " + ArrayListInsertTime + "ms");
        System.out.println("LinkedList insert time: " + LinkedListInsertTime + "ms");


        int element3 = 1000000;
        int insert2 = 10000;
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        LinkedList<Integer> linkedList3 = new LinkedList<>();

        fillArray(arrayList2, element3);
        fillArray(linkedList2, element3);

        long ArrayListRandomInsertTime = measureRandomInsertTime(arrayList, insert);
        long LinkedListRandomInsertTime = measureRandomInsertTime(linkedList, insert);
        System.out.println("ArrayList random insert time: " + ArrayListRandomInsertTime + "ms");
        System.out.println("LinkedList random insert time: " + LinkedListRandomInsertTime + "ms");










    }
}

