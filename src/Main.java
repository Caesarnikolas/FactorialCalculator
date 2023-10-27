import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Задание 1 FactorialCalculator

//        int value = new Scanner(System.in).nextInt();
//        int acc = 1;
//
//        for (int i = 1; i <= value; i++) {
//            acc *= i;
//        }
//
//        System.out.println(acc);



        //Задание 2 ForCycle

//        int value = new Scanner(System.in).nextInt();
//
//        for(int i = 1; i <= value; i++) {
//            for(int a = 1; a<= value ; a++) {
//                if(i*a == value) {
//                    System.out.println(i+"*"+a);
//                }
//            }
//
//
//        }

        //Задание 3 SwimmingPool

//        int volume = 1200;
//
//        int fillingSpeed = 30; //30 litres per minute
//
//        int devastationSpeed = 10; //10 litres per minute
//
//        int currentValue = 0;
//        int counter = 0;
//
//        while(currentValue<volume) {
//            currentValue += (fillingSpeed - devastationSpeed);
//            counter++;
//
//
//            if(currentValue==volume) break; // зачем в задачке просят break? решается и без него
//
//        }
//
//        System.out.println(counter);

        //Задание 4 GuessTheNumber

        int value = new Random().nextInt(100);

        boolean start = true;



        while(start) {

                int attempt = new Scanner(System.in).nextInt();

                if (attempt > value) {
                    System.out.println("mnogo");
                };
                if (attempt < value) {
                    System.out.println("malo");
                }
                if (attempt == value) {
                    System.out.println("Вы угадали!");
                    break;
            }

        }


    }
}
