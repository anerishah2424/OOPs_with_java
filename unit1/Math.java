import java.util.Scanner;

class Math {
    public static void main(String args[]){
        System.out.print("enter first number: ");
        Scanner scan=new Scanner(System.in);
        int num1=scan.nextInt();
        System.out.print("enter second number: ");
        int num2=scan.nextInt();
        System.out.println("Sum of the numbers is: "+(num1+num2));
        System.out.println("Difference of the numbers is: "+(num1-num2));
        System.out.println("Product of the numbers is: "+(num1*num2));
        System.out.println("Quotient of the numbers is: "+(num1/num2));
}
}
