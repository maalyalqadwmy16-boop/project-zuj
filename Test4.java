package Assignment_UN;

public class Test4 {

    public static void main(String[] args) {

        TeaMaker tm = new TeaMaker();

        tm.setWater(2);
        tm.setTea(10);
        tm.setSugar(300);
        tm.makeDrink();

        CoffeeMaker cm = new CoffeeMaker();

        cm.setWater(1);
        cm.setCoffee(400);
        cm.setSugar(250);
        cm.makeDrink();

        HerbsMaker hm = new HerbsMaker();

        hm.setWater(1);
        hm.setHerb("Chamomile");
        hm.setSugar(250);
        hm.makeDrink();

    }
}
