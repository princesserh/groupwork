import classes.*;

public class Main {
    public static void main(String[] args) {
        queries();
    }

    public static void queries(){
        Shirt s1 = new Shirt();
        //System.out.println(s1.giveClothingInfo());

        Trousers t1 = new Trousers(10);
        Shirt s2 = new Shirt();
        s2.setColor(ClothingColor.BLACK);

        Clothes[] clothes = {s1, t1, s2};
        for (Clothes c: clothes){
            System.out.println(c);
            System.out.println(c.giveClothingInfo());
        }
    }
}