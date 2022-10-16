package countryStandardOfLiving;

import countryStandardOfLiving.Sorting;

public class livingStandardValuesSorted {
    public static double[] main() {
        double livingStandardValues[];
        livingStandardValues = new double[numberOfCountriesInput.numberT()];
        for (int k = 0; k< numberOfCountriesInput.numberT(); k++)  {
            livingStandardValues[k] = countriesInput.countriesL()[k].livingStandard;
        }
        Sorting.Sort(livingStandardValues);
        return livingStandardValues;
    }
}
