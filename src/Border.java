public class Border {
    Point point;
    Directions direction;

    public Border (Point point, Directions direction){
        this.point = point;
        this.direction = direction;
    }

    public Border (){}

    public Point getPoint() {
        return point;
    }

    public Directions getDirection() {
        return direction;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public void setDirection(Directions direction) {
        this.direction = direction;
    }
}
