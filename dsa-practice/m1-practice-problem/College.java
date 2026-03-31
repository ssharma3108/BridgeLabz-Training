import java.util.*;

// ProjectTeam Class
class ProjectTeam {
    String teamId;
    String section;
    String domain;
    String projectName;
    int projectScore;

    public ProjectTeam(String teamId, String section, String domain, String projectName, int projectScore) {
        this.teamId = teamId;
        this.section = section;
        this.domain = domain;
        this.projectName = projectName;
        this.projectScore = projectScore;
    }

    @Override
    public String toString() {
        return teamId + " " + section + " " + domain + " " + projectName + " " + projectScore;
    }
}

// Competition Manager Class
class CompetitionManager {

    List<ProjectTeam> teams = new ArrayList<>();

    // Register a team
    public int registerTeam(String teamId, String section, String domain, String projectName, int projectScore) {
        boolean isFound = false;
        for (ProjectTeam pTeam : teams) {
            if (pTeam.teamId.equals(teamId)) {
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            teams.add(new ProjectTeam(teamId, section, domain, projectName, projectScore));
        }

        return 0;
    }

    // Revise a team's score
    public int reviseScore(String teamId, int projectScore) {
        boolean isFound = false;
        for (ProjectTeam pTeam : teams) {
            if (pTeam.teamId.equals(teamId)) {
                pTeam.projectScore = projectScore;
                System.out.println("REVISED " + teamId + " " + projectScore);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("team is not available");
        }

        return 0;
    }

    // Filter teams by domain
    public List<ProjectTeam> filterByDomain(String domain) {
        boolean isFound = false;
        for (ProjectTeam pTeam : teams) {
            if (pTeam.domain.equals(domain)) {
                System.out.println(pTeam);
                isFound = true;
            }
        }

        if (!isFound) {
            System.out.println("Team is not available for the domain: " + domain);
        }

        return null;
    }

    // Qualify teams based on cutoff
    public List<ProjectTeam> qualifyTeams(int cutoff) {
        boolean isFound = false;
        for (ProjectTeam pTeam : teams) {
            if (pTeam.projectScore >= cutoff) {
                System.out.println(pTeam);
                isFound = true;
            }
        }

        if (!isFound) {
            System.out.println("No team qualified");
        }

        return null;
    }
}

// Main Class
class College {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CompetitionManager competitionManager = new CompetitionManager();
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            String[] s = str.split(" ");

            String work = s[0];

            if (work.equals("REGISTER")) {
                String id = s[1];
                String section = s[2];
                String domain = s[3];
                String project = s[4];
                int score = Integer.parseInt(s[5]);

                competitionManager.registerTeam(id, section, domain, project, score);

            } else if (work.equals("FILTERDOMAIN")) {
                String domain = s[1];
                competitionManager.filterByDomain(domain);

            } else if (work.equals("QUALIFY")) {
                int score = Integer.parseInt(s[1]);
                competitionManager.qualifyTeams(score);

            } else if (work.equals("REVISE")) {
                String id = s[1];
                int score = Integer.parseInt(s[2]);
                competitionManager.reviseScore(id, score);
            }
        }

        sc.close();
    }
}