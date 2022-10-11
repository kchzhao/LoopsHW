public class Main {
    public static void main(String[] args) {
        //HW 1 Exercise 1
        System.out.println("HW 1 Exercise 1");
        int i;
        for(i = 1; i <= 10; i++){
            System.out.println(i);
        }

        //HW 1 Exercise 2
        System.out.println();
        System.out.println("HW 1 Exercise 2");
        for(i = 10; i >= 1; i--){
            System.out.println(i);
        }

        //HW 1 Exercise 3
        System.out.println();
        System.out.println("HW 1 Exercise 3");
        for(i = 0; i <= 17; i++){
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }

        //HW 1 Exercise 4
        System.out.println();
        System.out.println("HW 1 Exercise 4");
        for(i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        //HW 2 Exercise 1
        System.out.println();
        System.out.println("HW 2 Exercise 1");
        for(i = 1904; i <= 2096; i = i + 4){
            System.out.println(i + " год является високосным");
        }

        //HW 2 Exercise 2
        System.out.println();
        System.out.println("HW 2 Exercise 2");
        for(i = 7; i <= 98; i = i + 7){
            System.out.println(i);
        }

        //HW 2 Exercise 3
        System.out.println();
        System.out.println("HW 2 Exercise 3");
        for(i = 1; i <= 512; i = i * 2){
            System.out.println(i);
        }

        //HW 3 Exercise 1
        System.out.println();
        System.out.println("HW 3 Exercise 1");
        int savings = 0;
        for(i = 1; i < 13; i++){
            savings = savings + 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + savings + " рублей");
        }

        //HW 3 Exercise 2
        System.out.println();
        System.out.println("HW 3 Exercise 2");
        savings = 0;
        for(i = 1; i < 13; i++){
            savings = savings + 29000;
            savings = savings + savings/100;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + savings + " рублей");
        }
    }
}