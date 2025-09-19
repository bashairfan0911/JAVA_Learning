
import java.util.Scanner;
public class FUN1 {
    public static void main(String[] args) {
      // sum();
      // int ans=sum2();
      // System.out.println(ans);
      int ans=sum3(20,30);
      System.out.println(ans);

    }
    static void sum(){
    Scanner in = new Scanner(System.in);
    System.out.print("enter your number 1: ");
    int num1=in.nextInt();
    System.out.print("enter your number 2: ");
    int num2=in.nextInt();
    
    int sum=num1 + num2;
    System.out.println("add: " + sum);
    }


    // Using return FUNction
    static int sum2(){
    Scanner in = new Scanner(System.in);
    System.out.print("enter your number 1: ");
    int num1=in.nextInt();
    System.out.print("enter your number 2: ");
    int num2=in.nextInt();
    
    int sum=num1 + num2;
    return sum;
    }

    // USing Parameter
    static int sum3(int a, int b){
        int sum=a+b;
        return sum;
    }
}
