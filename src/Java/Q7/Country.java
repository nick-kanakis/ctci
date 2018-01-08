package Java.Q7;

/**
 * Created by Nicolas on 8/1/2018.
 */
public class Country {

    private int population;
    private String continent;

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public Country(int population, String continent) {
        this.population = population;
        this.continent = continent;
    }
}
