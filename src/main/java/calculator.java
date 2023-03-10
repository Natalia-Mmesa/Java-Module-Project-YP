import java.util.Scanner;

public class calculator {
    public static void Produkti (){
        int x = Main.novPersoni();
        double sum = 0.00;
        String tovar = ("Добавленные блюда:");

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите название блюда: ");
            String bludo = scanner.next();

            System.out.println("Введите цену");
            if (scanner.hasNextDouble()) {
                double cena = scanner.nextDouble();
                if (cena<=0) {
                    System.out.println("Разве так бывает...");
                }
                if (cena>0){
                    tovar=tovar+ "\n" + bludo + " по цене " + cena;
                    sum = sum + cena;
                    System.out.println("Товар успешно добавлен");

                    Scanner otvet = new Scanner(System.in);
                    System.out.println("Добавить еще? Если нет - напишите завершить");
                    String otvet1 = otvet.next();
                    if (otvet1.equalsIgnoreCase("завершить")) {
                        System.out.println(tovar);
                        break;
                    }
                }
            } else {
                System.out.println("Необходимо ввести число - в формате: руб.коп");
                scanner.next();
            }
        }
        String result = String.format("%.2f", sum);
        System.out.println("Итоговая сумма: " + result);
        double itog = sum/x;
        System.out.println("Каждый должен заплатить: "+ String.format("%.2f",itog) + " " + Formater.Formater(itog));

    }
}

