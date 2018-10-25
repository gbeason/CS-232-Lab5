package cs232lab5d;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import java.util.concurrent.ThreadLocalRandom;

public class CS232Lab5D extends JPanel {
    
    private final int MAX_LAYER = 10;
    
    private ArrayList<Shape> shapes;
    
    /* CONSTRUCTOR */
    
    public CS232Lab5D() {
        
        super();
        
        this.setBackground(Color.decode("#00BFFF")); // Deep Sky Blue

        shapes = new ArrayList<>();
        
        /* Create Shapes */
        
        //shapes.add(new Rectangle(100, 100, 0, 100, 100));
        //shapes.add(new Circle(400, 100, 1, 50));
        //shapes.add(new Triangle(250, 350, 2, 100, 100));
        
        for(int i = 0; i < 10; i++){
            shapes.add(new Rectangle(ThreadLocalRandom.current().nextInt(1, 500 + 1),ThreadLocalRandom.current().nextInt(1, 500 + 1),ThreadLocalRandom.current().nextInt(0, 9 + 1),ThreadLocalRandom.current().nextInt(10, 100 + 1),ThreadLocalRandom.current().nextInt(10, 100 + 1)));
            shapes.add(new Circle(ThreadLocalRandom.current().nextInt(1, 500 + 1),ThreadLocalRandom.current().nextInt(1, 500 + 1),ThreadLocalRandom.current().nextInt(0, 9 + 1),ThreadLocalRandom.current().nextInt(10, 100 + 1)));
            shapes.add(new Triangle(ThreadLocalRandom.current().nextInt(1, 500 + 1),ThreadLocalRandom.current().nextInt(1, 500 + 1),ThreadLocalRandom.current().nextInt(0, 9 + 1),ThreadLocalRandom.current().nextInt(10, 100 + 1),ThreadLocalRandom.current().nextInt(10, 100 + 1)));
        }
        
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        
        super.paintComponent(g);

        /* Iterate through Layers 1 through 10 */
        
        for (int i = 0; i < MAX_LAYER; ++i) {

            /* Iterate through Shape collection */
        
            for (Shape s : shapes) {

                /* Get X and Y coordinates */
                
                int x = s.getX();
                int y = s.getY();

                /* Check Layer */
                
                if (s.getZ() == i) {

                    /* RECTANGLE */

                    if (s instanceof Rectangle) {

                        g.setColor(Color.decode("#B22222")); // Firebrick Red
                        
                        // INSERT YOUR CODE HERE
                        g.fillRect(x-((Rectangle) s).getBase()/2, y-((Rectangle) s).getHeight()/2, ((Rectangle) s).getBase(), ((Rectangle) s).getHeight());

                    }

                    /* CIRCLE */

                    else if (s instanceof Circle) {

                        g.setColor(Color.YELLOW); // Yellow

                        // INSERT YOUR CODE HERE
                        g.fillOval(x-((Circle) s).getRadius(), y-((Circle) s).getRadius(), ((Circle) s).getRadius()*2, ((Circle) s).getRadius()*2);

                    }

                    /* TRIANGLE */

                    else if (s instanceof Triangle) {

                        g.setColor(Color.decode("#228B22")); // Forest Green
                        
                        // INSERT YOUR CODE HERE
                        int[] xt = {x-((Triangle) s).getBase()/2,x+((Triangle) s).getBase()/2,x};
                        int[] yt = {y+((Triangle) s).getHeight()/2,y+((Triangle) s).getHeight()/2,y-((Triangle) s).getHeight()/2};
                        g.fillPolygon(xt, yt, 3);

                    }
                    
                    /* Tag shape with area */

                    g.setColor(Color.ORANGE);
                    g.drawString(Integer.toString((int)s.area()), x, y);
                    
                } // end layer if

            } // end shapes loop
            
        } // end layer loop
        
    } // end paintComponent()

}