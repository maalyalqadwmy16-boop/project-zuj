
package Assignment_UN;


 public class CoffeeMaker extends DrinkMaker {
    
    private int coffee;

    public CoffeeMaker() {
    }

    public CoffeeMaker(int coffee) {
        this.coffee = coffee;
    }

    public CoffeeMaker(int coffee, int water, int sugar) {
        super(water, sugar);
        this.coffee = coffee;
    }

    public int getCoffee() {
        return coffee;
    }

    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }

    @Override
    public String toString() {
        return "CoffeeMaker{" + "coffee=" + coffee + '}';
    }
    @Override
    public void addIngredients(){
        System.out.println("Add sugar");
        System.out.println("Add coffee");
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
