package countryStandardOfLiving;

import countryStandardOfLiving.countryInfo;

public class realGDPCalc extends countryInfo {
    public static double rGDP(double nomGDP, double GDPDeg) {
        double realGDP = nomGDP/GDPDeg;
        return realGDP;
    }
}
