package Assignment_UN;

public class car_ {

    private String Type;
    private int year;
    private String color;
    private Engine engine;
    private GerBox gerbox;

    public car_() {
    }

    public car_(String Type, int year, String color, Engine engine, GerBox gerbox) {
        this.Type = Type;
        this.year = year;
        this.color = color;
        this.engine = engine;
        this.gerbox = gerbox;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public GerBox getGerbox() {
        return gerbox;
    }

    public void setGerbox(GerBox gerbox) {
        this.gerbox = gerbox;
    }

    @Override
    public String toString() {
        return "car_{" + "Type=" + Type + ", year=" + year + ", color=" + color + ", engine=" + engine + ", gerbox=" + gerbox + '}';
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
