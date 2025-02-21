package lv.rvt;

import java.util.ArrayList;
import java.util.Comparator;

public class App {
        public static void main(String[] args) throws Exception {
                
                ArrayList<Double> doubleList = new ArrayList<>();
                doubleList.add(1.0);
                doubleList.add(2.0);
                doubleList.add(3.0);
                doubleList.add(4.0);
                doubleList.add(5.0);

                System.out.println(doubleList);

                doubleList.sort(Comparator.reverseOrder());
                System.out.println(doubleList);
        }
}