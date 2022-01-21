package hw;

public class towers {
    public static void main(String[] args) {
        int chifuyu[][] = new int[8][8];
        int z = 0;
        int i = 0;
        int x = 0;
        for (i = 0; i < chifuyu.length; i++) {
            int y = (int) (Math.random() * 8);
            for (x = 0; x < chifuyu[i].length; x++) {
                if (x == y) {
                    chifuyu[i][x] = 1;
                } else {
                    chifuyu[i][x] = 0;
                }
                // System.out.printf("%4d", chifuyu[i][x]);

            }
            // System.out.println();

        }
        x = 0;
        while (x < 8) {
            for (i = 0; i < chifuyu.length; i++) {

                if (chifuyu[i][x] == 1) {
                    z++;
                }
            }
            if (z > 1) {
                System.out.println("hups for column " + x);
            }
            if (z == 0) {
                System.out.println("hups for column " + x);
            }
            x++;
            z = 0;

        }

        for (i = 0; i < chifuyu.length; i++) {
            for (x = 0; x < chifuyu[i].length; x++) {
                System.out.printf("%4d", chifuyu[i][x]);
            }
            System.out.println();

        }

    }
}

/**
 * z = 0;
 * int f = 0;
 * int r = 0;
 * while (r != 1)
 * for (int g = 0; g < chifuyu[f].length; g++) {
 * for (f = 0; f < chifuyu.length-1; f++) {
 * if (chifuyu[f][0] == 1) {
 * z++;
 * }
 * }
 * 
 * if (z == 0) {
 * r++;
 * for (i = 0; i < chifuyu.length; i++) {
 * for (int y = 0; y < chifuyu[f].length; y++) {
 * System.out.printf("%4d", chifuyu[i][x]);
 * 
 * }
 * }
 * 
 * }
 * 
 * }
 * 
 * /**
 * static void tower() {
 * for (int i = 0; i < chifuyu.length; i++) {
 * int y = (int) (Math.random() * 8);
 * for (int x = 0; x < chifuyu[i].length; x++) {
 * if (x == y) {
 * chifuyu[i][x] = 1;
 * } else {
 * chifuyu[i][x] = 0;
 * }
 * // System.out.printf("%4d", chifuyu[i][x]);
 * }
 * //System.out.println();
 * }
 * }
 * 
 * static void naoto(){
 * if (chifuyu[0][0] == )
 * }
 */
