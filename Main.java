public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to CS 112!");

    }

    //void method
    public static void getNum()
    {
        int x = 5;
        int y = 7;

        int result = addition(x, y);
        System.out.println("The sum is: " + result);
    }


    //returns int 
    public static int addition(int x, int y)
    {
        int sum = x + y;

        return sum;
    }

}