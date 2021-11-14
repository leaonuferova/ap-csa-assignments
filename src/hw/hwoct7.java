package hw;


public class hwoct7 {
    public static void main(String[] args) {
        /**
         * a. -5 + 8 * 6 b. (55+9) % 9 c. 20 + -3*5 / 8 d. 5 + 15 / 3 * 2 - 8 % 3
         */
        operatorsprecedence();
        /**
         * 5. Create a Boolean expression that returns true if we sleep in, otherwise
         * false. First parameter weekday is true if it is a weekday, and the parameter
         * vacation is true if we are on vacation. We sleep in if it is not a weekday or
         * we're on vacation. (source: Codingbat)
         * 
         * e.g. (weekday, vacation) 
         * (false, false) → true 
         * (true, false) → false 
         * (false,true) → true
         */
        sleepin(false, false);
        System.out.println(sleepin(false, false));
    }

    static void operatorsprecedence() {
        int a = -5 + 8 * 6;
        int b = (55 + 9) % 9;
        double c = 20.0 + -3.0 * 5.0 / 8.0;
        int d = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }

    static boolean sleepin(boolean weekday, boolean vacation){
        return !weekday||vacation;
    }
}