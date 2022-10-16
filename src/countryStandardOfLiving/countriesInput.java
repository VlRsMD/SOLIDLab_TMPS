package countryStandardOfLiving;

import countryStandardOfLiving.countryInfo;
import countryStandardOfLiving.livingStandardCalculation;
import countryStandardOfLiving.numberOfCountriesInput;
import countryStandardOfLiving.realGDPCalc;

import java.util.*;
import java.io.*;

public class countriesInput {
    public static countryInfo[] countriesL() {
        countryInfo countriesList[] = new countryInfo[numberOfCountriesInput.numberT()];
        ArrayList<countryInfo> countriesArray = new ArrayList<countryInfo>(Arrays.asList(countriesList));
        for (int k=0; k<numberOfCountriesInput.numberT(); k++) {
            countryInfo newCountryIn = new countryInfo();
            Console nameIn = System.console();
            String name = nameIn.readLine("Name of the country: ");
            newCountryIn.countryName = name;
            Console nomGDPIn = System.console();
            String nomGDPS = nomGDPIn.readLine("Nominal GDP: ");
            double nomGDP = Double.parseDouble(nomGDPS);
            newCountryIn.nominalGDP = nomGDP;
            Console GDPDefIn = System.console();
            String GDPDefS = GDPDefIn.readLine("GDP deflator: ");
            double GDPDef = Double.parseDouble(GDPDefS);
            newCountryIn.GDPDeflator = GDPDef;
            Console pNrIn = System.console();
            String pNrS = pNrIn.readLine("Country population: ");
            int pNr = Integer.parseInt(pNrS);
            newCountryIn.population = pNr;
            double rGDP = realGDPCalc.rGDP(nomGDP, GDPDef);
            newCountryIn.livingStandard  = livingStandardCalculation.calculationLS(rGDP, pNr);
            countriesArray.add(newCountryIn);
        }
        countriesList = countriesArray.toArray(countriesList);
        return countriesList;
    }
}
