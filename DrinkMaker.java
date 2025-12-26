package Assignment_UN;

 public abstract class DrinkMaker {

    private int water;
    private int sugar;

    public DrinkMaker() {
    }

    public DrinkMaker(int water, int sugar) {
        this.water = water;
        this.sugar = sugar;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public void fillWater() {

        System.out.println("Filling water");
    }

    public void boilWater() {

        System.out.println("Boiling water");
    }

    abstract public void addIngredients();

    public void serve() {

        System.out.println("Serving");
    }

    public void makeDrink() {

        fillWater();
        boilWater();
        addIngredients();
        serve();

    }

}
