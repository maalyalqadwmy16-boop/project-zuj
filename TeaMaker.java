
package Assignment_UN;


public class TeaMaker extends DrinkMaker {
    
    
    private int tea;

    public TeaMaker() {
    }

    public TeaMaker(int tea) {
        this.tea = tea;
    }

    public TeaMaker(int tea, int water, int sugar) {
        super(water, sugar);
        this.tea = tea;
    }

    public int getTea() {
        return tea;
    }

    public void setTea(int tea) {
        this.tea = tea;
    }

    @Override
    public String toString() {
        return "TeaMaker{" + "tea=" + tea + '}';
    }
    @Override
    public void addIngredients(){
        System.out.println("Add sugar");
        System.out.println("Add tea");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
