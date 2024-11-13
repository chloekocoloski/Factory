import java.util.Random;

public class Pumpkin {
    //variables big, color, shape, Halloween pumpkin
    int size;
    String color;
    String shape;
    boolean isHalloween;

    public Pumpkin(String pShape, String pColor, int pSize, boolean pIsHalloween){
        System.out.println("making a pumpkin");
        color = pColor;
        shape = pShape;
        size = pSize;
        isHalloween = pIsHalloween;



    }


    public Pumpkin(){
        color = "white";
        shape = "oval";
        size = 100;
        isHalloween = false;


    }


    public void printInfo(){
        System.out.println(color);
        System.out.println("size: " + size);
        System.out.println(shape);

        if (isHalloween){
            System.out.println("I will be used for Halloween!!!");
        } else {
            System.out.println("I am a regular Pumpkin...");
        }

    }

}
