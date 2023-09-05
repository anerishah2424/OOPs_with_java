import java.util.*;
class Temperature {
    public static void main(String args[]){
        Scanner scan =new Scanner(System.in);
        int number=scan.nextInt();
        double fahrenheit=(number-32)*5/9;
        System.out.println("Temperature in Fahrenheit: "+fahrenheit+"°F");
    
    }
    
}
