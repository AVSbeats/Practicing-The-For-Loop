public class ForExamples {

    public static void main(String[] args) {

        int i = 0;

        System.out.println("This example is using i = 0 and i < 5");
        System.out.println(""); // Blank for space

        for (i = 0; i < 5; i++) {
            System.out.println("Number of repeats for example A: " + i);
        }
        System.out.println("As you can see the 0 is counted total of 5 numbers");
        System.out.println(""); // Blank for space

        System.out.println("This next example is using i = 0 and i <= 5");
        System.out.println(""); // Blank for space
        for (i = 0; i <= 5; i++) {
            System.out.println("Number of repeats for example B: " + i);
        }
        System.out.println("As you can see the 0 is counted total of 6 numbers with <= 5");
        System.out.println(""); // Blank
    }
}