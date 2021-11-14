package hw;
public class homeworkoct4 {
    
public static void main (String[] args) {
    fahrenheit(212);
    inches(1000.0);
    minutes(3456789);
    bmi(452, 72);

}

static void fahrenheit(int a){
double b = (a-32)/1.8;
System.out.println("212.0 degree Fahrenheit is equal to " + b + " in Celsius");

}

static void inches(double c) {
    double d = c*0.0254;
    System.out.println("1000.0 inch is " + d + " meters");
}

static void minutes(long e){
    long f = e/525600L;
    double g = ((e%525600)*0.000694444);
    System.out.println("3456789 minutes is approximately " + f + " years and " + g + " days");
}

static void bmi(int h, int i){
    double j = h*0.45359237;
    double k = i*0.0254;
    double l = j/(k*k);
    System.out.println("Body Mass Index is " + l);
}
}
