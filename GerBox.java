
package Assignment_UN;


public class GerBox {
    
    private int shift;
    private boolean automatic;

    public GerBox() {
    }

    public GerBox(int shift, boolean automatic) {
        this.shift = shift;
        this.automatic = automatic;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    @Override
    public String toString() {
        return "GerBox{" + "shift=" + shift + ", automatic=" + automatic + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
