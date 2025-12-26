package Assignment_UN;

public class Test3 {

    public static void main(String[] args) {

        Engine engine1 = new Engine();

        engine1.setCylenders(3);
        engine1.setHorsePower(250);
        engine1.setCapacity(2000);
        
        GerBox gerbox1 = new GerBox();
        gerbox1.setShift(3);
        gerbox1.setAutomatic(true);
        
        
        car_ c = new car_();

        c.setType("BM");
        c.setYear(2020);
        c.setColor("Blue");
        c.setEngine(engine1);

        c.setGerbox(gerbox1);
        System.out.println(c);
    }

}
