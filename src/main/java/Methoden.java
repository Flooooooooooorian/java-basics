public class Methoden {

    public static void main(String[] args) {

        String result1 = returnHello();
//        int result2 = myMethod();
        String result3 = myMethod("string");

        int result = 2;

        String intValue = String.valueOf(result);

        int value = Integer.parseInt("2");

        System.out.println("Int value: " + value);

        if (result > 0) {
            System.out.println("Ja");
        }

        switch (result) {
            case 0: {
                System.out.println("Die Varible ist 0");
                break;
            }
            case 1: {
                System.out.println("Die Varible ist 1");
                break;
            }
            case 2: {
                System.out.println("Die Varible ist 2");
                break;
            }
            case 3: {
                System.out.println("Die Varible ist 3");
                break;
            }
            case 4: {
                System.out.println("Die Varible ist 4");
                break;
            }
            case 5: {
                System.out.println("Die Varible ist 5");
                break;
            }
        }


        String nameAndSize = ("Florian");

        System.out.println(nameAndSize);

    }

    public static String returnHello() {
        String hallo = "Hallo";
        return hallo;
    }

    public static String myMethod(String name) {
        String hallo = "Hallo";
        int length = hallo.length();

        return hallo+length;
    }


    public static boolean isBiggerThan10(int number) {
        return number > 10;
    }

    public static boolean isSmallerThan10(int number) {
        return number <= 10;
    }
}
