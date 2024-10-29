package classes;

public class Dress extends Clothes {
    private int dressLength;

    private int fitting;

    private int style;

    @Override
    public String giveClothingInfo(){
        return "This item is a dress";
    }
}
