package com.example.lab08;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    

    // Will be implemented later using TDD (leave blank for now)
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    public void deleteCity(City city){
        if (hasCity(city)) {
            cities.remove(city);
        } else {
            throw new NoSuchElementException(
                    String.format("No city named **%s** in list", city.getCityName())
            );
        }
    }
}
