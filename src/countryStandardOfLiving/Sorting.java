package countryStandardOfLiving;

import java.util.*;

public class Sorting {
    static void Sort(double[] arr_sort) {
        int num = arr_sort.length;
        double z = 0;
        for (int x = 0; x < num; x++) {
            for (int y = 1; y < (num - x); y++) {
                if (arr_sort[y - 1] > arr_sort[y]) {
                    z = arr_sort[y - 1];
                    arr_sort[y - 1] = arr_sort[y];
                    arr_sort[y] = z;
                }
            }
        }
    }
}