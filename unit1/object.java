class computer
{
    public void playmusic()
    {
        System.out.println("music on");
    }

    public String getpen(int cost)
    {
        if(cost>=5)
         return "pen";
        else 
         return "no pen";
    }
}
public class object {
    public static void main(String args[])
    {
        int cost=10;
        computer ob = new computer();
        ob.playmusic();
        String str =ob.getpen(cost);
        System.out.println(str);
      
    }
   
}


