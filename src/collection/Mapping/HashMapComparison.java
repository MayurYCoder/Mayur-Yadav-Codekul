package collection.Mapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashMapComparison {
    public static void main(String[] args) {
        Map<Integer,String >mp=new HashMap<>();
        mp.put(1,"A");
        mp.put(2,"B");
        mp.put(3,"C");

        Map<Integer,String>mp2=new HashMap<>();
        mp2.put(1,"A");
        mp2.put(2,"B");
        mp2.put(3,"C");

        Map<Integer,String>mp3=new HashMap<>();
        mp3.put(1,"A");
        mp3.put(3,"C");
        mp3.put(2,"B");
        mp3.put(4,"D");

        System.out.println(mp.equals(mp3));
        System.out.println(mp.values().equals(mp3.values()));

        HashSet<Integer>hs=new HashSet<>(mp.keySet());
        hs.addAll(mp3.keySet());
        System.out.println(hs);
        hs.removeAll(mp.keySet());
        System.out.println(hs);



        Map<Integer,String >mp5=new HashMap<>();
        mp5.put(1,"A");
        mp5.put(2,"B");
        mp5.put(3,"C");

        Map<Integer,String>mp6=new HashMap<>();
        mp6.put(1,"A");
        mp6.put(2,"B");
        mp6.put(3,"C");

        Map<Integer,String>mp7=new HashMap<>();
        mp7.put(1,"A");
        mp7.put(3,"C");
        mp7.put(2,"B");
        mp7.put(4,"D");
        //Comparison using arraylist and values.
        System.out.println(new ArrayList<>(mp5.values()).equals(new ArrayList<>(mp6.values())));
        System.out.println(new ArrayList<>(mp5.values()).equals(new ArrayList<>(mp7.values())));

        //comparison using set and values
        System.out.println(new HashSet<>(mp5.values()).equals(new HashSet<>(mp6.values())));
        System.out.println(new HashSet<>(mp5.values()).equals(new HashSet<>(mp7.values())));



    }



}
