package ribalka;

import java.util.Scanner;

class Menu {
    
    public void run(){
        System.out.println("======= Рыбалка =======");
        boolean repeat = true;
        
        do{ 
            System.out.println("");
            System.out.println("------ Меню ------");
            System.out.println("exit - Выход.");
            System.out.println("start - Рыбачить.");
            System.out.println("inv - Инвентарь.");
            System.out.println("Введите команду: ");
            Scanner scn = new Scanner(System.in);
            String task = scn.next().toLowerCase();
            System.out.println("");
            
            switch (task) {
                case "exit":
                    System.out.println("Игра закрывается!");
                    repeat=false;
                    break;
                case "start":
                    Fishing fishing = new Fishing();
                    fishing.fishing();
                    break;
                case "inv":
                    Inventory inventory = new Inventory();
                    inventory.inventory();
                    break;
                default:
                    System.out.println("Неверная команда!");
                    break;
            }
        }while(repeat);
    }
}
