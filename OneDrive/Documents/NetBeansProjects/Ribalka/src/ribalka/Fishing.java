package ribalka;

import java.util.Random;
import java.util.Scanner;

public class Fishing {
    
    public void fishing(){
        Inventory inventory = new Inventory();
        boolean repeat = true;
        
        do{ 
            System.out.println("");
            System.out.println("------ Озеро ------");
            System.out.println("m - Выход в меню.");
            System.out.println("f - Закинуть удочку.");
            Scanner scn = new Scanner(System.in);
            String task = scn.next().toLowerCase();
            System.out.println("");
        
            switch (task) {
                case "m":
                    repeat=false;
                break;
                case "f":
                    Random rnd = new Random();
                    int fish = rnd.nextInt(3) + 1;
                    inventory.fishingRodHp--;
                    switch (fish){
                        case 1:
                            System.out.println("Вы поймали Фугу.");
                            inventory.fuga++;
                        break;
                        case 2:
                            System.out.println("Вы поймали Щуку.");
                            inventory.shuka++;
                        break; 
                        case 3:
                            System.out.println("Вы поймали Лосося.");
                            inventory.losos++;
                        break;
                    }
                break;
                default:
                    System.out.println("Неверная команда!");
                break;
            }
            
            if(inventory.fishingRodHp <= 0){
                System.out.println("Удочка сломалась =(");
                repeat=false;
            }else{
                System.out.println("Прочность удочки: " + inventory.fishingRodHp + " HP");
            }
            
        }while(repeat);           
    }      
}
