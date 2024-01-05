public class WhileLoopExcercise {
    public static void main(String[] args) {
        int num = 16461;
        if (CheckPalindrome(num)){
            System.out.println(num + " >>> Number is a Pelindrom Number");
        }
        else {
            System.out.println(num + "Number is not Pelindrom Number ");
        }

    }
    public static boolean CheckPalindrome(int number){
        int palindrome = number;
        int reverse = 0;
        while (palindrome != 0){
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
            }
        return (number == reverse);
    }
}
