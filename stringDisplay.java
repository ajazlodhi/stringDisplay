public class stringDisplay {

        public static void main(String[] args) {
            int a = 10;
            int b = 20;
            int c = 30;
            System.out.println("a is " + a + " and b is " + b + " and c is " + c);
            a = a + b;
            b = a - b;
            a = a - b;
            c =  c - b;
            System.out.println("After swapping, a is " + a + " and b is " + b + " and c is " + c);
        }
}
