class first
{
    public static void main(String args[])
    {
        float f=5.6f;
        int x=(int)f;
        System.out.println(x);
        int a =257;
        byte k=(byte) a;
        System.out.println(k);
        System.out.print("hello world ");

        //conditional statement 
        if(x>10)
           System.out.println("'hi u r in");
        else
           System.out.println(" u r out");
        if(x<10 && x>0)
        {
           System.out.println("u r in ");
           System.out.print("ok byebye");
        }
        
        //greatest of 3
        int j=34;
        int y=78;
        int z=3;

        if (j>y && j>z)
          System.out.println(j);
        else if(y>j && y>z)
          System.out.println(y);
        else 
          System.out.println(z);
        //loops 

        while(z>0)
        {
            System.out.println("HI");
            z--;
        }





    }
}