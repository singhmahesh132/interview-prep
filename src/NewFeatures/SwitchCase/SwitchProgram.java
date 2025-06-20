package src.NewFeatures.SwitchCase;

public class SwitchProgram {

    //Traditional way using switch-case
    public void getDaysTraditional(int day){
        String dayName = switch (day) {
            case 1 -> "Weekday";
            case 2 -> "Weekday";
            case 3 -> "Weekday";
            case 4 -> "Weekday";
            case 5 -> "Weekday";
            case 6 -> "Weekend";
            case 7 -> "Weekend";
            default -> throw new IllegalArgumentException("Invalid day: " + day);
        };
        System.out.println("Day " + day + " is " + dayName);
    }

    //New way using enhanced switch-case
    public void getDaysEnhanced(int day) {
        String dayName = switch (day) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> { yield "Invalid day: " + day;}
        };
        System.out.println("Day " + day + " is " + dayName);
    }

    public static void main(String[] args) {
        SwitchProgram switchProgram = new SwitchProgram();
        switchProgram.getDaysTraditional(3);
        switchProgram.getDaysEnhanced(3);
        switchProgram.getDaysEnhanced(4);
        switchProgram.getDaysEnhanced(7);
        switchProgram.getDaysEnhanced(9);
        switchProgram.getDaysTraditional(9);
    }
}
