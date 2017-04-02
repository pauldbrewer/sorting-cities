package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

/**
 * Created by LaunchCode
 */
public class StateNameComparator implements Comparator<City> {

    @Override
    public int compare(City o1, City o2) {
        int stateName = o1.getState().compareTo(o2.getState());
        if(o1.getState().compareTo(o2.getState()) == 0)
            stateName = o1.getName().compareTo(o2.getName());
        return stateName;
    }
}
