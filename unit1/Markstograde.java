import java.util.*;
class Markstograde {
    public static void main(String args[]){
        System.out.print("enter your marks: ");
        Scanner scan=new Scanner(System.in);
        Float num=scan.nextFloat();
        if(num>=80){
            System.out.println("\nGrade O");
        }
        if(num<80 && num>=70){
            System.out.println("Grade A+");
        }
        if(num<70 && num>=60){
            System.out.println("Grade A");
        }
        if(num<60 && num>=50){
            System.out.println("Grade B+");
        }
        if(num<50 && num>=40){
            System.out.println("Grade B");
        }
        if(num<40 && num>=35){
            System.out.println("Grade C");
        }
        if(num<35){
            System.out.println("Fail");
        }
    }

    
}