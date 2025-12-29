
package Assignment_UN;


public class Tyre {
    
    private int width;
    private int hight;
    private int diameter;

    public Tyre() {
    }

    public Tyre(int width, int hight, int diameter) {
        this.width = width;
        this.hight = hight;
        this.diameter = diameter;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Tyre{" + "width=" + width + ", hight=" + hight + ", diameter=" + diameter + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
