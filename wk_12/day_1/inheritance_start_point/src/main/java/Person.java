public class Person {

    private String name;
    private String cohort;

    public Person(String name, String cohort) {
        this.name = name;
        this.cohort = cohort;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCohort(String cohort) {
        this.cohort = cohort;
    }

    public String getName() {
        return name;
    }

    public String getCohort() {
        return cohort;
    }

    public String talk(String language) {
        return "I Love " + language;
    }
}
