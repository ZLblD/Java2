package DopDZ1;

public class Main {
    public static void main(String[] args) {
        DopDZ_Enum dopDZ_enum = new DopDZ_Enum();
        dopDZ_enum.getWorkingHours(DayOfWeek.Monday);
        dopDZ_enum.getWorkingHours(DayOfWeek.Wednesday);
        dopDZ_enum.getWorkingHours(DayOfWeek.Thursday);
        dopDZ_enum.getWorkingHours(DayOfWeek.Sunday);

        System.out.println();

        for (DayOfWeek o : DayOfWeek.values()) {
            dopDZ_enum.getWorkingHours(o);
        }


    }
}
