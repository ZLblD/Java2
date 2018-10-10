package DopDZ1;

/**
 * Требуется реализовать enum DopDZ1.DayOfWeek, который будет представлять дни недели.
 * С его помощью необходимо решить задачу определения кол-ва рабочих часов до конца недели по заднному текущему дню.
 * <p>
 * Возвращает кол-во оставшихся рабочих часов до конца
 * недели по заданному текущему дню. Считается, что
 * текущий день ещё не начался, и рабочие часы за него
 * должны учитываться.
 * <p>
 * public class DayOfWeekMain {
 * <p>
 * public static void main(final String[] args) {
 * System.out.println(getWorkingHours(DopDZ1.DayOfWeek.MONDAY));
 * }
 */

class DopDZ_Enum {

    void getWorkingHours(DayOfWeek dayOfWeek) {
        switch (dayOfWeek) {
            case Monday:
                System.out.println("До конца рабочей недели осталось 40 часов");
                break;
            case Tuesday:
                System.out.println("До конца рабочей недели осталось 32 часа");
                break;
            case Wednesday:
                System.out.println("До конца рабочей недели осталось 24 часа");
                break;
            case Thursday:
                System.out.println("До конца рабочей недели осталось 16 часов");
                break;
            case Friday:
                System.out.println("До конца рабочей недели осталось 8 часов");
                break;
            case Saturday:
                System.out.println("Сегодня выходной");
                break;
            case Sunday:
                System.out.println("Сегодня выходной");
                break;
        }

    }






}
