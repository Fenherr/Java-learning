public class Main {
    public static void main(String[] args) {
        
        // String language = "Java";
        // int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        // int[][] matrix = {{1, 2}, {3, 4}};

        // System.out.println("I am learning " + language);
        // System.out.println("Numbers: " + java.util.Arrays.toString(numbers));
        // System.out.println("Matrix: " + java.util.Arrays.deepToString(matrix));

        // int sum = add(5, 10);
        // System.out.println("Sum: " + sum);

        // recursiveFunction(5);

        // for (int i = 0; i < numbers.length; i++) {
        //     System.out.println("Number at index " + i + ": " + numbers[i]);
        // }
        

        // Class myClass = new Class("This is a description of my class.");
        // myClass.setDescrition();

        // Class anotherClass = new Class("Another class description.");
        // anotherClass.setDescrition();

        Class wall = new Wall(10, 20, 30, true);
        wall.displayDescrition();
        ((Wall) wall).displayWall();

    }

    // public static int add(final int a, final int b) {
    //     return a + b;
    // }

    // public static void recursiveFunction(final int n) {
    //     if (n <= 0) {
    //         return;
    //     }
    //     System.out.println("Recursive call with n = " + n);
    //     recursiveFunction(n - 1);
    // }

}
