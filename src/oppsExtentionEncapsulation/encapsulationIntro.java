package oppsExtentionEncapsulation;

public class encapsulationIntro
{
    public static void main(String[] args)
    {
        Laptop l1=new Laptop();
        l1.setPrice(23);
        System.out.println(l1.getPrice());
    }
}
class Laptop
{
    int ram;
    private int price;
    public void setPrice(int price)
    {
        boolean isAdmin=true;
        if(!isAdmin)
            System.out.println("you can not set the price.");
        else
            this.price=price;
    }

    public int getRam()
    {
        return ram;
    }
    public void setRam(int ram)
    {
        this.ram=ram;
    }
    public int getPrice()
    {
        return price;
    }
}







































































