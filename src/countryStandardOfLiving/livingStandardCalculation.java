package countryStandardOfLiving;

import countryStandardOfLiving.realGDPCalc;

public class livingStandardCalculation extends realGDPCalc {
    public static double calculationLS(double realGDP, int population) {
        double standardOfLiving = realGDP/population;
        return standardOfLiving;
    }
}
