public class _21_Petrov {
    public static void main(String[] args) {
        int forPetrov = (int) (Math.random() * 28_800);
        System.out.println("Для Петрова: " + forPetrov );
        int time = forPetrov/(60*60);
        String end;
        if (time > 1){
            end = "a";
            if ( time > 4) {
                end = "ов";
            }
            System.out.println("Для сотрудниц: осталось "
                    + time
                    + " час"
                    + end );
        } else if (forPetrov > 0){
            System.out.println("Для сотрудниц: осталось менее часа");
        } else {
            System.out.println("Для сотрудниц: рабочий день окончен");
        }
    }
}
