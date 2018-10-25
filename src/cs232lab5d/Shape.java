package cs232lab5d;

public abstract class Shape implements Comparable<Shape> {
    
    private Point center;
    
    public Shape(){
        this.center = new Point(0,0,0);
    }
    
    public Shape(int x, int y, int z){
        this.center = new Point(x,y,z);
    }
    
    public abstract double area();
    
    public int getX(){
        return center.getX();
    }
    
    public int getY(){
        return center.getY();
    }
    public int getZ(){
        return center.getZ();
    }
    
    
}
