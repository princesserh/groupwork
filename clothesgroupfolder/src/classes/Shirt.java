package classes;

public class Shirt extends Clothes implements IWashable {

    private int length;

    private int sleeveLength;

    public int getSleeveLength() {
        return sleeveLength;
    }

    public void setSleeveLength(int sleeveLength) {this.sleeveLength = sleeveLength;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String giveClothingInfo(){
        return "This item is a shirt";
    }

    @Override
    public String handWash(){
        return "Shirt is being hand washed";
    }

    @Override
    public String machineWash(){
        return "Shirt is being machine washed";
    }
}
