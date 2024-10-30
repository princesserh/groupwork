package classes;

public class Trousers extends Clothes {
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
}
