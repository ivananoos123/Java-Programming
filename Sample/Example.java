import java.util.*;

public class Example {
    
}
class Complex { 
  
    private double re, im; 
  
    public Complex(double re, double im) { 
        this.re = re; 
        this.im = im; 
    } 
  
    // Overriding equals() to compare two Complex objects 
    public boolean equals(Object o) { 
  
        // If the object is compared with itself then return true   
        if (o == this) { 
            return true; 
        } 
  
        /* Check if o is an instance of Complex or not 
          "null instanceof [type]" also returns false */
        if (!(o instanceof Complex)) { 
            return false; 
        } 
          
        // typecast o to Complex so that we can compare data members  
        Complex c = (Complex) o; 
          
        // Compare the data members and return accordingly  
        return Double.compare(re, c.re) == 0
                && Double.compare(im, c.im) == 0; 
    } 
} 
  
// Driver class to test the Complex class 
public class Main { 
  
    public static void main(String[] args) { 
        Complex c1 = new Complex(10, 15); 
        Complex c2 = new Complex(10, 15); 
        if (c1.equals(c2)) { 
            System.out.println("Equal "); 
        } else { 
            System.out.println("Not Equal "); 
        } 
    } 
} /**class Cylinder{
    private Circle circle = new Circle();
    private float height;

    public Cylinder(){}

    public Cylinder(Circle circle, float height){
        this.circle=circle;
        this.height=height;
    }

    public Cylinder circle(Circle circle){
        this.circle=circle;
        return this;
    }

    public void setCircle(int x, int y, float radius){
        this.circle.setCenter(x, y);
        this.circle.setRadius(radius);
    }
    
    public void setHeight(float height){
        this.height = height;
    }

    public Circle getCircle(){
        return this.circle;
    }
    public float getHeight(){
        return this.height;
    }
    public Cylinder height(float height){
        this.height=height;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Cylinder)) {
            return false;
        }
        Cylinder cylinder = (Cylinder) obj;
        Circle circle = this.circle;
        return circle.equals(cylinder.circle) && height == cylinder.height;
    }
}

*/