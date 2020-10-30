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
            System.out.println("r - Починить удочку за 350$");
            System.out.println("f - Продать 1 Фугу за 100$");
            System.out.println("s - Продать 1 Щуку за 50$");
            System.out.println("l - Продать 1 Лосося за 25$");
            System.out.println("Ваш баланс: " + inventory.money + "$");
            Scanner scn = new Scanner(System.in);
            String task = scn.next().toLowerCase();
            System.out.println("");
        
            switch (task) {
                case "m":
                    repeat=false;
                break;
                case "r":
                    if(inventory.fishingRodHp >= 10){
                        System.out.println("У вас целая удочка!");
                    }else{
                        if(inventory.money < 350){
                            System.out.println("У вас не достаточно средств!");
                        } else {
                            System.out.println("Вы починили удочку за 350$");
                            inventory.fishingRodHp = inventory.fishingRodHp + 10;
                            inventory.money = inventory.money - 350;
                        }
                    }
                break;
                case "f":
                    if(inventory.fuga <= 0){
                        System.out.println("У вас нету этой рыбы!");
                    }else{
                        System.out.println("Вы продали 1 Фугу за 100$");
                        inventory.fuga--;
                        inventory.money = inventory.money + 100;
                    }
                break;
                case "s":
                    if(inventory.shuka <= 0){
                        System.out.println("У вас нету этой рыбы!");
                    }else{
                        System.out.println("Вы продали 1 Щуку за 50$");
                        inventory.shuka--;
                        inventory.money = inventory.money + 50;
                    }
                break;
                case "l":
                    if(inventory.losos <= 0){
                        System.out.println("У вас нету этой рыбы!");
                    }else{
                        System.out.println("Вы продали 1 Лосося за 25$");
                        inventory.losos--;
                        inventory.money = inventory.money + 25;
                    }
                break;
                default:
                    System.out.println("Неверная команда!");
                break;
            }  
        }while(repeat);
    }  
}
