package cs232lab5d;

public class Circle extends Shape implements Comparable<Shape> {
    
    private double radius;
    
    @Override
    public int compareTo(Shape s){
        return (int)(this.area()-s.area());
    }
    
    public Circle(){
        
        super(0,0,0);
        this.radius = 1.0;
        
    }
    
    public Circle(int x, int y, int z, double radius){
        
        super(x,y,z);
        this.radius = radius;
        
    }
    
    
    @Override
    public String toString(){
        
        StringBuilder s = new StringBuilder();
        s.append("(");
        s.append(super.getX()).append(",").append(super.getY()).append(",").append(super.getZ());
        s.append("): ( ").append(area()).append(" )");
        return s.toString();
    }
    
    @Override
    public double area() {
        return (Math.PI*Math.pow(radius, 2));
    }

    public int getRadius() {
        return (int)radius;
    }
    
    public double getCircumference(){
        return(2*Math.PI*radius);
    }


    
    

    
}
