package classes;

public class Skirt extends Clothes implements IWashable {
    @Override
    public String giveClothingInfo() {
        return "It is a skirt.";
    }
    @Override
    public String handWash(){
        return "Skirt is being handwashed.";
    }
    @Override
    public String machineWash(){
        return "Skirt is being machine washed.";
    }
}
