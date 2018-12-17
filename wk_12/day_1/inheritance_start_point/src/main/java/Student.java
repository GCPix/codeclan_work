public class Student extends Person{

//Person is the superclass the student and instructor get everything form person you can't stop it inheriting
    public Student(String name, String cohort) {
    super (name, cohort);
    }

    public String talk(String language){//talk is a method in both person and student when you run a method through
        // student. it will look for the method there first, if it finds it it will run it and ignore Person class.
        return "I love learning " + language;

        //todo check out using the word override if intellij isn't doing it for you.
    }


}
