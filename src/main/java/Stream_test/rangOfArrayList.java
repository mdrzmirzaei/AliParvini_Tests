package Stream_test;

import org.apache.commons.compress.utils.Lists;
import org.apache.poi.ss.formula.functions.Match;

import java.util.*;


public class rangOfArrayList {
    ArrayList<Integer> hrb = new ArrayList<>();
    List<Integer> hrb_temp;
    Map<Integer, List<Integer>> hm = new HashMap<>();

    void setbatch() {
        for (int i = 0; i < 24015; i++) {
            hrb.add(i, 20000 + i);

        }

//        for (int i = 0; i < 24001; i++) {
//            System.out.println(hrb.get(i));
//        }
        hrb_temp = hrb.stream().toList();



        for (Map.Entry es : hm.entrySet()) {
            System.out.println(es.getKey() + "  " + es.getValue());
        }


        hrb_temp = hrb.stream().toList();


        int step = (int) Math.ceil(hrb.size()/5000.0);

        int end= 5000;
        int start = 0;


        for (int i = 1; i <= step ; i++) {

            if (i == step)
                hm.put(i, hrb_temp.subList(start, hrb_temp.size()));
            else
                hm.put(i, hrb_temp.subList(start, end));

            start = end;
            end += 5000;

        }

        for (Map.Entry es : hm.entrySet()) {
            System.out.println(es.getKey() + "  " + es.getValue());
        }


    }


    public static void main(String[] args) {
        rangOfArrayList ROAL = new rangOfArrayList();
        ROAL.setbatch();
    }

}

