public class array {
    public static void main(String a[])
{ 
    int num[]=new int[4];
   
    num[0]=6;
    System.out.println(num[0]);
    int num1[][]= new int[2][3];

    for(int i=0;i<2;i++)
    {
        for(int j=0;j<3;j++)
        {   
            num1[i][j]=(int)(Math.random()*100);
            System.out.print(num1[i][j]+" ");

        }
    }


    for(int i=0;i<2;i++)
    {
        for(int j=0;j<3;j++)
        {
            System.out.print(num1[i][j]+" ");

        }
        System.out.println(); 
    }
}
    
}
