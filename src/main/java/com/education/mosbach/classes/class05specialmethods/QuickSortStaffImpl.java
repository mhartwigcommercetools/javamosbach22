package com.education.mosbach.classes.class05specialmethods;

import com.education.mosbach.humanresources.Staff;

import java.util.ArrayList;
import java.util.List;

public class QuickSortStaffImpl {

        public List<Staff> qsort(List<Staff> unsorted) {

            if (unsorted.size() > 1) {
                final Staff pivot = unsorted.get(0);
                List<Staff> smaller = new ArrayList<>();
                List<Staff> larger = new ArrayList<>();

                for (int i = 1; i < unsorted.size(); i++) {
                    if (unsorted.get(i).compareTo(pivot) < 0)
                        smaller.add(unsorted.get(i));
                    else
                        larger.add(unsorted.get(i));
                }

                List<Staff> sorted = new ArrayList<>();
                sorted.addAll(qsort(smaller));
                sorted.add(pivot);
                sorted.addAll(qsort(larger));
                return sorted;
            }
            return unsorted;
        }

}
