public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 20;
        if (age>=18) {
            System.out.println("Если возраст человека равен "+age+", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен "+age+", то он несовершеннолетний и ему нужно еще немного подождать");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int temp = 2;
        if (temp>5) {
            System.out.println("На улице "+temp+" градусов, можно идти без шапки.");
        } else {
            System.out.println("На улице "+temp+" градусов, нужно надеть шапку.");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int moveSpeed = 35;
        if (moveSpeed>60) {
            System.out.println("Если скорость "+moveSpeed+", то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость "+moveSpeed+", то можно ездить спокойно.");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int age = 68;
        boolean mustGoToKindergarden = age>=2 && age<=6;
        boolean mustGoToSchool = age>=7 && age<=18;
        boolean mustGoToUniversity = age>18 && age<=24;
        boolean mustGoToJob = age>24;
        if (mustGoToKindergarden) {
            System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в детский сад.");
        } else if (mustGoToSchool) {
            System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в школу.");
        } else if (mustGoToUniversity){
            System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в университет.");
        } else if (mustGoToJob) {
            System.out.println("Если возраст человека равен "+age+", то ему нужно ходить на работу.");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int kidAge = 8;
        boolean adultPerson = false;
        if (kidAge<=5) {
            System.out.println("Ребенку "+kidAge+" лет. Он не может прокатиться на аттракционе.");
        } else if (kidAge>=5 && kidAge<14) {
            if (adultPerson) {
                System.out.println("Ребенку "+kidAge+" лет. Он может прокатиться в компании взрослого.");
            } else {
                System.out.println("Ребенку "+kidAge+" лет. Он не может прокатиться без взрослого.");
            }
        } else {
            System.out.println("Ребенку "+kidAge+" лет. Он может прокатиться на аттракционе без взрослого.");
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int placeInTrain = 102;
        int takenSitPlace = 43;
        int takenStandPlace = 15;
        int sitPlace = 60;
        int standPlace = placeInTrain-sitPlace;
        if ((takenStandPlace+takenSitPlace)<placeInTrain) {
            int freePlace = placeInTrain-(takenStandPlace+takenSitPlace);
            System.out.println("В вагоне "+freePlace+" свободных мест(а). А именно:");
            if (takenSitPlace<sitPlace) {
                int freeSitPlace = sitPlace-takenSitPlace;
                System.out.println(freeSitPlace+" сидячих мест(а).");
            } else {
                System.out.println("0 сидячих мест.");
            }
            if (standPlace>takenStandPlace) {
                int freeStandPlace = standPlace-takenStandPlace;
                System.out.println(freeStandPlace+" стоячих мест(а).");
            } else {
                System.out.println("0 стоячих мест.");
            }
        } else {
            System.out.println("Вагон полностью забит, свободных мест нет.");
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int one = 50;
        int two = 89;
        int three = 34;
        boolean oneOrBoth = one > two && one > three;
        if (oneOrBoth) {
            System.out.println("Число под номером 1 - "+one+", наибольшее.");
        } else if (one<two && two<three) {
            System.out.println("Число под номером 3 - "+three+", наибольшее.");
        } else if (one<two && two>three) {
            System.out.println("Число под номером 2 - "+two+", наибольшее.");
        }
    }
}