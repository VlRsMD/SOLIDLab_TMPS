package countryStandardOfLiving;

public class countriesRating {
    public static void main(String[] args) {
        String countriesR[];
        countriesR = new String[numberOfCountriesInput.numberT()];
        for (int k = 0; k< numberOfCountriesInput.numberT(); k++) {
            for (int j = 0; k< numberOfCountriesInput.numberT(); j++) {
                if (countriesInput.countriesL()[j].livingStandard == livingStandardValuesSorted.main()[k]) {
                    countriesR[k] = countriesInput.countriesL()[j].countryName;
                }
            }
        }
        for (int l = 1; l<= numberOfCountriesInput.numberT(); l++) {
            System.out.println(l + ". " + countriesR[l] + "\n");
        }
    }
}
