public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 60, x = 21, sum = 0;
        do {
            System.out.println("Value after the Do loop completed : " +i);
            i++;
        }
        while (i < 5);
        do {
            sum += x;
            x--;
        }
        while (x > 10);
        System.out.println("Summation : " +sum);
    }
}
