import java.util.HashMap;
public class Abbreviations {
    private HashMap<String, String> database;

    public Abbreviations() {
        this.database = new HashMap<>();
    }    

    public boolean hasAbbreviation(String abbreviation) {
        return this.database.containsKey(abbreviation);
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        if (this.hasAbbreviation(abbreviation)) {
            System.out.println("Abbreviation already exists in the database");
        } else {
            this.database.put(abbreviation, explanation);
        }
    }

    public String findExplanationFor(String abbreviation) {
        if (this.hasAbbreviation(abbreviation)) {
            return this.database.get(abbreviation);
        } else {
            return null;
        }
    }
}
