import java.util.*;
class Arrayop {
    static int add(int arr[], int n){
        int sum= 0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        return sum;

    }
    static int maxm(int arr[], int n){
        int m=arr[0];
        for(int i=0;i<n;i++){
            if(m<arr[i]){
                m=arr[i];
            }
            
        }
        return m;

    }

    static int minm(int arr[], int n){
        int mi=arr[0];
        for(int i=0;i<n;i++){
            if(mi>arr[i]){
                mi=arr[i];
            }
            
        }
        return mi;

    }

    static void srt(int arr[], int n){
        int m=arr[0];
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if (arr[i]>=arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("Sorted array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
    static int avg(int arr[], int n){
        int sum= 0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        return sum/n;

    }
    

    public static void main(String args[]){
        System.out.println("Enter the size of array: ");
        Scanner sc=new Scanner (System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i =0;i<n ;i++){
            System.out.println("Enter the element: ");
            arr[i]=sc.nextInt();
        
        }
    
    

    System.out.println("Sum of the elements is: "+ add(arr,n));
    System.out.println("maximum of the elements is: "+ maxm(arr,n));
    System.out.println("minimum of the elements is: "+ minm(arr,n));
    srt(arr,n);
    System.out.println("Average of the elements is: "+ avg(arr,n));
    }
    
}
