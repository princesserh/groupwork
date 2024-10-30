import classes.*;

public class Main {
    public static void main(String[] args) {
        queries();
    }

    public static void queries(){
        Shirt shirt1 = new Shirt();
        Trousers trousers1 = new Trousers(10);
        Shirt shirt2 = new Shirt();
        shirt2.setColor(ClothingColor.BLACK);
        Dress dress1 = new Dress();
        Skirt skirt1 = new Skirt();

        Clothes[] clothes = {shirt1, trousers1, shirt2, dress1, skirt1};
        for (Clothes c: clothes){
            //System.out.println(c);
            System.out.println(c.giveClothingInfo());
        }
    }
}