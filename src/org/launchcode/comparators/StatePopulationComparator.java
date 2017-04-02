package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

/**
 * Created by LaunchCode
 */
public class StatePopulationComparator implements Comparator<City> {

    @Override
    public int compare(City o1, City o2) {
        int statePop = o1.getState().compareTo(o2.getState());
        if(o1.getState().compareTo(o2.getState()) == 0)
            statePop = Integer.compare(o1.getPopulation(), o2.getPopulation());
        return statePop;
    }
}