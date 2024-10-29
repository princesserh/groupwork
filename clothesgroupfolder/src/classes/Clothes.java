package classes;

public abstract class Clothes {
    private ClothingMaterial material;
    private ClothingColor color;
    private ClothingStyle style;

    // private size

    public ClothingStyle getStyle() {
        return style;
    }

    public void setStyle(ClothingStyle style) {
        this.style = style;
    }
}
