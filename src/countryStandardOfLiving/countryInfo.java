package countryStandardOfLiving;

public class countryInfo extends country {
    String countryName;
    double nominalGDP;
    double GDPDeflator;
    int population;
    double livingStandard;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public double getNominalGDP() {
        return nominalGDP;
    }

    public void setNominalGDP(double nominalGDP) {
        this.nominalGDP = nominalGDP;
    }

    public double getGDPDeflator() {
        return GDPDeflator;
    }

    public void setGDPDeflator(double GDPDeflator) {
        this.GDPDeflator = GDPDeflator;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getLivingStandard() {
        return livingStandard;
    }

    public void setLivingStandard(double livingStandard) {
        this.livingStandard = livingStandard;
    }
}


