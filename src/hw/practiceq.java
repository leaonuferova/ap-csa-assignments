package src.hw;

public class practiceq {
    public static void main(String[] args) {
        one();
        two();
        three();
        four();
        five(); 
        seven(); 

    }

    static void one(){
        int x = 5;
        double temperature = 75.6;
        char grade = 'A';
        String name = "Adam";
        System.out.println(x + " " + temperature + " " + grade + " " + name);
    }

    static void two(){
        double register = 10.0;
        register = register + 5;
        register = register - 2.5;
        register = register + 10;
        register = register - 3;
        System.out.println(register);
    }

    static void three(){
        int bankBalance = 500;
        bankBalance = bankBalance + 250;
        bankBalance = bankBalance - 100;
        System.out.println(bankBalance);

    }

    static void four(){
        System.out.println(2.0*(5 / 2));
    }

    static void five(){
        int day = 14;
        String month = " january";
        System.out.println(day + month);
    }

    static void seven(){
        double fahrenheit = 47;
        double celsius = (fahrenheit - 32)*5/9;
        System.out.println(celsius);
    }
}


