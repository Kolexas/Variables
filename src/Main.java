public class Main {
    public static void main(String[] args) {
        // Задание 1 ()
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("1. " + dog + " " + cat + " " + paper);
        // Задание 2
        var dog2 = dog + 4;
        var cat2 = cat + 4;
        var paper2 = paper + 4;
        System.out.println("2. " + dog2 + " " + cat2 + " " + paper2);
        // Задание 3
        var dog3 = dog2 - 3.5;
        var cat3 = cat2 - 1.6;
        var paper3 = paper2 - 7639;
        System.out.println("3. " + dog3 + " " + cat3 + " " + paper3);
        // Задание 4
        var friend = 19;
        var friend2 = friend+2;
        var friend3 = friend2/7;
        System.out.println("4. " + friend + " " + friend2 + " " + friend3);
        // Задание 5
        var frog = 3.5;
        var frog2 = frog*10;
        var frog3 = frog2/3.5;
        var frog4=frog3+4;
        System.out.println("5. " + frog + " " + frog2 + " " + frog3 + " " + frog4);
        // Задание 6
        var boxerWeight1=78.2;
        var boxerWeight2=82.7;
        var boxersWeight=boxerWeight1+boxerWeight2;
        var boxersWeightDiff=boxerWeight2-boxerWeight1;
        System.out.println("6. Общая масса бойцов = " + boxersWeight);
        System.out.println("   Разница массы между бойцами = " + boxersWeightDiff);
        // Задание 7
        var boxersWeightDiv = boxerWeight2 % boxerWeight1;
        System.out.println("   Остаток от деления масс бойцов = " + boxersWeightDiv);
        // Задание 8
        var totalHours = 640;
        var hoursPerDay = 8;
        var totalStaffNum = totalHours/hoursPerDay;
        System.out.println("8. Всего работников в компании - " + totalStaffNum);
        var totalStaffNum2= totalStaffNum + 94;
        var totalHours2 = totalStaffNum2 * 8;
        System.out.println("   Если в компании работает " + totalStaffNum2 + " человек, " +
        "то всего " + totalHours2 + " часов работы может быть поделено между сотрудниками");
    }
}