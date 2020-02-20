public class JavaExercise {

    public static String compare(int a, int b) {
    if(a < b)
        return a + " != " + b + "\n" +
                a + " < " + b + "\n" +
                a + " <= " + b;
    else
        return a + " > " + b;
}

    public static void main(String[] args) {
        System.out.println(compare(1, 2));
    }



}