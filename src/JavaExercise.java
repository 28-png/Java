import java.util.ArrayList;

public class JavaExercise {

    public static String compare(int a, int b) {
    if(a < b)
             return  a + " < " + b;
    else if(a > b)
       return a + " > " + b;
    else
        return a + " == " + b;
}

public static ArrayList<ArrayList<Integer>> list(ArrayList<Integer> listToTry, int target) {
        ArrayList<ArrayList<Integer>> sums = new ArrayList<>();
        return sums;
    }

    public static ArrayList<Integer> fac(int num) {
        ArrayList<Integer> number = new ArrayList<>();
        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                number.add(i);
            }
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println(compare(1, 2));

        System.out.println(fac(4));
    }



}