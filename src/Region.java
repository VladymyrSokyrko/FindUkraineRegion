//import javafx.scene.control.skin.TextInputControlSkin;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

class Region {

    private String name;
    private Border first;
    private Border second;
    private Border third;
    private Border forth;
    private Border [] borders = new Border[4];

Region (String name, Border first, Border second, Border third, Border forth){
        this.forth = forth;
        this.third = third;
        this.second = second;
        this.first = first;
        this.name = name;
        borders [0]=first;
        borders [1]=second;
        borders [2]=third;
        borders [3]=forth;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCoordinate(Directions d) {
        double coordinate = 0.0;
        switch (d){
            case east:
                coordinate = getEast().getPoint().getLatitude();
            case west:
                coordinate = getWest().getPoint().getLatitude();
            case south:
                coordinate = getSouth().getPoint().getLongitude();
            case north:
                coordinate = getNorth().getPoint().getLongitude();
        }
        return coordinate;
    }

    public Border getSouth() {
    Border b = new Border();
        for (int a=0; a<4;a++) {
            if (borders[a].direction.equals(Directions.south)){
                b = borders[a];
                return b;
            }

        }
        return b;
    }

    public Border getNorth() {
        Border b = new Border();
        for (int a=0; a<4;a++) {
            if (borders[a].direction.equals(Directions.north)){
                b = borders[a];
                return b;
            }

        }
        return b;
    }

    public Border getEast() {
        Border b = new Border();
        for (int a=0; a<4;a++) {
            if (borders[a].direction.equals(Directions.east)){
                b = borders[a];
                return b;
            }

        }
        return b;
    }

    public Border getWest() {
        Border b = new Border();
        for (int a=0; a<4;a++) {
            if (borders[a].direction.equals(Directions.west)){
                b = borders[a];
                return b;
            }

        }
        return b;
    }

    public void setBoarder (Directions d, Point point) {

        switch (d){
            case east:
                getEast().getPoint().setLatitude(point.getLatitude());
                getEast().getPoint().setLongitude(point.getLongitude());
            case west:
                getWest().getPoint().setLatitude(point.getLatitude());
                getWest().getPoint().setLongitude(point.getLongitude());
            case south:
                getSouth().getPoint().setLongitude(point.getLongitude());
                getSouth().getPoint().setLatitude(point.getLatitude());
            case north:
                getNorth().getPoint().setLongitude(point.getLongitude());
                getNorth().getPoint().setLatitude(point.getLatitude());
        }
    }

    public int checkRegion (){
    int result = 0;

    if (getEast().getPoint().getLatitude()> getWest().getPoint().getLatitude()){
        result = 1; // не соответствие широты
        System.out.println(getName() +" East point = " + getEast().getPoint().getLatitude()  +" West Point = " + getWest().getPoint().getLatitude());
    }

    if (getSouth().getPoint().getLongitude()> getNorth().getPoint().getLongitude()){
        if (result == 1){
            System.out.println(getName() + " South point = " + getSouth().getPoint().getLongitude()  +" North Point = " + getNorth().getPoint().getLongitude());
            result = 12;
        }
        else
            result = 2;
    }

    return result;
    }




}
