public class GCD {
    public static void main(String[] args) {
        int a = 24;
        int b= 36;
        int result = CheckGreatestCommonDiviser(a,b);
        System.out.println("The GCD for " + a + " and " + b + " is : " + result);

    }
    public static int CheckGreatestCommonDiviser(int first, int second){
        if (first < 10 || second < 10){
            return -1;
        }
        while (second != 0){
            int temp = second;
            second = first % second;
            first = temp;
        }
        return first;
    }
}
