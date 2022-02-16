package src.hw;

import java.util.ArrayList;
import java.util.Collections;

public class orderarray {
    public static void main(String[] args) {
        toadsage();
        egasdaot();
    }

    static void toadsage() {
        
        System.out.println("alphabetical ascending");

        ArrayList<String> parapam = new ArrayList<String>();
        parapam.add("Sasuke");
        parapam.add("Sakura");
        parapam.add("Konohmaru");
        parapam.add("Naruto");
        parapam.add("Shikamaru");
        parapam.add("Ino");


        System.out.println("Before sorting: " + parapam);
        Collections.sort(parapam); 
        System.out.println("After sorting: " + parapam);

    }

    static void egasdaot(){
        
        System.out.println("alphabetical descending");

        ArrayList<String> tsts = new ArrayList<String>();
        tsts.add("Orochimaru");
        tsts.add("Gaara");
        tsts.add("Temari");
        tsts.add("Itachi");
     
        System.out.println("Before sorting: " + tsts);
        Collections.sort(tsts, Collections.reverseOrder());
        System.out.println("After sorting: " + tsts);


    }

}
