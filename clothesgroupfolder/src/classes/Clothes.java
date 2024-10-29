package classes;

public abstract class Clothes {
    private ClothingMaterial material;
    private ClothingColor color;
    private ClothingStyle style;
    // private size


    public ClothingMaterial getMaterial() {
        return material;
    }

    public void setMaterial(ClothingMaterial material) {
        this.material = material;
    }

    public ClothingColor getColor() {
        return color;
    }

    public void setColor(ClothingColor color) {
        this.color = color;
    }


    public ClothingStyle getStyle() {
        return style;
    }

    public void setStyle(ClothingStyle style) {
        this.style = style;
    }
}
