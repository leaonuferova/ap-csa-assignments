package src.hw;

public class hwjan28 {
    public static void main(String[] args) {

        int[][] naruto = new int[10][10];
        for (int i = 0; i < naruto.length; i++) {
            for (int x = 0; x < naruto[i].length; x++) {
                naruto[i][x] = (int) (Math.random() * 10);
                System.out.printf("%3d", naruto[i][x]);
            }
            System.out.println();
        }

        System.out.println("the coordinates of peaks are:");

        for (int i = 1; i < naruto.length-1; i++) {
            for (int x = 1; x < naruto[i].length-1; x++) {
                if (naruto[i - 1][x - 1] < naruto[i][x]) {
                    if (naruto[i - 1][x] < naruto[i][x]) {
                        if (naruto[i - 1][x + 1] < naruto[i][x]) {
                            if (naruto[i][x - 1] < naruto[i][x]) {
                                if (naruto[i][x + 1] < naruto[i][x]) {
                                    if (naruto[i + 1][x - 1] < naruto[i][x]) {
                                        if (naruto[i + 1][x] < naruto[i][x]) {
                                            if (naruto[i + 1][x + 1] < naruto[i][x]) {
                                                System.out.println(i + ":" + x);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }
    }
}