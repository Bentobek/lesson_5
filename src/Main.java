import person.Boss;
import person.Hero;

public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(80);
        boss.setDefenseType("Physical Shield");

        System.out.println("person.Boss Information:");
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("Defense Type: " + boss.getDefenseType());

        Hero[] heroes = createHeroes();
        System.out.println("\nHeroes Information:");
        for (Hero hero : heroes) {
            System.out.println("Health: " + hero.getHealth());
            System.out.println("Damage: " + hero.getDamage());
            System.out.println("Super Power: " + hero.getSuperPower());
            System.out.println();
        }
    }


    public static Hero[] createHeroes() {

        Hero hero1 = new Hero(100, 50, "Invisibility");
        Hero hero2 = new Hero(120, 40, "Fireball");
        Hero hero3 = new Hero(90, 60);
        Hero[] heroes = {hero1, hero2, hero3};
        return heroes;
    }
}
