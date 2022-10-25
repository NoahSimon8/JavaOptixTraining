public class Abstraction {

    
}

abstract class Shirt{

    private String color;


    public abstract String getDescription();

    public Shirt(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }




}


class T_Shirt extends Shirt{
    private int size;
    private int price;

    public T_Shirt(String color, int size, int price){
        super(color);  
        this.size=size;
        this.price=price;


    }

    @Override
    public String getDesctiption(){


        return "Color: " + super.getColor() + "Size: " + size + "Price: " + price;
    }

}


class Jacket extends Shirt{
    private String brand;
    private int price;

    public Jacket(String color, String brand, int price){
        super(color);  
        this.brand=brand;
        this.price=price;


    }

    @Override
    public String getDesctiption(){


        return "Color: " + super.getColor() + "Brand: " + brand + "Price: " + price;
    }

}