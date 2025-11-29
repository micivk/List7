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
        System.out.println("Write the number of random numbers");
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

    public static void reverseElements(ArrayList<Integer> numbers) {

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

    public static long measureDeleteTime(List<Integer> array, int deleteCount) {

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < deleteCount; i++) {
            array.remove(0);
        }
        return System.currentTimeMillis() - startTime;
    }


    public static int countVowels(String input) {

        int count = 0;

        String vowels  = "aeiouAEIOU";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (vowels.indexOf(c) != -1) {
                count++;
            }

        }
        return count;
    }



    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i  <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static int findSecondLargest(ArrayList<Integer> numbers) {

        if (numbers == null || numbers.size() < 2) {
            System.out.println("Array of integers is too short");
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            }
            else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }








    public static void main(String[] args) {


        ArrayList<String> names = createArrayOfNames();
        System.out.println("Names: ");
        printArrayOfWords(names);
        removeOneName(names);


        ArrayList<Integer> integers = createIntegerArray();
        System.out.println("Numbers: ");
        printArrayOfIntegers(integers);
        reverseElements(integers);
        System.out.println("Numbers: ");
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

        long ArrayListInsertTime = measureInsertTime(arrayList2, insert);
        long LinkedListInsertTime = measureInsertTime(linkedList2, insert);
        System.out.println("ArrayList insert time: " + ArrayListInsertTime + "ms");
        System.out.println("LinkedList insert time: " + LinkedListInsertTime + "ms");


        int element3 = 1000000;
        int insert2 = 10000;
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        LinkedList<Integer> linkedList3 = new LinkedList<>();

        fillArray(arrayList3, element3);
        fillArray(linkedList3, element3);

        long ArrayListRandomInsertTime = measureRandomInsertTime(arrayList3, insert2);
        long LinkedListRandomInsertTime = measureRandomInsertTime(linkedList3, insert2);
        System.out.println("ArrayList random insert time: " + ArrayListRandomInsertTime + "ms");
        System.out.println("LinkedList random insert time: " + LinkedListRandomInsertTime + "ms");





        int element4 = 1000000;
        int delete = 10000;
        ArrayList<Integer> arrayList4 = new ArrayList<>();
        LinkedList<Integer> linkedList4 = new LinkedList<>();

        fillArray(arrayList4, element4);
        fillArray(linkedList4, element4);

        long ArrayListDeleteTime = measureDeleteTime(arrayList4, delete);
        long LinkedListDeleteTime = measureDeleteTime(linkedList4, delete);
        System.out.println("ArrayList delete time: " + ArrayListDeleteTime + "ms");
        System.out.println("LinkedList delete time: " + LinkedListDeleteTime + "ms");


        // task4
        // ArrayList uses a standard array. It calculates the memory address instantly using the index.
        // LinkedList consists of scattered nodes. To find an element, it must traverse the list node by node from the beginning.

        // task5/task7
        // ArrayList is slow because inserting or removing at index 0 requires shifting all subsequent elements in memory to fill the gap or make space.
        // LinkedList is fast because it only needs to update the pointers of the first node. No other elements need to be moved.

        // task6
        // ArrayList is usually faster here because modern CPUs are very efficient at copying/shifting blocks of memory.
        // LinkedList loses a lot of time "walking" to the specific index before it can insert the node.


        String input = "Chrząszcz brzmi w trzcinie w Szczebrzeszynie";
        int amount = countVowels(input);
        System.out.println("Amount of Vowels: " + amount);



        ArrayList<Integer> arrayList7 = new ArrayList<>();
        arrayList7.addAll(Arrays.asList(1,2,3,4,5,6,7,10,12,13,14,20,23,45,50,1623,23414));
        System.out.println("Numbers: ");
        printArrayOfIntegers(arrayList7);

        ArrayList<Integer> onlyPrime = new ArrayList<>();


        for (Integer num : arrayList7) {
            if (isPrime(num)) {
                onlyPrime.add(num);
            }
        }

        System.out.println("Prime numbers found: ");
        printArrayOfIntegers(onlyPrime);




        ArrayList<Integer> numbers5 = new ArrayList<>();
        numbers5.addAll(Arrays.asList(102, 552, 2044, 20123, 443443, 82311));
        System.out.println("Numbers: ");
        printArrayOfIntegers(numbers5);
        int result = findSecondLargest(numbers5);
        System.out.println("Second largest number: " + result);







    }

    }


