import java.util.*;
class Isprime {
    public static void main(String args[]){
        System.out.println("enter the number to be tested: ");
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int flag=0;
        for(int i=2;i<num;i++){
	    if (num==2){
                flag=0;
                break;
            }
            if((num%i)==0){
                flag=1;
            }
       
        }
         if (flag==1){
            System.out.println("Number is not prime");
        }
         else{
            System.out.println("Number is prime");
        }

    }

    
}
