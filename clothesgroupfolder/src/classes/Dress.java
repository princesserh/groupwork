package classes;

public class Dress extends Clothes implements IWashable {
    private int dressLength;

    private int fitting;

    private int style;

    @Override
    public String giveClothingInfo(){
        return "This item is a dress";
    }

    @Override
    public String handWash(){
        return "The Dress is being hand washed";
    }

    @Override
    public String machineWash(){
        return "The Dress is being machine washed";
    }
}
