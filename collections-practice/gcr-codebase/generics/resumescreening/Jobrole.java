package resumescreening;

import java.util.*;

// -------------------- ABSTRACT BASE CLASS --------------------
abstract class JobRole {
    private String roleName;

    public JobRole(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    // Each role defines its own screening criteria
    public abstract boolean isEligible(Map<String, Integer> skills);
}

// -------------------- SUBCLASSES --------------------
class SoftwareEngineer extends JobRole {

    public SoftwareEngineer() {
        super("Software Engineer");
    }

    @Override
    public boolean isEligible(Map<String, Integer> skills) {
        return skills.getOrDefault("DSA", 0) >= 7 &&
               skills.getOrDefault("Java", 0) >= 6;
    }
}

class DataScientist extends JobRole {

    public DataScientist() {
        super("Data Scientist");
    }

    @Override
    public boolean isEligible(Map<String, Integer> skills) {
        return skills.getOrDefault("Python", 0) >= 7 &&
               skills.getOrDefault("ML", 0) >= 6;
    }
}

class ProductManager extends JobRole {

    public ProductManager() {
        super("Product Manager");
    }

    @Override
    public boolean isEligible(Map<String, Integer> skills) {
        return skills.getOrDefault("Communication", 0) >= 8 &&
               skills.getOrDefault("Management", 0) >= 7;
    }
}

// -------------------- GENERIC RESUME CLASS --------------------
class Resume<T extends JobRole> {

    private String candidateName;
    private T jobRole;
    private Map<String, Integer> skills;

    public Resume(String candidateName, T jobRole, Map<String, Integer> skills) {
        this.candidateName = candidateName;
        this.jobRole = jobRole;
        this.skills = skills;
    }

    // Generic method
    public void screenResume() {
        System.out.println("Screening resume for: " + candidateName);
        System.out.println("Applied Role: " + jobRole.getRoleName());

        if (jobRole.isEligible(skills)) {
            System.out.println("Result: ✅ Selected\n");
        } else {
            System.out.println("Result: ❌ Rejected\n");
        }
    }
}

// -------------------- SCREENING PIPELINE USING WILDCARDS --------------------
class ScreeningPipeline {

    // Wildcard usage
    public static void processAllResumes(List<? extends Resume<? extends JobRole>> resumes) {
        for (Resume<? extends JobRole> resume : resumes) {
            resume.screenResume();
        }
    }
}