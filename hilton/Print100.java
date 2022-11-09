package hilton;

import java.util.stream.IntStream;

public class Print100 {

    public static void main(String[] args) {
        iterateAndPrint(100);

    }

    public static void iterateAndPrint(int b) {
        if(b != 100) {
            System.out.println("this number is either higher than 100 or less");
        }

        IntStream.rangeClosed(1,100).forEach(i -> {
            if(i % 3 == 0 && i % 5 != 0) {
                System.out.println(i + " foo");
            }
            if(i % 5 == 0 && i % 3 != 0) {
                System.out.println(i + " bar");
            }
            if(i%3 == 0 && i%5==0){
                System.out.println(i + " foo bar");
            }
        });

        String s = new String("I am immutable and so serious");
        String s1 = "I am immutable and so serious";



        System.out.println(s.equals(s1));
    }
}
