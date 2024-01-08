public class Stars {
    public static void main(String[] args) {
        SquareStar (11);
        }
    public static void SquareStar(int number){
        if (number < 5){
            System.out.println("Invalid Value");
            return;
        }
        for (int row = 1; row < number; row++){
            for (int col = 1; col < number; col++){
                if (row == 1 || row == number || col == 1 || col == number || col == row || col == (number - row + 1)){
                    System.out.printf("*");
                }
                else {
                    System.out.printf(" ");
                }
            }
            System.out.println();

        }
    }
}
