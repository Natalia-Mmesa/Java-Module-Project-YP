import java.util.Scanner;

// dev branch for Y.Practicum
public class Main {

    public static void main(String[] args) {
        System.out.println("Привет Мир");
        System.out.println("На сколько гостей делить счет?");
        calculator.Produkti();

    }

        public static int novPersoni () {
        // ваш код начнется здесь
        Scanner scanner = new Scanner(System.in);
        // вы не должны ограничиваться только классом Main и можете создавать свои классы по необходимости
        int ludi = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                ludi= scanner.nextInt();
                if (ludi==1){
                    System.out.println("Зачем делить?");
                } else if (ludi<1){
                    System.out.println("совсем не то");
                } else if (ludi>1){
                    System.out.println("наконец то, начнем считать!");

                    break;}
            }
            else {
                System.out.println("Введите число");
                scanner.next();
            }
            System.out.println("Попробуем еще");
            }
        return ludi;
        }
    }

