package classes;

public class Trousers extends Clothes implements IWashable {
    public Trousers(int legLength){
        this.setLegLength(15);
    }

    private int legLength;

    public int getLegLength() {
        return legLength;
    }

    public void setLegLength(int legLength) {
        this.legLength = legLength;
    }

    @Override
    public String giveClothingInfo() {
        return "These are trousers";
    }


    @Override
    public String handWash(){
        return "Trousers are being hand washed";
    }

    @Override
    public String machineWash(){
        return "Trousers are being machine washed";
    }
}
