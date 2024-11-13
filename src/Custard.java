public class Custard {
    //size
    //price
    //type
    int size;
    int price;
    String type;

    public Custard(){
        System.out.println();
        System.out.println("ORIGINAL CUSTARD");
        System.out.println("making a custard");
        size = 5;
        price = 5;
        type = "vanilla";
    }

    public Custard(String pType, int pSize, int pPrice){
        System.out.println();
        System.out.println("BURNT CUSTARD");
        System.out.println("making a custard");
        size = pSize;
        price = pPrice;
        type = pType;

    }

    public void printInfo(){
        System.out.println(size);
        System.out.println(price);
        System.out.println(type);

    }
}
