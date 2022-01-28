package hw;

public class hwjan31 {
    public static void main(String[] args) {
        int[][] itachi = new int[10][10];
        boolean sequenceminor = false;
        boolean sequencemajor = false;
        int max = 4;
        int c = 0;
        int d = 0;
        while (sequenceminor==false){
        for (int i = 0; i < itachi.length; i++) {
            for (int x = 0; x < itachi[i].length; x++) {
                itachi[i][x] = (int) (Math.random() * 10);
            }
        }

        //minor
        for (int i = 0; i < itachi.length-max; i++) {
            for (int x = 0; x < itachi[i].length-max; x++){
                if (((itachi[i][x]==itachi[i][x+1]-1) && (itachi[i][x+1]==itachi[i][x+2]-1) && (itachi[i][x+2]==itachi[i][x+3]-1))||
                ((itachi[i][x]==itachi[i+1][x+1]-1) && (itachi[i+1][x+1]==itachi[i+2][x+2]-1) && (itachi[i+2][x+2]==itachi[i+3][x+3]-1))||
                ((itachi[i][x]==itachi[i+1][x]-1) && (itachi[i+1][x]==itachi[i+2][x]-1) && (itachi[i+2][x]==itachi[i+3][x]-1))){
                System.out.println("minor: " + i + ":" + x);
                sequenceminor = true;             
                }
            }
        }
        c++;
        }

        for (int i = 0; i < itachi.length; i++) {
            for (int x = 0; x < itachi[i].length; x++) {
                System.out.printf("%3d", itachi[i][x]);
            }
            System.out.println();
        }
        System.out.println("tries: " + c);

        while (sequencemajor==false){
            for (int i = 0; i < itachi.length; i++) {
                for (int x = 0; x < itachi[i].length; x++) {
                    itachi[i][x] = (int) (Math.random() * 10);
                }
            }
    
            System.out.println();
            
            //major
            for (int i = 0; i < itachi.length-max; i++) {
                for (int x = 0; x < itachi[i].length-max; x++){
                    if (((itachi[i][x]==itachi[i][x+1]+1) && (itachi[i][x+1]==itachi[i][x+2]+1) && (itachi[i][x+2]==itachi[i][x+3]+1))||
                    ((itachi[i][x]==itachi[i+1][x+1]+1) && (itachi[i+1][x+1]==itachi[i+2][x+2]+1) && (itachi[i+2][x+2]==itachi[i+3][x+3]+1))||
                    ((itachi[i][x]==itachi[i+1][x]+1) && (itachi[i+1][x]==itachi[i+2][x]+1) && (itachi[i+2][x]==itachi[i+3][x]+1))){
                    System.out.println("major: " + i + ":" + x);
                    sequencemajor = true;             
                    }
                }
            }
            d++;
            }
            for (int i = 0; i < itachi.length; i++) {
                for (int x = 0; x < itachi[i].length; x++) {
                    System.out.printf("%3d", itachi[i][x]);
                }
                System.out.println();
            }
            System.out.println("tries: " + d);
        

}
}
