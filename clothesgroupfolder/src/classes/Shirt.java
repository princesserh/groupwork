package classes;

public class Shirt extends Clothes {

    private int length;
    private ClothingStyle style;

    public ClothingStyle getStyle() {
        return style;
    }

    public void setStyle(ClothingStyle style) {
        this.style = style;
    }

    
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
