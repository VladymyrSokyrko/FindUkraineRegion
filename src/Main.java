import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        RegionMap Ukraine = new RegionMap("Ukraine");

        Region VinnitsaRegion =new Region ("Vinnitsa Region",
                new Border(new Point(49.253, 27.813), Directions.east),
                new Border(new Point(48.854, 29.732), Directions.west) ,
                new Border( new Point(49.787, 28.647), Directions.north),
                new Border (new Point(48.146, 28.657), Directions.south));


        Region VolynRegion =new Region ("Volyn' Region",new Border(new Point(50.972, 26.110), Directions.west) ,
                new Border(new Point(51.034, 23.918), Directions.east), new Border(new Point(51.844, 24.823), Directions.north),
                new Border(new Point(50.340, 24.926), Directions.south) );

        Region DniproRegion =new Region ("Dnipro Region",new Border(new Point(48.304, 36.815), Directions.west) ,
                new Border(new Point(48.348, 33.453), Directions.east),
                new Border(new Point(48.819, 34.097), Directions.north),
                new Border(new Point(47.529, 34.282), Directions.south));


        Region DonetskRegion =new Region ("Donetsk Region",
                new Border(new Point(47.876, 39.068), Directions.west),
                new Border(new Point(47.814, 36.636), Directions.east),
                new Border(new Point(49.160, 37.757), Directions.north),
                new Border(new Point(46.780, 37.594), Directions.south));


        Region ZhytomyrRegion =new Region ("Zhytomyr Region",
                new Border(new Point(50.734, 29.567), Directions.west),
                new Border(new Point(50.896, 27.238), Directions.east),
                new Border(new Point(51.544, 28.506), Directions.north),
                new Border(new Point(49.820, 28.668), Directions.south));


        Region ZakarpattyaRegion =new Region ("Zakarpattya Region",
                new Border(new Point(48.6780, 23.6497), Directions.west),
                new Border(new Point(48.6271, 22.2391), Directions.east),
                new Border(new Point(49.0479, 22.7684), Directions.north),
                new Border(new Point(47.9102, 24.1445), Directions.south));


        Region ZaporizhyaRegion =new Region ("Zaporizhya Region",
                new Border(new Point(47.814, 36.636), Directions.west),
                new Border(new Point(47.186, 34.481), Directions.east),
                new Border(new Point(48.039, 35.686), Directions.north),
                new Border(new Point(46.343, 35.891), Directions.south));


        Region IvanoFrankivskRegion =new Region ("Ivano-Frankivsk Region",
                new Border(new Point(48.792, 25.378), Directions.west),
                new Border(new Point(48.696, 23.597), Directions.east),
                new Border(new Point(49.097, 23.818), Directions.north),
                new Border(new Point(47.830, 24.768), Directions.south));


        Region KievRegion =new Region ("Kiev Region",
                new Border(new Point(50.244, 32.094),Directions.west),
                new Border(new Point(50.734, 29.567), Directions.east),
                new Border(new Point(51.456, 30.004), Directions.north),
                new Border(new Point(49.830, 31.240), Directions.south));


        Region KropyvnytskyyRegion =new Region ("Kropyvnytskyy Region",
                new Border(new Point(48.348, 33.453), Directions.west),
                new Border(new Point(48.295, 29.815),Directions.east),
                new Border(new Point(49.046, 32.264), Directions.north),
                new Border(new Point(48.105, 31.367), Directions.south));


        Region LuganskRegion =new Region ("Lugansk Region",
                new Border(new Point(49.140, 39.943), Directions.west),
                new Border(new Point(49.362, 37.872), Directions.east),
                new Border(new Point(49.918, 38.546), Directions.north),
                new Border(new Point(47.876, 39.068), Directions.south));


        Region LvivRegion =new Region ("Lviv Region",
                new Border(new Point(49.7480, 25.0982), Directions.west),
                new Border(new Point(49.521, 22.647), Directions.east),
                new Border(new Point(50.5737, 24.2702), Directions.north),
                new Border(new Point(49.097, 23.818), Directions.south));


        Region OdessaRegion =new Region ("Odessa Region",
                new Border(new Point(47.170, 31.165), Directions.west),
                new Border(new Point(47.108, 29.584), Directions.east),
                new Border(new Point(48.105, 31.367), Directions.north),
                new Border(new Point(46.342, 31.245), Directions.south));


        Region PoltavaRegion =new Region ("Poltava Region",
                new Border(new Point(49.435, 35.363), Directions.west),
                new Border(new Point(50.244, 32.094), Directions.east),
                new Border(new Point(50.190, 34.651), Directions.north),
                new Border(new Point(48.819, 34.097), Directions.south)
        );



        Region RovnoRegion =new Region ("Rovno Region",
                new Border(new Point(50.896, 27.238), Directions.west),
                new Border(new Point(50.972, 26.110), Directions.east),
                new Border(new Point(51.766, 26.585), Directions.north),
                new Border(new Point(50.245, 26.010), Directions.south));


        Region SumyRegion =new Region ("Sumy Region",
                new Border(new Point(51.046, 35.271), Directions.west),
                new Border(new Point(51.298, 33.046), Directions.east),
                new Border(new Point(52.312, 33.688), Directions.north),
                new Border(new Point(50.190, 34.651), Directions.south));


        Region TernopylRegion =new Region ("Ternopyl Region",
                new Border(new Point(49.473, 26.165), Directions.west),
                new Border(new Point(49.436, 24.792), Directions.east),
                new Border(new Point(50.245, 26.010), Directions.north),
                new Border(new Point(48.702, 25.656), Directions.south));



        Region KharkivRegion =new Region ("Kharkiv Region",
                new Border(new Point(49.362, 37.872), Directions.west),
                new Border(new Point(49.435, 35.363), Directions.east),
                new Border(new Point(50.363, 36.209), Directions.north),
                new Border(new Point(48.920, 35.930), Directions.south)
        );


        Region KhersonRegion =new Region ("Kherson Region",
                new Border( new Point(47.186, 34.481), Directions.west),
                new Border(new Point(46.342, 31.245), Directions.east),
                new Border(new Point(47.529, 34.282), Directions.north),
                new Border(new Point(46.158, 33.899), Directions.south));



        Region KhmelnytskyyRegion =new Region ("Khmelnytskyy Region",
                new Border(new Point(49.253, 27.813), Directions.west),
                new Border(new Point(49.325, 26.233), Directions.east),
                new Border(new Point(50.531, 27.016), Directions.north),
                new Border(new Point(48.702, 25.656), Directions.south));



        Region CherkasyRegion =new Region ("Cherkasy Region",
                new Border(new Point(49.442, 32.711), Directions.west),
                new Border(new Point(48.854, 29.732), Directions.east),
                new Border(new Point(49.830, 31.240), Directions.north),
                new Border(new Point(49.046, 32.264), Directions.south));


        Region ChernigivRegion =new Region ("Chernigiv Region",
                new Border(new Point(51.298, 33.046), Directions.west),
                new Border(new Point(51.174, 30.504), Directions.east),
                new Border(new Point(52.248, 32.598), Directions.north),
                new Border(new Point(50.491, 31.617), Directions.south));




        Region ChernivtsyRegion =new Region ("Chernivtsy Region",
                new Border(new Point(48.531, 27.426), Directions.west),
                new Border(new Point(48.097, 25.007), Directions.east),
                new Border(new Point(48.702, 25.656), Directions.north),
                new Border(new Point(47.954, 25.688), Directions.south));



        Region MykolaivRegion =new Region ("Mykolaiv Region",
                new Border(new Point(47.87, 30.19), Directions.east),
                new Border(new Point(47.01, 33.04), Directions.west),
                new Border(new Point(48.13, 31.03), Directions.north),
                new Border(new Point(46.29, 31.47), Directions.south));


        Ukraine.addRegion(VinnitsaRegion);
        Ukraine.addRegion(MykolaivRegion);
        Ukraine.addRegion(ChernivtsyRegion);
        Ukraine.addRegion(ChernigivRegion);
        Ukraine.addRegion(CherkasyRegion);
        Ukraine.addRegion(KhmelnytskyyRegion);
        Ukraine.addRegion(KhersonRegion);
        Ukraine.addRegion(KharkivRegion);
        Ukraine.addRegion(TernopylRegion);
        Ukraine.addRegion(SumyRegion);
        Ukraine.addRegion(RovnoRegion);
        Ukraine.addRegion(PoltavaRegion);
        Ukraine.addRegion(OdessaRegion);
        Ukraine.addRegion(LvivRegion);
        Ukraine.addRegion(LuganskRegion);
        Ukraine.addRegion(KropyvnytskyyRegion);
        Ukraine.addRegion(KievRegion);
        Ukraine.addRegion(IvanoFrankivskRegion);
        Ukraine.addRegion(ZaporizhyaRegion);
        Ukraine.addRegion(ZakarpattyaRegion);
        Ukraine.addRegion(ZhytomyrRegion);
        Ukraine.addRegion(DonetskRegion);
        Ukraine.addRegion(VolynRegion);
        Ukraine.addRegion(DniproRegion);

        Ukraine.getRegion( 49.00, 28.01);
        Ukraine.getRegion(48.00, 26.00);
        Ukraine.getRegion( 15.75, 25.5888);

        Ukraine.getAddedRegions();

        Ukraine.checkMap();







    }




}





//        Scanner scan = new Scanner(System.in);
//        boolean continious = true;
//        while (continious == true) {
//
//            System.out.print("Enter name of Region: ");
//            String name = scan.next();
//
//            System.out.print("Enter East Point: ");
//            double EastLatitude = scan.nextDouble();
//            System.out.print("");
//            double EastLongitude = scan.nextDouble();
//            Point east = new Point(EastLongitude, EastLatitude);
//
//            System.out.print("Enter West Point: ");
//            double Westlatitude = scan.nextDouble();
//            double Westlongitude = scan.nextDouble();
//            Point west = new Point(Westlongitude, Westlatitude);
//
//            System.out.print("Enter North Point: ");
//            double Northlatitude = scan.nextDouble();
//            double Northlongitude = scan.nextDouble();
//            Point north = new Point(Northlongitude, Northlatitude);
//
//
//            System.out.print("Enter South Point: ");
//            double Southlatitude = scan.nextDouble();
//            double Southlongitude = scan.nextDouble();
//            Point south = new Point(Southlongitude, Southlatitude);
//
//
//            Ukraine.addRegion(new Region(name, south, north, east, west));
//
//            System.out.print("Do you want add Region: ");
//            String answer = scan.next();
//            if (answer.equals("no")) {
//                continious = false;
//            }
//
//
//        }
