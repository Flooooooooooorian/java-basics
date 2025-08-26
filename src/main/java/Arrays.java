public class Arrays {

    public static void main(String[] args) {

        int[] numbers = new int[50];


        for (int i = 0; i < 50; i++) {
            System.out.println("Schleife");
//            numbers[i] = i;
        }

        System.out.println(java.util.Arrays.toString(numbers));

    }

    public static int addition(int a, int b) {
        return a + b;
    }
}
