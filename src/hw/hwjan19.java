// 1. Assume we have one thousand random integer numbers in an array within a range <1..1000)
// 2. What are the three most occurring numbers from that array and how often do they occur?
// 3. Find the position (positions) of the element that takes the minimum value and print those positions

package hw;

public class hwjan19 {
    public static void main(String[] args) {
        tokyomanjigang();
    }

    static void tokyomanjigang(){
        int toman[] = new int[450];
        int y = 0;
        for (int i = 0; i < toman.length; i++){
            toman[i] = (int) (Math.random()*450);
            for(int x = toman[i]; x < i; i--){
                if(x==toman[i-1]){
                    y++;
                }
                else{
                    System.out.println("pifpaf");
                }
            }
            System.out.println(toman[i]);
            System.out.println(y);
        }
    }
}

