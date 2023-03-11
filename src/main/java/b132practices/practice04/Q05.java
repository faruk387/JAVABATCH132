package b132practices.practice04;

import java.util.ArrayList;
import java.util.List;

public class Q05 {
    public static void main(String[] args) {


            /*
             * Type code to find the common elements between two String Arrays
             * (without case sensitivity)
             * Input1 : {John,Brad,Angel,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}
             * Output : [brad,sofia,emily]
             */

            String[] arr = {"John", "Brad", "Angel", "Sofia", "Emily"};

            String[] brr = {"sofia", "brad", "grace", "emily", "hazel"};
            List<String> list = new ArrayList<>();
            int counter = 0;
            for (String w : arr) {
                for (String u : brr) {
                    if (u.equalsIgnoreCase(w)) {
                        list.add(u);
                    }

                }

            }
            System.out.println(list);
        }

}
