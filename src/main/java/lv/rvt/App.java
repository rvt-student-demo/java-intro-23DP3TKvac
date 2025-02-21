package lv.rvt;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class App {
        public static void main(String[] args) throws Exception {
                
                Scanner scanner = new Scanner(System.in);
                ArrayList<Integer> masivs = new ArrayList<>();
                System.out.print("\033[0;36m");
                


                while(true) {
                        
                        String input = scanner.nextLine();
                        if (input.equals("0")) {
                                break;
                        }
                        try {
                                int skaitlis = Integer.parseInt(input);
                                masivs.add(skaitlis);
                        } catch (NumberFormatException e) {
                                System.out.println("Nepareiza ievade!");
                        }
                }


                masivs.sort(Comparator.naturalOrder());

                System.out.println("Sakartots augošā secībā:\n");

                System.out.printf("+---------+---------+\n");
                System.out.printf("|  index  |  value  |\n");
                System.out.printf("+---------+---------+\n");
                for (int i = 0; i < masivs.size(); i++) {
                        System.out.printf("|  %5d  |  %6d |\n", i, masivs.get(i));
                }
                System.out.printf("+---------+---------+\n");

                masivs.sort(Comparator.reverseOrder());

                System.out.println("Sakartots dilstošā secībā:\n");

                System.out.printf("+---------+---------+\n");
                System.out.printf("|  index  |  value  |\n");
                System.out.printf("+---------+---------+\n");
                for (int i = 0; i < masivs.size(); i++) {
                        System.out.printf("|  %5d  |  %6d |\n", i, masivs.get(i));
                }
                System.out.printf("+---------+---------+\n");
        }
}