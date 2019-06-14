import java.util.Scanner;
public class WeeklyChlng1 {
    public static void main (String[] args){
        //Write an application that will show a
        // list of numbers and indicate whether or not they are prime.

        //option 1: Scanner

        System.out.println("Welcome to prime Number checking!!");
        int num,num1,num2;      //declare variables
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a Number: ");
        num =sc.nextInt();                 //for user to input
        num1=1;
        num2=0;
        while(num1<= num)
        {
            if((num%num1)==0)
                num2=num2+1;
            num1++;
        }
        if(num2==2)
            System.out.println(num +" is a prime number");
        else
            System.out.println(num +" is not a prime number");
        System.out.println("Thank you for playing, Good Bye! ");
    }
}



