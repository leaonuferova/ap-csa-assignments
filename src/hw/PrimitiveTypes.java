package src.hw;
public class PrimitiveTypes {
    public static void main(String[] args) {
        testPrimitiveTypes1();
        testPrimitiveTypes1();
    }

    static void testPrimitiveTypes1() {
        /** use here all primitive types. 
        Perform at least two operations with each type. E.g. int I = 5+3, boolean 
        b= True & False and print the result with println();
        Get back to the documentation in Unit 2 and see what does need to be added 
        to the number if you want to work with Long type
        */
        /** int
         * */
        System.out.println("int");
        int x = 419;
        System.out.println(x+1);
        System.out.println(x);
        /** boolean
         * */
        System.out.println("boolean");
        boolean g = true;
        boolean q = false;
        boolean h = true & false;
        System.out.println(h);
        System.out.println(g);
        System.out.println(!q);
        /** char
         * */
        System.out.println("char");
        char d = 'W';
        System.out.println(d);
        System.out.println((char)(d+2));
        System.out.println(d-12);
        /** byte
         * */
        System.out.println("byte");
        byte a = -128;
        System.out.println(a);
        System.out.println(a+170);
        /** byte
        byte b = -129;
        System.out.println(b);
        * */
        /** short
         * */
        System.out.println("short");
        short t1 = 177;
        short t2 = 14;
        short t = (short) (t1+t2);
        System.out.println(t);
        short to = (short) (t2-t1);
        System.out.println(to);
        /** long
         * */
        System.out.println("long");
        long timenosee = 2184961409731750L;
        long hahaha = timenosee - timenosee;
        System.out.println(timenosee);
        System.out.println(hahaha);
        /** float
         * */
        System.out.println("float");
        float boat = 4893802.0883F;
        float paper = 3478294.08364083888F;
        System.out.println(boat);
        System.out.println(paper+boat);
        System.out.println(paper / boat);
        /** double
            * */
        System.out.println("double");
        double ff = 8293640.82309442D;
        double fff = 12345678-ff;
        System.out.println(fff);
        System.out.println(ff);
        System.out.println(fff+ff);

        System.out.println(":)))))))))))))))))))))))))))))))))))))))))");
               
        }
}
