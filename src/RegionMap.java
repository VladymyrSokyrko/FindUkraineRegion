import java.util.ArrayList;
import java.util.List;

public class RegionMap {

    private List <Region> regions = new ArrayList<>();

    public RegionMap (){}


    public void addRegion (Region region){

        regions.add(region);

//        for (Region r: regions) {
////            if (region.getCoordinate(Directions.south) > r.getCoordinate(Directions.north)) {
////
////            }


        }



//        for (Region r: regions) {
////            if (region.getCoordinate(Directions.south) > r.getCoordinate(Directions.north)) {
////
////            }






    public void checkMap (){
        int n = 0;

        for (Region r: regions ) {
            n ++;
            for (int i =n; i<regions.size(); i++ ){

                if (r.getNorth().getLongitude()>regions.get(i).getSouth().getLongitude() &&
                        (r.getNorth().getLatitude()< regions.get(i).getEast().getLatitude() &&
                                r.getNorth().getLatitude()>regions.get(i).getWest().getLatitude())){

                    System.out.println(r.getName() + " North Point crosses " + regions.get(i).getName() + " region");

                }
                else if (r.getSouth().getLongitude()<regions.get(i).getNorth().getLongitude() &&
                        (r.getSouth().getLatitude()< regions.get(i).getEast().getLatitude() &&
                                r.getSouth().getLatitude()>regions.get(i).getWest().getLatitude())){

                    System.out.println(r.getName() + " South Point crosses " + regions.get(i).getName() + " region");
                }

                else if (r.getWest().getLatitude()>regions.get(i).getEast().getLatitude() &&
                        (r.getWest().getLongitude()< regions.get(i).getSouth().getLongitude() &&
                                r.getWest().getLongitude()>regions.get(i).getNorth().getLongitude())){

                    System.out.println(r.getName() + " West Point crosses " + regions.get(i).getName() + " region");
                }

                else if (r.getEast().getLatitude()<regions.get(i).getWest().getLatitude() &&
                        (r.getEast().getLongitude()< regions.get(i).getSouth().getLongitude() &&
                                r.getEast().getLongitude()>regions.get(i).getNorth().getLongitude())){

                    System.out.println(r.getName() + " East Point crosses " + regions.get(i).getName() + " region");

                }

                else
                    System.out.println(r.getName() + " don't have any crosses");

            }


        }

        // Point север плохо если она больше Точки Юга по долготе И ( Меньше Запада И больше востока по широте) тогда есть пересечение

    }
}
