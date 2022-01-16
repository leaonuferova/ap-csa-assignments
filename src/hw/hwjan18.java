/**
1.
A) Create an Array of 1000 integer numbers -> 1,2,3,4 ... 1000 and then print them
B) Change all values by plus one and then print them
2.
A) Create an Array of 1000 integer numbers with random numbers and then print them
B) Count the occurrence of numbers within interval <10, 50> and print the result
3. Do both above tasks with two-dimensional arrays [n][m], 
where you will choose n and m in the beginning of the program. (n,m < 1000) */
package hw;

public class hwjan18 {
    public static void main(String[] args) {
        // taskoneA();
        // taskoneB();
        // tasktwoA();
        // tasktwoB();
        taskthreeoneA();
        // taskthreeoneB();
        // taskthreetwo();

    }

    static void taskoneA() {
        int[] ciselka = new int[1000];
        int i;
        for (i = 0; i < ciselka.length; i++) {
            ciselka[i] = i + 1;
            System.out.println(ciselka[i]);
        }
    }

    static void taskoneB() {
        int[] ciselka = new int[1000];
        int i;
        for (i = 0; i < ciselka.length; i++) {
            ciselka[i] = i + 2; // the only difference
            System.out.println(ciselka[i]);
        }
    }

    static void tasktwoA() {
        int corruption[] = new int[1000];
        int i;
        for (i = 0; i < 1000; i++) {
            corruption[i] = (int) (Math.random() * 1000);
            System.out.println(corruption[i]);
        }
    }

    static void tasktwoB() {
        int corruption[] = new int[1000];
        int i;
        int x = 0;
        for (i = 0; i < 1000; i++) {
            corruption[i] = (int) (Math.random() * 1000);
            System.out.println(corruption[i]);
            if (corruption[i] <= 50 && corruption[i] >= 10) {
                x += 1;
            }
        }
        System.out.println("the occurrence of numbers within interval <10, 50> :" + x);
    }

    static void taskthreeoneA() {
        int matrix[][] = new int[10][100];
        int n = 0;
        int m = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int x = 0; x < matrix[n].length; x++) {
                matrix[n][m] +=1;
                System.out.println(matrix[n][m]);
                n+=1;
            }
            m+=1;
        }
    }
}
