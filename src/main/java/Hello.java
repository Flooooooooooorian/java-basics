import java.util.*;

public class Hello {

    public static void main(String[] args) {

        System.out.println("Hallo Welt");
        System.out.println("Tschüüs");


        //Datentyp variableNamen = value;
        //String, double, float, byte, short, int, long, boolean, char,
        // Text, Kommazahl(groß), Kommazahl(klein), Ganzzahlen(), Ganzzahlen(groß), true/false, '!'

        String myName = "Florian, 29 Jahre alt, wohnt in Berlin";
        double myAge = 29.1;
        int myValue = 4;

        double myself = myValue + myAge;

        System.out.println(myName);
        System.out.println(myAge);
        System.out.println(myself);

        System.out.println(3 + 4);
        System.out.println(3 - 4);
        System.out.println(3 / 4);
        System.out.println(3 * 4);

        boolean myResult = 3 > 5.5;
        boolean result = false;

        System.out.println(myResult);
        System.out.println(3 < 5);
        System.out.println(3 == 5);
        System.out.println(3 != 5);
        System.out.println(3 >= 5);
        System.out.println(3 <= 5);

        System.out.println("Ein und: " + (true && true));
        System.out.println("Ein oder: " + (true || false));

        System.out.println(16 % 5);
        System.out.println(584684636 % 2);
    }
}
