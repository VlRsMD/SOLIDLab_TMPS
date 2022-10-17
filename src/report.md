# SOLID Software Design Principles

### Course: TMPS
### Task: Laboratory work
### Author: Vladimir Russu

----

## Report
In this project first 4 letters of the SOLID design principles are implemented. These are: 1) Single-responsibility principle; 2) Open-Closed principle; 3) Liskov Substitution Principle.

The project consists of 2 packages. First package is the "countryStandardOfLiving" package. In this package the standard of living of a country is being calculated based on user's input and then the countries rating is displayed. In this package Single-responsibility and Open-Closed principles are implemented. The second package is "countryPopulationDensity" in which the population density of a country (Nr. of people/1 square km) is calculated - in this package Liskov Substitution principle and Interface Segregation Principle are implemented.

The Single-responsibility principle in the "countryStandardOfLiving" package is implemented by separating classes according to their functionality. There is a building class for the initial information about a country - "countryInfo" class. Then there is "countriesInput" class which handles the input of countries by user. There is a separate class "numberOfCountriesInput" which handles the input of the total number of countries by user, which is necessary for further processing of input data. Then there are classes "realGDPCalc" and "livingStandardCalculation" which perform the required calculations. Then there is class "Sorting" which is performs a sorting algorithm to be further implemented for sorting countries according to the calculated standard of living. The "livingStandardValuesSorted" class performs the sorting of living standard values. And finally the "countriesRating" class outputs list of countries in an order from highest to smallest standard of living. 

The Open-Closed principle in the "countryStandardOfLiving" package is implemented by introducing child classes and an abstract class. Abstract class "country" is then extended by the "countryInfo" class. Then "realGDPCalc" class extends "countryInfo" to calculate real GDP. Then the "livingStandardCalculation" extends "realGDPCalc" class. Therefore, the parent classes are closed for modifications.

The Interface Segregation Principle in the "countryPopulationDensity" package is implemented by making 2 separate interfaces: one parent and another child interface. The "countryInfoForPopulationDensity" interface introduces only methods for the information about the total number of population in a country and the area of that country. The "calculatingPopulationDensity" interface extends the "countryInfoForPopulation" interface by adding a method to calculate the population density based on the population number and area info.

The Liskov Substitution Principle in the "countryPopulationDensity" package is implemented by making parent and child classes so that the child class can substitute the parent class. The "countryPopulationDensity" class extends "countryPopulation" class and adds the calculation of population density. Then in the "outputCountryInfo" class a method "pD" with argument of type "countryPopulation" is introduced; but in the "main" method the "pD" method is called by passing as argument a variable of type of the child class "countryPopulationDensity" - and the child class successfully substitutes the parent class by being able to output the results of calling the methods which are common for both parent class and child class.