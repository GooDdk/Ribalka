package ribalka;

import java.util.Random;
import java.util.Scanner;

public class Fishing {
    
    public void fishing(){
        boolean repeat = true;
        int fishingRodHp = 10;
        
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
                    switch (fish){
                        case 1:
                            System.out.println("Вы поймали Фугу.");
                        break;
                        case 2:
                            System.out.println("Вы поймали Щуку.");
                        break; 
                        case 3:
                            System.out.println("Вы поймали Лосося.");
                        break;
                    }
                break;
                default:
                    System.out.println("Неверная команда!");
                break;
            }
            
            fishingRodHp--;
            
            if(fishingRodHp <= 0){
                System.out.println("Удочка сломалась =(");
                repeat=false;
            }else{
                System.out.println("Прочность удочки: " + fishingRodHp + " HP");
            }
            
        }while(repeat);           
    }      
}
