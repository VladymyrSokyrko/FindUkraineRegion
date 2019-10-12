

import java.util.ArrayList;
import java.util.List;

public class RegionMap {


    private List <Region> regions = new ArrayList<>();
    private String name;

    public RegionMap (String name){
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void addRegion (Region region){

        for (Region regionName: regions) {
            if (regionName.getName().equals(region.getName())){
                System.out.println("This region already exsist");
                return;
            }

        }

        int checkRegion = region.checkRegion();

        if (checkRegion==1){
            System.out.println("Incorrect latitude in " + region.getName());
        }
        else if (checkRegion==2){
            System.out.println("Incorrect longitude in " + region.getName());
        }

        else if (checkRegion==12){
            System.out.println("Incorrect longitude and latitude in " + region.getName());
        }
        else
        regions.add(region);
        }
        
        public void getAddedRegions (){
        String RegionList = "Number of Regions: ";
        int regionNumbers = 0;

            for (Region region: regions) {
                String NameOfThisRegion = region.getName();
                RegionList = RegionList + NameOfThisRegion + " ,";
                regionNumbers +=1;
            }

            System.out.println(RegionList);
            System.out.println("Number of added regions: " + regionNumbers);
        

        
        }


    public void checkMap (){
        int n = 0;
        int s = 0;

        for (Region r: regions ) {
            n ++;
            for (int i =n; i<regions.size(); i++ ){

                if (r.getNorth().getPoint().getLongitude()>regions.get(i).getSouth().getPoint().getLongitude() &&
                        (r.getNorth().getPoint().getLatitude()< regions.get(i).getEast().getPoint().getLatitude() &&
                                r.getNorth().getPoint().getLatitude()>regions.get(i).getWest().getPoint().getLatitude())){

                    System.out.println(r.getName() + " North Point crosses " + regions.get(i).getName() + " region");
                    s=1;

                }
                else if (r.getSouth().getPoint().getLongitude()<regions.get(i).getNorth().getPoint().getLongitude() &&
                        (r.getSouth().getPoint().getLatitude()< regions.get(i).getEast().getPoint().getLatitude() &&
                                r.getSouth().getPoint().getLatitude()>regions.get(i).getWest().getPoint().getLatitude())){

                    System.out.println(r.getName() + " South Point crosses " + regions.get(i).getName() + " region");
                    s=1;
                }

                else if (r.getWest().getPoint().getLatitude()>regions.get(i).getEast().getPoint().getLatitude() &&
                        (r.getWest().getPoint().getLongitude()< regions.get(i).getSouth().getPoint().getLongitude() &&
                                r.getWest().getPoint().getLongitude()>regions.get(i).getNorth().getPoint().getLongitude())){

                    System.out.println(r.getName() + " West Point crosses " + regions.get(i).getName() + " region");
                    s=1;
                }

                else if (r.getEast().getPoint().getLatitude()<regions.get(i).getWest().getPoint().getLatitude() &&
                        (r.getEast().getPoint().getLongitude()< regions.get(i).getSouth().getPoint().getLongitude() &&
                                r.getEast().getPoint().getLongitude()>regions.get(i).getNorth().getPoint().getLongitude())){

                    System.out.println(r.getName() + " East Point crosses " + regions.get(i).getName() + " region");
                    s=1;

                }

//                else
//                    System.out.println(r.getName() + " don't have any crosses");

            }

        }

        if (s==0){
            System.out.println("map checked succesfully");
        }
    }


    public void getRegion (double longitude, double latitude){
        Point p = new Point(longitude, latitude);
        int n = 0;

        for (Region r:regions) {
            if (r.getEast().getPoint().getLatitude()<=latitude
                    && r.getWest().getPoint().getLatitude() >= latitude
                    && r.getNorth().getPoint().getLongitude()>=longitude
                    && r.getSouth().getPoint().getLongitude() <= longitude){
                n=1;
                System.out.println("You are in " + r.getName() + " region");
            }
        }
        if (n==0){
            System.out.println("You are not in " + this.name + " region");
        }


    }


}
