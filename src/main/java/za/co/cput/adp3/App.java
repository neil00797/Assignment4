package za.co.cput.adp3;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //List
        System.out.println("**List**");
        ArrayList <String> brand  = new ArrayList();
        brand.add("Samsung");
        brand.add("Apple");
        brand.add("Huawei");
        brand.add("Nokia");
        System.out.println("List Elements --> " + brand);
        System.out.println("Element at first position --> " + brand.get(0));
        Collections.sort(brand);
        System.out.println("Sorted Elements ---> " + brand + "\n");

        //Map
        System.out.println("**Map**");
        Map <String, Integer> map = new HashMap<>();
        map.put("Samsung", 23);
        map.put("Apple", 22);
        map.put("Huawei", 18);
        map.put("Nokia", 47);
        System.out.println("Map ---> " + map);
        System.out.println("Map Size ---> " + map.size() + "\n");

        //Set
        System.out.println("**Set**");
        Set <String> hashSet = new HashSet<String>();
        hashSet.add("Samsung");
        hashSet.add("Apple");
        hashSet.add("Huawei");
        hashSet.add("Nokia");

        System.out.println("Hash Elements ---> " + hashSet);
        }
    }
