package ribalka;

import java.util.Scanner;

public class Shop {
    
    public void shop() {
        Inventory inventory = new Inventory();
        boolean repeat = true;
        
        do{ 
            System.out.println("");
            System.out.println("------ Магазин ------");
            System.out.println("m - Выход в меню.");
            System.out.println("f - Продать 1 Фугу за 100$");
            System.out.println("s - Продать 1 Щуку за 50$");
            System.out.println("l - Продать 1 Лосося за 25$");
            System.out.println("Ваш баланс: " + );
            Scanner scn = new Scanner(System.in);
            String task = scn.next().toLowerCase();
            System.out.println("");
        
            switch (task) {
                case "m":
                    repeat=false;
                break;
                case "f":
                    System.out.println("Вы продали 1 Фугу за 100$");
                    
                break;
                case "s":
                    System.out.println("Вы продали 1 Щуку за 50$");
                    
                break;
                case "l":
                    System.out.println("Вы продали 1 Лосося за 25$");
                    
                break;
                default:
                    System.out.println("Неверная команда!");
                break;
            }  
        }while(repeat);
    }  
}
