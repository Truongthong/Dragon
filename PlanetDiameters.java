package usingmap;

import java.io.FileReader;
import java.util.*;

public class PlanetDiameters {
    private static final String[] names = {"Mercury" , "Venus", "Earth" ,"Mars","jupiter","Saturn","Uranus","Nepturn","Pluto"};

    private static final float[] diameters = {4800f , 12103.6f ,12756.3f, 6794f, 142984f, 120536f, 51118f, 49532f, 2274f};

    public static void main(String[] args) {
//        Earth : 12756.3
//        Mars : 6794.0
//        Saturn : 120536.0
//        Venus : 12103.6
//        Nepturn : 49532.0
//        Uranus : 51118.0
//        jupiter : 142984.0
//        Mercury : 4800.0
//        Pluto : 2274.0

//        Mercury : 4800.0
//        Venus : 12103.6
//        Earth : 12756.3
//        Mars : 6794.0
//        jupiter : 142984.0
//        Saturn : 120536.0
//        Uranus : 51118.0
//        Nepturn : 49532.0
//        Pluto : 2274.0

        Map planets = new TreeMap();

        for (int i=0 ; i< names.length ; i++)
            planets.put(names[i], diameters[i]);

        Iterator it = planets.entrySet().iterator();
            while (it.hasNext()){
                Map.Entry e = (Map.Entry) it.next();

                System.out.println(e.getKey()+" : "+e.getValue());
            }


            System.out.println("----------------------------------------");

            while (true){
                System.out.println("Find planet (Enter to quit) : ");
                String name  = (new Scanner(System.in)).nextLine();
                if (name.length() == 0)break;
                if (!planets.containsKey(name)){
                    System.out.println("Planet "+name + " not found !");
                }else System.out.println("The diameter of " + name + " is "+planets.get(name));
            }
    }
}
