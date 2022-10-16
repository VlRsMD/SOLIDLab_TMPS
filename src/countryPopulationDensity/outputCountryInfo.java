package countryPopulationDensity;

import countryPopulationDensity.countryPopulationDensity;

public class outputCountryInfo {
    public static countryPopulation pD(countryPopulation p) {
        return p;
    }

    public static void main(String[] args) {
        System.out.println("Country population is: " + pD(new countryPopulationDensity()).countryPopulation());
        System.out.println("Country area is: " + pD(new countryPopulationDensity()).countryArea());
    }
}
