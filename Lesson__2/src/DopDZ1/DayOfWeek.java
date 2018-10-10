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


enum DayOfWeek {
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}
