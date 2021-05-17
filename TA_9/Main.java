package TA_9;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Integer,Integer> CD = new TreeMap<>(Comparator.reverseOrder());
        CD.put(1500,3);
        CD.put(1000,5);
        CD.put(500,2);
        CD.put(5000,15);
        CD.put(2500,8);
        CD.put(35000,2);
        for(Map.Entry<Integer,Integer> item : CD.entrySet()){

            System.out.printf("Заробітна плата: %s  Час: %s \n", item.getKey(), item.getValue());
        }
        HungryAlgo hg = new HungryAlgo(CD);
        hg.maxTotalC(CD);
    }



}
