
package Assignment_UN;


 public class HerbsMaker extends DrinkMaker{
    
    private String herb;

    public HerbsMaker() {
    }

    public HerbsMaker(String herb) {
        this.herb = herb;
    }

    public HerbsMaker(String herb, int water, int sugar) {
        super(water, sugar);
        this.herb = herb;
    }

    public String getHerb() {
        return herb;
    }

    public void setHerb(String herb) {
        this.herb = herb;
    }

    @Override
    public String toString() {
        return "HerbsMaker{" + "herb=" + herb + '}';
    }
    
    @Override
    public void addIngredients(){
        System.out.println("Add sugar");
        System.out.println("Add herbs");
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
