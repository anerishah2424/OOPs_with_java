class Residency
{
    String Location;
    int rnumber;
    long areaInYard;
    long priceperyard ;
    static int residencycount;
    {
        residencycount++;
    }

    public Residency( )
    {
        this.Location="NULL";
        this.rnumber=0;
        this.areaInYard=0;
        this.priceperyard=0;
    }

     public Residency(String s,int n,long aiy, long ppy)
    {
        this.Location=s;
        this.rnumber=n;
        this.areaInYard=aiy;
        this.priceperyard=ppy;
    }
     public Residency(Residency r )
    {
        this.Location=r.Location;
        this.rnumber=r.rnumber;
        this.areaInYard=r.areaInYard;
        this.priceperyard=r.priceperyard;
    }

    public long getpriceperyard()
    {
        return priceperyard;
    }
    public void setpriceperyard(long priceperyard)
    {
        this.priceperyard=priceperyard;
    }
     public long getareaInYard()
    {
        return areaInYard;
    }
    public void setareaInYard(long areaInYard)
    {
        this.areaInYard=areaInYard;
    }
    long calculatePriceOfResidency()
    {
        return areaInYard*priceperyard;
    }
    public void printResidencyInfo()
    {
        System.out.println("The location of the house is:"+Location+"\nand resident number is:"+ rnumber);
         System.out.println("The ares of the house is:"+areaInYard+"\n and price per yard is:"+priceperyard);

    }
    static int getTotalCount()
    {
        return residencycount;
        
    }
}

class FurnishedResidency extends Residency
{
   double furnitureCharge;

   public FurnishedResidency()
   {
        super();
        this.furnitureCharge=0;
   }
     public FurnishedResidency(String l,int r,long a ,long p,double fc)
   {
        super(l,r,a,p);
        this.furnitureCharge=fc;  
   }

    long calculatePriceOfResidency()
    {
        return super.calculatePriceOfResidency()+(int)(furnitureCharge);
    }
    public void printResidencyInfo()
    {
       super.printResidencyInfo();
       System.out.println("the charge of the recidency is:"+furnitureCharge);
    }

}
class NonFurnishedResidency extends Residency
{
  
   public NonFurnishedResidency()
   {
        super();
   }
     public NonFurnishedResidency(String ll,int rn,long ay ,long pp)
   {
        super(ll,rn,ay,pp);
   }

    long calculatePriceOfResidency()
    {
        return super.calculatePriceOfResidency()+(int)(0.02*super.calculatePriceOfResidency());
    }
    public void printResidencyInfo()
    {
       super.printResidencyInfo();
    }

}
class javapractical
{
    public static void main(String[] args)
    {
        Residency r1=new Residency("Nikol",2,23,30000);
        r1.printResidencyInfo();
       System.out.println("The price is:"+r1.calculatePriceOfResidency());

        Residency r2=new FurnishedResidency("Ahmedabad",23,234,345678,45600);
        r2.printResidencyInfo();
         System.out.println("\n The price is:"+r2.calculatePriceOfResidency());

        Residency r3=new NonFurnishedResidency("Surat",12,5214,78547);
        r3.printResidencyInfo();
        System.out.println("The price is:"+r3.calculatePriceOfResidency());

         Residency r4=new Residency();
        r4.printResidencyInfo();
        

    System.out.println("The Total house is "+Residency.getTotalCount());
    }

}

