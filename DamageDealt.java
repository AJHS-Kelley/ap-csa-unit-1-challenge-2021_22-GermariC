
// <Germari Cull>, AP CSA Unit 1 Challenge, Andrew Jackson High School, <October 28, 2021>, <9:20>, v0.6
// Peer Debugging by Lorenzo Kenon
import java.util.Scanner;

public class DamageDealt {
  public static void main(string[] args){
      Scanner myScanner = new Scanner(System.in);

      System.out.println("Welcome! What is your name?: ")

      String userName =myScanner.nextLine();

      System.out.println("Hello." + userName);

      System.out.println("What is the name of your monster?: ");

      String nameOfMonster = myScanner.nextLine();

      System.out.println("The Name of your monster is:" + nameOfMonster );
      
      System.out.println("What is the name of your weaponOrAttack?:  ");

      String weaponOrAttack = myScanner.nextLine();

      System.out.println("Your Weapon/attack is called:" + weaponOrAttack)
                    
      String nameOfEnemy = myScanner.nextLine();

      System.out.println("The name of your enemy is: " + nameOfEnemy);

      System.out.println("How many attacks will the player make?:  ");

      String numOfAttacks = myScanner.nextInt();

      System.out.println("Your player made: ");

      String numOfDamage = myScanner.nextInt();

      System.out.println("How much damage will the attack do?: ");

      numOfAttacks *= numOfDamage;
      
      String 
        

    }
}