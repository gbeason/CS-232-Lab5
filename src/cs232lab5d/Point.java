package cs232lab5d;

public class Point {
    
    private int x,y,z;
    
    public Point(){
        x = 0;
        y = 0;
        z = 0;
    }
    
    public Point(int x, int y, int z){
        
        if(x<0){
            this.x=0;
        }
        else if(x>500){
            this.x=500;
        }
        else{
            this.x=x;
        }
        
        if(y<0){
            this.y=0;
        }
        else if(y>500){
            this.y=500;
        }
        else{
            this.y=y;
        }
        
        if(z<0){
            this.z=0;
        }
        else if(z>500){
            this.z=500;
        }
        else{
            this.z=z;
        }
        
        
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
    
    
    
}
