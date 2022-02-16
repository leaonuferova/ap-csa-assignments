package src.hw;

public class queens {
    public static void main(String[] args) {
        boolean end = false;
        int count = 0;
        String sasuke[][] = new String[8][8];
        System.out.println("ide");

        while (end == false) {
            for (int i = 0; i < sasuke.length; i++) {
                int y = (int) (Math.random() * 8);
                for (int x = 0; x < sasuke[i].length; x++) {
                    if (x == y) {
                        sasuke[i][x] = "q";
                    } else {
                        sasuke[i][x] = "*";
                    }
                }
            }

            for (int i = 0; i < sasuke.length; i++){
                for (int x = 0; x < sasuke[i].length; x++){
                    if (sasuke[i][x]=="q"){
                        int r = i;
                        int c = x;
                        for (int a = 1; a < sasuke.length-i; a++){
                            for (int b = 1; b < sasuke[i].length-x; b++){
                                if (sasuke[i][x+b]=="q"){
                                    
                                }
                                if (sasuke[i][x+b]=="q");
                            }
                        }
                    }
                }
            }


            
        }
        System.out.println("ide?");
        for (int i = 0; i < sasuke.length; i++) {
            for (int x = 0; x < sasuke[i].length; x++) {
                System.out.printf("%3d", sasuke[i][x]);
            }
            System.out.println();
        }
        System.out.println("tried: " + count);
    }
    


    }


/**
            int rmax = 8; //row max
            int cmax = 8; //column max
            for (int i = 0; i < sasuke.length; i++){
                for (int x = 0; x < sasuke[i].length; x++){
                    if (sasuke[i][x] == "q"){
                        int c = 1;
                        while (c<rmax&&c<cmax){
                            rmax=i;
                            cmax=x;
                        if ((sasuke[i-c][x-c]=="q")||(sasuke[i-c][x]=="q")||(sasuke[i-c][x+c]=="q")||(sasuke[i][x-c]=="q")||
                        (sasuke[i][x+c]=="q")||(sasuke[i+c][x-c]=="q")||(sasuke[i-c][x]=="q")||(sasuke[i+c][x+c]=="q")){
                            c++;
                            rmax++;
                            cmax++;
                            end = false;
                        }
                        else {
                            end = true;
                        }
                        count++;
                        
                        }
                    }
                }
            }
 */
