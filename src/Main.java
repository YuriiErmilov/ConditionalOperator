//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        // 1 задача
        int age = 19;
        if (age >= 18) {
            System.out.println(" Он совершеннолетний");
        } else {
            System.out.println(" Он не достиг совершеннолетия");
        }

        int age2 = 16;
        if (age2 >= 18) {
            System.out.println(" он не достиг совершеннолетия ");
        } else {
            System.out.println(" Он не достиг совершеннолетия");
        }


        // 2 задача

        int temperature = 4;

        if (temperature < 5 ) {
            System.out.println("На улице ниже 5 градусов, нужно надеть шапку");
        } else if (temperature > 5) {
            System.out.println("На улице больше 5 градусов, можно идти без шапки");
        }

        int temperature2 = 10;

        if (temperature2 < 5 ) {
            System.out.println("На улице ниже 5 градусов, нужно надеть шапку");
        } else if (temperature2 > 5) {
            System.out.println("На улице больше 5 градусов, можно идти без шапки");
        }

        // 3 задача

        int speed = 57;

        if (speed <= 60) {
            System.out.println("Можно ездить спокойно");
        }  else  {
            System.out.println(" Придеться заплатить штраф");
        }

        int speed2 = 72;

        if (speed2 <= 60) {
            System.out.println("Можно ездить спокойно");
        }  else {
            System.out.println("Придеться заплатить штраф");
        }

        // 4 задача


        int age3 = 5;
        if (age3 >= 2 && age3 <= 6) {
            System.out.println("Если возрат человека равен от 2 до 6 лет, то ему нужно ходить в детский сад");
        }  else if (age3 >= 7 && age3 <= 17) {
            System.out.println("Если возрат человека равен от 7 до 17 лет, то ему нужно ходить в школу");
        }  else if (age3 >= 7 && age3 <= 24) {
            System.out.println("Если возрат человека равен от 18 до 24 лет, то ему нужно ходить в университет");
        }  else {
            System.out.println("Если возрат человека равен 24, то ему нужно ходить на работу");
        }

        int age4 = 13;
        if (age4 >= 2 && age4 <= 6) {
            System.out.println("Если возрат человека равен от 2 до 6 лет, то ему нужно ходить в детский сад");
        }  else if (age4 >= 7 && age4 <= 17) {
            System.out.println("Если возрат человека равен от 7 до 17 лет, то ему нужно ходить в школу");
        }  else if (age4 >= 7 && age4 <= 24) {
            System.out.println("Если возрат человека равен от 18 до 24 лет, то ему нужно ходить в университет");
        }  else {
            System.out.println("Если возрат человека равен 24, то ему нужно ходить на работу");
        }

        int age5 = 19;
        if (age5 >= 2 && age5 <= 6) {
            System.out.println("Если возрат человека равен от 2 до 6 лет, то ему нужно ходить в детский сад");
        }  else if (age5 >= 7 && age5 <= 17) {
            System.out.println("Если возрат человека равен от 7 до 17 лет, то ему нужно ходить в школу");
        }  else if (age5 >= 18 && age5 <= 24) {
            System.out.println("Если возрат человека равен от 18 до 24 лет, то ему нужно ходить в университет");
        }  else {
            System.out.println("Если возрат человека равен 24, то ему нужно ходить на работу");
        }

        int age6 = 25;
        if (age6 >= 2 && age6 <= 6) {
            System.out.println("Если возрат человека равен от 2 до 6 лет, то ему нужно ходить в детский сад");
        }  else if (age6 >= 7 && age6 <= 17) {
            System.out.println("Если возрат человека равен от 7 до 17 лет, то ему нужно ходить в школу");
        }  else if (age6 >= 18 && age6 <= 24) {
            System.out.println("Если возрат человека равен от 18 до 24 лет, то ему нужно ходить в университет");
        }  else {
            System.out.println("Если возрат человека равен 24, то ему нужно ходить на работу");
        }

        // 5 задача


        int ageChild = 4;
        if (ageChild < 5) {
            System.out.println("Если возрат ребенка меньше 5 лет, то ему нельзя кататься на атракционе");
        } else if (ageChild >= 5 && ageChild < 14) {
            System.out.println("Если возраст ребенка больше 5, но меньше 14, то ему можно кататься в сопроваждении взврослого");
        } else {
            System.out.println("Если ребенок старше 14 лет, то он может кататься без сопроваждения");
        }

        int ageChild2 = 10;
        if (ageChild2 < 5) {
            System.out.println("Если возрат ребенка меньше 5 лет, то ему нельзя кататься на атракционе");
        } else if (ageChild2 >= 5 && ageChild2 < 14) {
            System.out.println("Если возраст ребенка больше 5, но меньше 14, то ему можно кататься в сопроваждении взврослого");
        } else {
            System.out.println("Если ребенок старше 14 лет, то он может кататься без сопроваждения");
        }

        int ageChild3 = 16;
        if (ageChild3 < 5) {
            System.out.println("Если возрат ребенка меньше 5 лет, то ему нельзя кататься на атракционе");
        } else if (ageChild3 >= 5 && ageChild3 < 14) {
            System.out.println("Если возраст ребенка больше 5, но меньше 14, то ему можно кататься в сопроваждении взврослого");
        } else {
            System.out.println("Если ребенок старше 14 лет, то он может кататься без сопроваждения");
        }

        // 6 задача

        int passengersInCarriage = 59;
        int allPlaceInCarriage = 102;
        int seatingPositionsInCarriage = 60;
        int standingPlaceInCarriage = allPlaceInCarriage - seatingPositionsInCarriage;

        if  (passengersInCarriage <= seatingPositionsInCarriage) {
            System.out.println("В вагоне осталось " + (seatingPositionsInCarriage - passengersInCarriage) + " сидячих мест и " + (standingPlaceInCarriage) + " стоячих мест.");
        }  else if (passengersInCarriage > seatingPositionsInCarriage && passengersInCarriage < allPlaceInCarriage) {
            System.out.println("В вагоне осталось 0 сидячих мест и " + (allPlaceInCarriage - passengersInCarriage) + " стоячих мест.");
        }  else {
            System.out.println("В вагоне нет мест");
        }


        int passengersInCarriage2 = 64;
        if  (passengersInCarriage2 <= seatingPositionsInCarriage) {
            System.out.println("В вагоне осталось " + (seatingPositionsInCarriage - passengersInCarriage2) + " сидячих мест и " + (standingPlaceInCarriage) + " стоячих мест.");
        }  else if (passengersInCarriage2 > seatingPositionsInCarriage && passengersInCarriage2 < allPlaceInCarriage) {
            System.out.println("В вагоне осталось 0 сидячих мест и " + (allPlaceInCarriage - passengersInCarriage2) + " стоячих мест.");
        }  else  {
            System.out.println("В вагоне нет мест");
        }

        int passengersInCarriage3 = 102;
        if  (passengersInCarriage2 <= seatingPositionsInCarriage) {
            System.out.println("В вагоне осталось " + (seatingPositionsInCarriage - passengersInCarriage3) + " сидячих мест и " + (standingPlaceInCarriage) + " стоячих мест.");
        }  else if (passengersInCarriage3 > seatingPositionsInCarriage && passengersInCarriage3 < allPlaceInCarriage) {
            System.out.println("В вагоне осталось 0 сидячих мест и " + (allPlaceInCarriage - passengersInCarriage3) + " стоячих мест.");
        }  else  {
            System.out.println("В вагоне нет мест");
        }

        // 7 задача

        int one = 1;
        int two = 2;
        int three = 3;

        if (one > two && one > three) {
            System.out.println("one");
        } else if (two > one && two > three) {
            System.out.println("two");
        } else  {
            System.out.println("three");
        }
    }
}