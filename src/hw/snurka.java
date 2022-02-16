package src.hw;
import java.util.Scanner;

public class snurka {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter a word you wished would disappear: ");
        String x = sc.nextLine();
        System.out.println(x +"? oukej here we go:");
        /**wait? */
        String s1 = x;
        int cisla = s1.length();
        int i = 0;
        while (i < cisla/2){
            s1 = s1.replace(s1.charAt(i), ' ' );
            s1 = s1.replace(s1.charAt(cisla-1), ' ' );
            System.out.println(s1);
            cisla = cisla - 1;
            i++;
        }
        
    }
}

