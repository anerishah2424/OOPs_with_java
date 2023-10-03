class Property{
    String location;
    int pId;
    long areaInYard;
    long  price_per_yard;
    static int Propertycount;
    public Property(){
        Propertycount++;
    }

    //parametrised constructor
    public Property(String location,int pId,long areaInYard,long price_per_yard){
        this.location=location;
        this.pId=pId;
        this.areaInYard=areaInYard;
        this.price_per_yard=price_per_yard;
        Propertycount++;
    }

    //copy constructor
    public Property(Property p1){
        location=p1.location;
        pId=p1.pId;
        areaInYard=p1.areaInYard;
        price_per_yard=p1.price_per_yard;
        Propertycount++;
    }
    //getter--setter
    public String get_Location(){
        return location;
    }

    public int get_pId(){
        return pId;
    }

    public long get_areaInYard(){
        return areaInYard;
    }

    public long get_price_per_yard(){
        return price_per_yard;
    }

    public void setlocation(String location){
         this.location=location;
    }

    public void setpId(int pId){
        this.pId=pId;   
    }

    public void setareaInYard(long areraInYard){
        this.areaInYard=areraInYard; 
    }   

    public void setpricePerYard(int price_per_yard){
        this.price_per_yard=price_per_yard;   
    }
    long calculatePrice(){
        return (areaInYard*price_per_yard);

    }
    void printPropertyInfo(){
        System.out.println("The property is located at "+get_Location());
        System.out.println("The property ID is: "+get_pId());
        System.out.println("Area in yards :"+get_areaInYard());
        System.out.println("Price per Yard is: "+get_price_per_yard());
    }
    int getTotalcount(){
        return Propertycount;
    }
}

class FurnishedHome extends Property{
    int FurnitureCharge;
    //parameterised constructor
    FurnishedHome(String location ,int pId , long areaInYard ,long price_per_yard,int FurnitureCharge ){
        super(location,pId,areaInYard,price_per_yard);
        this.FurnitureCharge=FurnitureCharge;

    }
    //default constructor
    FurnishedHome(){

    }
    long calculatePriceOfProperty(){
        long price = super.calculatePrice();
        return price+ 5/100*price;
    }
    void printPropertyInfo(){
        System.out.println("The property is located at "+get_Location());
        System.out.println("The property ID is: "+get_pId());
        System.out.println("Area in yards :"+get_areaInYard());
        System.out.println("Price per Yard is: "+get_price_per_yard());
    }
}

class shop extends Property{
    // parameterized constructor
    shop(String location ,int pId , long areaInYard ,long price_per_yard ) {
        super(location,pId,areaInYard,price_per_yard);
    }
    //default
    shop(){}
    //Override
    long calculatePriceOfProperty(){
        long price = super.calculatePrice();
        return price+ 4/100*price;

}
}

//main 
class Price {
    static int getTotalPrice(Property[] rs){
        int price=0;
        for(int i=0;i<rs.length;i++){
            price+=rs[i].calculatePrice();
        }
        return price;
    }
        public static void main(String args[]){
        Property r1=new Property("Vadodara",1,23,30000);
        r1.printPropertyInfo();

        Property f1=new FurnishedHome("Bharuch",2,300,10000,12000);
        f1.printPropertyInfo();

        Property S1=new shop("Kutch",3,400,20000);
        S1.printPropertyInfo();

        FurnishedHome f2=new FurnishedHome("Rajkot",4,10,100,12000);
        f2.printPropertyInfo();

        //polymorphism
        System.out.println(" \nAfter Polymorphism ");
        System.out.println("\n");
        Property poly1 = f1;
        poly1.printPropertyInfo();

        poly1=S1;
        poly1.printPropertyInfo();
        
        Property[] rs ={r1,f1,S1,f2};

        System.out.println("Total price of your properties is Rs : "+ getTotalPrice(rs));
    }
}

