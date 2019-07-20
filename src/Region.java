import javafx.scene.control.skin.TextInputControlSkin;

class Region {

    private Directions name;
    private Point south;
    private Point north;
    private Point east;
    private Point west;

Region (Directions name, Point south, Point north, Point east, Point west){
        this.east = east;
        this.west = west;
        this.north = north;
        this.south = south;
        this.name = name;
    }

    public Directions getName() {
        return name;
    }

    public void setName(Directions name) {
        this.name = name;
    }

    public double getCoordinate(Directions d) {
        double coordinate = 0.0;
        switch (d){
            case east:
                coordinate = east.getLatitude();
            case west:
                coordinate = west.getLatitude();
            case south:
                coordinate = south.getLongitude();
            case north:
                coordinate = north.getLongitude();
        }
        return coordinate;
    }

    public Point getSouth() {
        return south;
    }

    public Point getNorth() {
        return north;
    }

    public Point getEast() {
        return east;
    }

    public Point getWest() {
        return west;
    }

    public void setCoordinate(Directions d, double coordinate) {

        switch (d){
            case east:
                east.setLatitude(coordinate);
            case west:
               west.setLatitude(coordinate);
            case south:
                south.setLongitude(coordinate);
            case north:
                south.setLongitude(coordinate);
        }
    }
}
