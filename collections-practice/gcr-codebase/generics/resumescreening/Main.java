package resumescreening;

import java.util.*;

// -------------------- MAIN CLASS --------------------
public class Main {
  public static void main(String[] args) {

    // Skill sets
    Map<String, Integer> seSkills = Map.of(
        "DSA", 8,
        "Java", 7);

    Map<String, Integer> dsSkills = Map.of(
        "Python", 8,
        "ML", 6);

    Map<String, Integer> pmSkills = Map.of(
        "Communication", 9,
        "Management", 8);

    // Creating resumes (GENERIC CLASS)
    Resume<SoftwareEngineer> r1 = new Resume<>("Amit", new SoftwareEngineer(), seSkills);

    Resume<DataScientist> r2 = new Resume<>("Neha", new DataScientist(), dsSkills);

    Resume<ProductManager> r3 = new Resume<>("Rahul", new ProductManager(), pmSkills);

    // Adding to list
    List<Resume<? extends JobRole>> resumeList = new ArrayList<>();
    resumeList.add(r1);
    resumeList.add(r2);
    resumeList.add(r3);

    // Wildcard processing
    ScreeningPipeline.processAllResumes(resumeList);
  }
}
