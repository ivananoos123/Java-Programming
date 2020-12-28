public class Rectangle extends Point {

    private Point upperLeft;
    private Point lowerRight;
    
        public Rectangle() {}
    
        public Rectangle(int upperLeftX, int upperleftY, int LowerRightX, int LowerRightY) {
            this.upperLeft = new Point(upperLeftX,upperleftY);
            this.lowerRight = new Point(LowerRightX,LowerRightY);
        }
    
        public Point getUpperLeft() {
            return this.upperLeft;
        }
    
        public void setUpperLeft(Point upperLeft) {
            this.upperLeft = upperLeft;
        }

        public void setUpperLeft(int upperLeftX, int upperleftY) {
            upperLeft = new Point(upperLeftX,upperleftY);
        }
    
        public Point getLowerRight() {
            return this.lowerRight;
        }
    
        public void setLowerRight(Point lowerRight) {
            this.lowerRight = lowerRight;
        }

        public void setLowerRight(int LowerRightX, int LowerRightY) {
            lowerRight = new Point(LowerRightX,LowerRightY);
        }
    
        public Rectangle upperLeft(Point upperLeft) {
            this.upperLeft = upperLeft;
            return this;
        }
    
        public Rectangle lowerRight(Point lowerRight) {
            this.lowerRight = lowerRight;
            return this;
        }

        public double length(){
            return lowerRight.getX() - upperLeft.getX();
        }
    
        public double width(){
            return upperLeft.getY() - lowerRight.getY();
        }
    
        public double area(){
            return length() * width();
        }
    
        public double perimeter(){
            return length()*2 + width()*2;
        }


    
        @Override
        public boolean equals(Object obj) {
            boolean bool = false;
            if(obj instanceof Rectangle){
    
                Rectangle rectangle = (Rectangle) obj;
                bool =  super.equals(rectangle) && this.getUpperLeft().getX() == rectangle.getUpperLeft().getX() && this.getUpperLeft().getY() == rectangle.getUpperLeft().getY() && this.getLowerRight().getX() == rectangle.getLowerRight().getX() && this.getLowerRight().getY() == rectangle.getLowerRight().getY();
            }
            return bool;
        }
    
        @Override
        public String toString() {
            return "["+upperLeft.getX()+","+upperLeft.getY() +"]["+lowerRight.getX()+","+lowerRight.getY()+"]";
        }
}