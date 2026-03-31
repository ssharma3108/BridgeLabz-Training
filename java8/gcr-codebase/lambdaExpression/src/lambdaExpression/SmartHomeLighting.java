package lambdaExpression;
import java.util.HashMap;
import java.util.Map;

// Functional interface
interface LightAction {
    void activate();
}

public class SmartHomeLighting {

    public static void main(String[] args) {

        // Store trigger-based lighting behaviors
        Map<String, LightAction> lightingActions = new HashMap<>();

        // Motion-based lighting
        lightingActions.put("motion", () -> {
            System.out.println("Motion detected");
            System.out.println("Lights turned ON");
            System.out.println("Brightness set to 100%");
        });

        // Time-based lighting
        lightingActions.put("evening", () -> {
            System.out.println("Evening time detected");
            System.out.println("Warm dim lights turned ON");
        });

        lightingActions.put("night", () -> {
            System.out.println("Night time detected");
            System.out.println("Lights set to low brightness (Night Mode)");
        });

        // Voice-command lighting
        lightingActions.put("voice", () -> {
            System.out.println("Voice command received");
            System.out.println("Party mode activated");
            System.out.println("Colorful ambient lights turned ON");
        });

        // ---- Trigger execution (simulation) ----
        executeTrigger(lightingActions, "motion");
        executeTrigger(lightingActions, "evening");
        executeTrigger(lightingActions, "voice");
        executeTrigger(lightingActions, "invalid");
    }

    // Method to execute lighting behavior
    static void executeTrigger(Map<String, LightAction> actions, String trigger) {
        System.out.println("\nTrigger: " + trigger.toUpperCase());

        LightAction action = actions.get(trigger);

        if (action != null) {
            action.activate();
        } else {
            System.out.println("Invalid trigger detected");
        }
    }
}
