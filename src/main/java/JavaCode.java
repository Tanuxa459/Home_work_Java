import java.util.List;

public class JavaCode {


    public static void main(String... args) {

        // Целочисленные типы
        byte aByte = 0;  // 8b   -128 + 127
        short aShort = 0; // 16b  -32768 +32767
        int aInt = 0;     // 32b  -2,147,483,648 до 2,147,483,647
        long aLong = 0L;  // 64b  -9,223,372,036,854,775,808 до 9,223,372,036,854,775,807

        // Типы с плавающей точкой
        float aFloat = 0.0F;
        double aDouble = 0.0;

        // Символьный
        char aChar = 'a';

        // Логически тип
        boolean aBoolean = true;

        // Строка (и бесконечность других объектных/ссылочных типов)
        String toBePrint = "Hello world!";
        System.out.println(toBePrint);
        List<Integer> teachers = List.of(10, 20);

        //Переполнение
        System.out.println("[" + Byte.MIN_VALUE + " , " + Byte.MAX_VALUE + "]");
        System.out.println("Byte.SIZE  =   " + Byte.SIZE);

        byte f = 120;
        f +=19;

        System.out.println("Переполнение:" + f);

        // Арифметические операторы

        int a = 10;
        int b = 20;
        double c = 2.09;
        int d = 25;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("++d   = " +  (++d));


        // Int and Double
        System.out.println("c + d = " + (c + d));
        System.out.println("c - d = " + (c - d));
        System.out.println("c / d = " + (c / d));
        System.out.println("c * d = " + (c * d));

        //Сравнение и логические операторы
        System.out.println("\na > b = " + (a > b));
        System.out.println((a < b) && ( a > d));
        System.out.println((a > b) || ( a < d));
        System.out.println("a == b? " + ( a == b));
        System.out.println("a != b? " + ( a != b));


    }

}
