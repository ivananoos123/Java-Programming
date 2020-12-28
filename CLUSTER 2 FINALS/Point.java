public class Point {
    private int x;
    private int y;


    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point x(int x) {
        this.x = x;
        return this;
    }

    public Point y(int y) {
        this.y = y;
        return this;
    }

    @Override
    public boolean equals(Object obj){
		if(obj instanceof Point){
			Point p =(Point) obj;
			if(this.x == p.getX() && this.y==p.getY())
				return true;
		}
		return false;
	}

    @Override
    public String toString(){
		return "["+x+","+y+"]";
	}
}

    
    
