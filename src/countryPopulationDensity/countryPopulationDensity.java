package countryPopulationDensity;

public class countryPopulationDensity extends countryPopulation implements calculatingPopulationDensity {

    @Override
    public int countryPopulation() {
        return 5000000;
    }

    @Override
    public int countryArea() {
        return 40000;
    }

    @Override
    public int populationDensity() {
        int populationDens = (int)(countryPopulation()/countryArea());
        return populationDens;
    }
}
