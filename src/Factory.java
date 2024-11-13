import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.jcp.xml.dsig.internal.dom.DOMSubTreeData;

public class Factory {
    String nameOfFactory;
    int yearFounded;
    boolean inUse;


    public static void main(String[] args) {
        System.out.println("Hello world!");
        new Factory();


    }

    public Factory(){
        nameOfFactory = "Pumpkin Factory: ";
        yearFounded = 1923;
        inUse = false;
        System.out.println(nameOfFactory + " " + yearFounded);
        System.out.println();

        //spookly
        System.out.println("SPOOKLY INFO");
        Pumpkin spookly = new Pumpkin("circular", "neon", 30, false);
        System.out.println(spookly.color);
        System.out.println(spookly.size);
        System.out.println();

        //boo
        System.out.println("BOO INFO");
        Pumpkin boo = new Pumpkin("square","pale",10, true);
        boo.printInfo();

        //ghost
        System.out.println();
        System.out.println("GHOST INFO");
        Pumpkin ghost = new Pumpkin("ghost", "transparent", 15, true);
        ghost.printInfo();

        //Casper info
        System.out.println();
        System.out.println("CASPER INFO");
        Pumpkin Casper = new Pumpkin();
        Casper.printInfo();

        //10 Pumpkin Homework
        System.out.println();
        System.out.println("JINX TEN PUMPKIN");
        for (int y = 1; y < 11; y = y + 1) {
            System.out.println("jinx pumpkin #" + y);
            Pumpkin jinx = new Pumpkin();
            jinx.size = (int)(Math.random()*100);

            if(jinx.size > 50) {
                (jinx.isHalloween) = true;
            } else {
                jinx.isHalloween = false;
            }

            jinx.printInfo();
            System.out.println();

        }

        System.out.println("factory aquired by custard company.");
        System.out.println("now our factory makes custards and pumpkins");
        System.out.println();
        nameOfFactory = "Custard Pumpkin Factory";
        System.out.println(nameOfFactory);

        Custard Original = new Custard();
        Original.printInfo();

        Custard Burnt = new Custard("burnt", 10, 2 );
        Burnt.printInfo();

    }
}
