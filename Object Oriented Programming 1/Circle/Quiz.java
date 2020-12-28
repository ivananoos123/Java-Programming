class MyPoint{
    private int x;
    private int y;
    public MyPoint (){}
    public MyPoint(int x, int y){
        this.x = (x);
        this.y = (y);
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public int getX(int x){
        return x;
    }
    public int getY(int y){
        return y;
    }

    public boolean equals(Object obj){

		if (obj == this){
            return true;
        }
        if(!(obj instanceof MyPoint)){
            return false;
        }

        MyPoint point = (MyPoint) obj;
        
        return Double.compare(x, point.x) == 0 && Double.compare(y, point.y) == 0; 

    }
    public String toString(){
        return "("+this.x+"," +this.y+")";
    }
}
class Circle{

    private MyPoint center = new MyPoint();
    private float radius;

    public Circle(){}

    public Circle(MyPoint center, float radius){
        this.center = center;
        this.radius = radius;
    }
    public Circle (int x, int y, float radius){
        this.center.setX(x);
        this.center.setY(y);
        this.radius = radius;
    }
    public void setCenter(MyPoint center){
        this.center=center;
    }
    public void setCenter (int x, int y){
        this.center.setX(x);
        this.center.setY(y);
    }
    public void setRadius(float radius){
        this.radius=radius;
    }

    public float getRadius(){return radius;}
    public MyPoint getCenter(){return center;}

    public Circle center(MyPoint center) {
        this.center = center;
        return this;
    }
    public Circle radius(float radius) {
        this.radius = radius;
        return this;
    }
        public boolean equals(Object obj) {

            if (obj == this){
                return true;
            }
            if (!(obj instanceof Circle)) {
            return false;
            }

            Circle circle = (Circle) obj;
            MyPoint point = this.center;
            return point.equals(circle.center) && radius == circle.radius;
        }
   

        public String toString() {
            return "Radius: ("+ getRadius() + "," + getCenter()+")";
        }
    
        public float getArea() {
            return (float)Math.PI * this.radius * this.radius;
        }
    
        public float getCircumference() {
            return 2 * (float)Math.PI * this.radius;
        }
}

class Cylinder{
    private Circle circle = new Circle();
    private float height;

    public Cylinder(){}

    public Cylinder(Circle circle, float height){
        this.circle=circle;
        this.height=height;
    }
    public Cylinder(int x, int y, float radius, float height){
        this.height = height;
        this.circle.setCenter(x, y);
        this.circle.setRadius(radius);
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

    public Cylinder circle(Circle circle){
        this.circle=circle;
        return this;
    }
    public Cylinder height(float height){
        this.height=height;
        return this;
    }


    public boolean equals(Object obj) {
            if (obj== this)
                return true;
            if (!(obj instanceof Cylinder)) {
                return false;
            }

        Cylinder cylinder = (Cylinder) obj;
        Circle circle = this.circle;
        return circle.equals(cylinder.circle) && height == cylinder.height;
    }

    
   public String toString() {

    String height = String.format("\nHeight: %.2f", getHeight());
    String radius = "Radius: " + String.format("%.2f",this.circle.getRadius());
    String point = "\nPoint: " + this.circle.getCenter();
    
    return  radius + point + height;
}

    

    public float getArea() {
    float area;
    area = 2 * this.circle.getArea() + 2 * (float)Math.PI * this.circle.getRadius() * height;
    return Float.valueOf(String.format("%.2f",area));
    }

    public float getVolume() {
    float volume; 
    volume = this.circle.getArea() * height;
    return Float.valueOf(String.format("%.2f", volume)); 
    }  

}
/**
 * InnerMypoint
 */
public class Quiz {
    public static void main(String[] args) {
        	
/*Cylinder c = new Cylinder(new Circle(5,5,10.5f),25);
System.out.println(c);
System.out.println("Area: "+c.getArea());
System.out.println("Volume: "+c.getVolume());

Cylinder c = new Cylinder();
c.setCircle(10,20,4.5f);
c.setHeight(10);
System.out.printf("Radius: %.2f\n",c.getCircle().getRadius());
System.out.println("Point: "+c.getCircle().getCenter());
System.out.printf("Height: %.2f\n",c.getHeight());

Cylinder c1 = new Cylinder(new Circle(5,5,5),10);
Cylinder c2 = new Cylinder(new Circle(5,5,5),10);
Circle circle = new Circle(5,5,5);
System.out.println(c1.equals(c2));
System.out.println(c1.equals(circle));

Circle c = new Circle();
System.out.println(c);
c.setRadius(25);
c.setCenter(4,5);
System.out.println(c);

Circle circle  = new Circle(new MyPoint(1,2),4.5f);
System.out.println(circle);

	
Circle circle = new Circle (10,20,11.5f);
System.out.println(circle);

	
Circle c = new Circle(10,20,5);
System.out.printf("Area: %.2f\n",c.getArea());
System.out.printf("Circumference: %.2f",c.getCircumference());

*/
    }
}