package TA_9;

import java.util.Map;

public class HungryAlgo {
    Map<Integer, Integer> cd;

    public HungryAlgo(Map<Integer, Integer> CD) {
        this.cd = CD;
    }

    public void maxTotalC(Map<Integer, Integer> cd) {
        int maxC = 0;
        int i = 0;
        for (Map.Entry<Integer,Integer> item : cd.entrySet()) {
            i+=1;
            if (item.getValue()>i){
                maxC+=item.getKey();

            }
        }
        System.out.println("\nМаксимальний заробіток: "+maxC+"$");
    }

}
