package cs232lab5d;

public class Rectangle extends Shape implements Comparable<Shape> {
    
    private double base, height;
    private Point center;
    
    @Override
    public int compareTo(Shape s){
        return (int)(this.area()-s.area());
    }
    
    public Rectangle(){
        super(0,0,0);
        this.base = 1.0;
        this.height = 1.0;
    }
    
    public Rectangle(int x, int y, int z, double b, double h){
        super(x,y,z);
        this.base = b;
        this.height = h;
        
    }
    
    public Rectangle(int x, int y, int z, int b, int h){
        super(x,y,z);
        this.base = b;
        this.height = h;
        
    }
    
    @Override
    public double area(){
        
        return (base*height);
    }
    
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("(");
        s.append(super.getX()).append(",").append(super.getY()).append(",").append(super.getZ());
        s.append("): [ ").append(area()).append(" ]");
        return s.toString();
    }

    public int getBase() {
        return (int)base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public int getHeight() {
        return (int)height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    
    
}
