package entities;

public class RoomServiceItem {
    private String name; 
    private String description; //description of how it is prepared
    private float price;
    
    public RoomServiceItem(String name, float price){
        this(name, "", price);
    }
    
    public RoomServiceItem(String name, String description, float price){
        this.name = name;
        this.description = description;
        this.price = price;
    }
    
    //getters
    public String getItemName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public float getPrice(){
        return price;
    }
    
    //setters
    public void setName(String name){
        this.name = name;
    }
    
    public void setDescription(String s){
        description = s;
    }
    public void setPrice(float f){
        price = f;
    }
}
