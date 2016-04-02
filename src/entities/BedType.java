
package entities;

public enum BedType {
    SINGLE(80f), 
    DOUBLE(120f), 
    SINGLE_SINGLE(130f), 
    SINGLE_DOUBLE(180f),
    DOUBLE_DOUBLE(200f); 
    
    private final float price;
    BedType(float f){
        this.price = f;
    }
    
    protected float getBedPrice(){
        return price;
    }
    
    @Override
    public String toString(){
        String s = "";
        switch(this){
            case SINGLE:
                s = "Single";
                break;
            case DOUBLE:
                s = "Double";
                break;
            case SINGLE_SINGLE:
                s = "Single & Single";
                break;
            case SINGLE_DOUBLE:
                s = "Single & Double";
                break;
            case DOUBLE_DOUBLE:
                s = "Double & Double";
                break;
        }
        return s;
    }
}
