package src.hw;

import java.util.concurrent.TimeUnit;

public class taskswithrandomization {
    public static void main(String[] args) {
        HW1();
        HW2();
        HW3();

    }

    static void HW1() {
        for (long y = 0; y <= 29; y++) {
            for (long i = 0; i <= (1 + Math.random() * 15); i++) {
                int x = (int) (97 + Math.random() * 26);
                System.out.print((char) x);
            }
            System.out.println(" ");

        }
    }

    static void HW2() {
        int a = 0;
        int b = 0;
        b += 1;
        for (int i = 0; i < 999; i++) {
            int r = (int) (Math.random() * 2);
            /** System.out.println(r); */
            if (r == 1) {
                a += 1;
            } else {
                b += 1;
            }
        }
        System.out.println("zeroes: " + b + ";" + b / 10.0 + "%");
        System.out.println("ones: " + a + ";" + a / 10.0 + "%");
    }

    static void HW3() {
        for (int i = 0; i <= 10; i++) {
            for (int x = 0; x <= (Math.random() * 10); x++) {
                System.out.print(" ");
            }
            
            System.out.println("*");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
     
        }

    }
}
