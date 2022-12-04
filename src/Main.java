import java.util.ArrayList;
import java.util.Scanner;




public class Main {
    public static void main(String[] args) {
        boolean end = true;
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> purchases = new ArrayList<>();

        while (end) {
            System.out.println("Выберите операцию");
              String operation = scanner.next();
              switch (operation) {
                  case ("1") : {
                      System.out.println("Введите название покупки");
                      purchases.add(scanner.next());
                      break;
                  }
                  case ("2") : {
                      showPurchases(purchases);
                      break;
                  }
                  case ("3") : {
                      showPurchases(purchases);
                      System.out.println("Ккакую хотите удалить? Введите номер или название");
                      String delete = scanner.next();
                      if(number(delete)) {
                          int i = Integer.parseInt(delete);
                          purchases.remove(--i);
                      }
                      purchases.remove(delete);
                      break;
                  }
                  default: {
                      end = false;
                  }
              }
        }
    }
    private static boolean number(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }



    private static void showPurchases(ArrayList<String> purchases) {
        int count = 1;
        System.out.println("Список покупок:");
        for (String purchase: purchases) {
            System.out.println((count++) + ". " + purchase);
        }
    }
}