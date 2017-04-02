package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

/**
 * Created by LaunchCode
 */
public class NamePopulationComparator implements Comparator<City> {

    @Override
    public int compare(City o1, City o2) {
        int namePop = o1.getName().compareTo(o2.getName());
        if(o1.getState().compareTo(o2.getState()) == 0)
            namePop = Integer.compare(o1.getPopulation(), o2.getPopulation());
        return namePop;
    }
}