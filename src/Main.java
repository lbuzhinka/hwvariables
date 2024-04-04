public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        var dog = 8.0;
        System.out.println("dog = " + dog);
        var cat = 3.6;
        System.out.println("cat = " + cat);
        var paper = 763789;
        System.out.println("paper = " + paper);

        System.out.println("Task 2");
        dog = dog + 4;
        System.out.println("dog = " + dog);
        cat = cat + 4;
        System.out.println("cat = " + cat);
        paper = paper + 4;
        System.out.println("paper = " + paper);

        System.out.println("Task 3");
        dog = dog - 3.5;
        System.out.println("dog = " + dog);
        cat = cat - 1.6;
        System.out.println("cat = " + cat);
        paper = paper - 76390;
        System.out.println("paper = " + paper);

        System.out.println("Task 4");
        var friend = 19;
        System.out.println("friend = " + friend);
        friend = friend + 2;
        System.out.println("friend = " + friend);
        friend = friend / 7;
        System.out.println("friend = " + friend);

        System.out.println("Task 5");
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println("frog = " + frog);
        frog = frog + 4;
        System.out.println("frog = " + frog);

        System.out.println("Task 6");
        var firstFightersWeight = 78.2;
        var secondFightersWeight = 82.7;
        var bothTotalFightersWeight = firstFightersWeight + secondFightersWeight;
        System.out.println("Общий вес боксеров " + bothTotalFightersWeight + "кг");
        var fightersWeightDifference = secondFightersWeight - firstFightersWeight;
        System.out.println("Разница в весе боксеров " + fightersWeightDifference + "кг");

        System.out.println("\nTask 7");
        var divisionFightersWeight = secondFightersWeight % firstFightersWeight;
        System.out.println("Остаток от деления в весе " + divisionFightersWeight + "кг");

        System.out.println("\nTask 8");
        var totalWorkTime = 640;
        var hoursPerWorker = 8;
        var allWorkers =  totalWorkTime / hoursPerWorker;
        System.out.println("Всего раотников в компании " + allWorkers + " человек");
        var  newWorkers =  allWorkers + 94;
        System.out.println("С новыми сотрудниками в компании работает " + newWorkers + " человек ");
        var newPerWorkersTime = totalWorkTime / newWorkers;
        System.out.println("Если в компании работает " + newWorkers + " человек, то всего " + newPerWorkersTime +
                " часа может быть поделено между сотрудниками");
    }
}