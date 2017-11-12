package com.company.world.world.world.city.generated;

import com.company.world.world.world.city.City;
import com.company.world.world.world.country.Country;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.manager.Manager;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.company.world.world.world.city.City}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedCityImpl implements City {
    
    private int id;
    private String name;
    private String countryCode;
    private String district;
    private int population;
    
    protected GeneratedCityImpl() {
        
    }
    
    @Override
    public int getId() {
        return id;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public String getCountryCode() {
        return countryCode;
    }
    
    @Override
    public String getDistrict() {
        return district;
    }
    
    @Override
    public int getPopulation() {
        return population;
    }
    
    @Override
    public City setId(int id) {
        this.id = id;
        return this;
    }
    
    @Override
    public City setName(String name) {
        this.name = name;
        return this;
    }
    
    @Override
    public City setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }
    
    @Override
    public City setDistrict(String district) {
        this.district = district;
        return this;
    }
    
    @Override
    public City setPopulation(int population) {
        this.population = population;
        return this;
    }
    
    @Override
    public Country findCountryCode(Manager<Country> foreignManager) {
        return foreignManager.stream().filter(Country.CODE.equal(getCountryCode())).findAny().orElse(null);
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = "          + Objects.toString(getId()));
        sj.add("name = "        + Objects.toString(getName()));
        sj.add("countryCode = " + Objects.toString(getCountryCode()));
        sj.add("district = "    + Objects.toString(getDistrict()));
        sj.add("population = "  + Objects.toString(getPopulation()));
        return "CityImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof City)) { return false; }
        final City thatCity = (City)that;
        if (this.getId() != thatCity.getId()) {return false; }
        if (!Objects.equals(this.getName(), thatCity.getName())) {return false; }
        if (!Objects.equals(this.getCountryCode(), thatCity.getCountryCode())) {return false; }
        if (!Objects.equals(this.getDistrict(), thatCity.getDistrict())) {return false; }
        if (this.getPopulation() != thatCity.getPopulation()) {return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getId());
        hash = 31 * hash + Objects.hashCode(getName());
        hash = 31 * hash + Objects.hashCode(getCountryCode());
        hash = 31 * hash + Objects.hashCode(getDistrict());
        hash = 31 * hash + Integer.hashCode(getPopulation());
        return hash;
    }
}