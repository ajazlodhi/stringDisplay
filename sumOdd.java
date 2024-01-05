public class sumOdd {
    public static boolean checkOdd(int number){
        if (number <= 0) {
            return false;
        }
        return (number % 2 ==1 );
    }
    public static int summOddNumbers(int startNumber, int endNumber){
        if (startNumber <= 0 || endNumber <= 0 || endNumber < startNumber){
            return -1;
        }
        int sum = 0;
        for (int i = startNumber; i <= endNumber; i++){
            if (checkOdd (i)){
                sum += i;
            }
        }
        return sum;

    }
    public static void main(String[] args) {
        int startNumber = 1;
        int endNumber = 100;
        int sum = summOddNumbers(startNumber, endNumber);
        if (sum == -1){
            System.out.println("Invalid input");
        }
        else {
            System.out.println("The Sum of Odd Numbers between " + startNumber + " and " + endNumber + " is " + sum);
        }

    }
}
