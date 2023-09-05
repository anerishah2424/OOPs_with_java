import java.util.*;
class Max {
    public static void main(String args[]){
        System.out.println("Enter 3 numbers: ");
        Scanner sc = new Scanner (System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int largestNumber= (n1>n2) ? (n1>n3 ? n1 : n3) : (n2 > n3 ? n2 : n3); 
        System.out.println(" Largest of 3 is: "+ largestNumber);



    }
}
