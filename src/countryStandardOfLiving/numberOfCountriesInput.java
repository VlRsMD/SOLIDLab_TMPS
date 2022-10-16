package countryStandardOfLiving;

import java.io.Console;

public class numberOfCountriesInput {
    public static int numberT() {
        int nrOC;
        Console console = System.console();
        String nrOCS = console.readLine("Please input the total number of countries: ");
        nrOC = Integer.parseInt(nrOCS);
        return nrOC;
    }
}
