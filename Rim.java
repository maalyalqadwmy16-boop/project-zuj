
package Assignment_UN;


public class Rim {
    
    private String screws;
    private int diameter;
    private int width;
    private String material;

    public Rim() {
    }

    public Rim(String screws, int diameter, int width, String material) {
        this.screws = screws;
        this.diameter = diameter;
        this.width = width;
        this.material = material;
    }

    public String getScrews() {
        return screws;
    }

    public void setScrews(String screws) {
        this.screws = screws;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Rim{" + "screws=" + screws + ", diameter=" + diameter + ", width=" + width + ", material=" + material + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
