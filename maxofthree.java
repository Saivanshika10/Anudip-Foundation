import java.util.Scanner;

public class maxofthree {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner (System.in);
        System.out.println("enter first number");
        int num1 = Scanner.nextInt();
        System.out.println("enter second number");
        int num2 = Scanner.nextInt();
        System.out.println("enter third number");
        int num3 = Scanner.nextInt();

        int max;
        if(num1>=num2 && num1>=num3) {
            max=num1;
        }
        else if (num2>=num1 && num2>=num3){
            max=num2;

        }
        else {
            max = num3;
        }
        System.out.println("the maximum number is" + max);
        
        }


    }
    

