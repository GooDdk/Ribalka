package ribalka;

public class Inventory {
    
    public static int money;
    public static int fishingRodHp = 10;
    public static int fuga;
    public static int shuka;
    public static int losos;
    
    public void inventory(){
        
        System.out.println("");
        System.out.println("------ Инвентарь ------");
        System.out.println("Удочка HP: " + fishingRodHp + "/10");
        System.out.println("Деньги: " + money + "$");
        System.out.println("Рыба:");
        System.out.println("Фуга - " + fuga);
        System.out.println("Щука - " + shuka);
        System.out.println("Лосось - " + losos);
        System.out.println("");
    }
}
