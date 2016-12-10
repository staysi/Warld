
import java.util.Random;
import java.util.Scanner;

// PATCH 2.0

public class Warld {

	public static void main(String[] args) {
		
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		rewrite You = new rewrite();
		rewrite Jack = new rewrite();
		
		String weapon = "dagger";
		int level = 40;
		
		
		// Initialize Base Stats and Weapons
		You.baseStats(level);
		You.weaponStats(weapon);
		
		Jack.baseStats(level);
		Jack.weaponStats(weapon);
		
		
		/*
		You.pinfo();
		System.out.println();
		Jack.pinfo();
		System.out.println();
		*/
		
		
		int damage;
		int dot;
		if (You.pdexterity() > Jack.pdexterity()) {
		do {
			// ===================== You attack Jack ======================
				System.out.println("You attack!");
				damage = You.Attack(Jack.pdefence(), Jack.pparry(), r.nextInt(100), r.nextInt(100));
				if (damage == 0) {
					System.out.println("Jack parries the attack!");
				} else {
					System.out.println("You hits Jack for -" + damage + " damage.");
				}
			// ===================== run for HoT heal ======================
				Jack.HoT(damage, r.nextInt(100));
				
			// ==================== run for DoT damage =====================
				dot = You.DoT(damage, r.nextInt(100));
				if (dot > 0) {
					System.out.println("Jack is bleeding for an additional -" + dot + " damage.");
					damage += dot;
				}
				Jack.incomeHit(damage);
				System.out.println("Jack: " + Jack.pdmgHP() + " / " + Jack.pHP());
			
				if (Jack.pdmgHP() <= 0) {
					System.out.println("Jack has died!");
					break;
				}
			
			// ========================= heal chance =======================
				Jack.Heal(r.nextInt(100), r.nextInt(100));
				System.out.println();
			
			
			// 888888888888888888888888888888888888888888888888888888888888888888888888888888888
			// 888888888888888888888888888888888888888888888888888888888888888888888888888888888
			
			
			
			// ===================== Jack attacks You ======================
				System.out.println("Jack attacks!");
				damage = Jack.Attack(You.pdefence(), You.pparry(), r.nextInt(100), r.nextInt(100));
				if (damage == 0) {
					System.out.println("You parry the atack!");
				} else {
					System.out.println("Jack hits You for -" + damage + " damage.");
				}
			// ===================== run for HoT heal ======================
				You.HoT(damage, r.nextInt(100));
			// ==================== run for DoT damage =====================
				dot = Jack.DoT(damage, r.nextInt(100));
				if (dot > 0) {
					System.out.println("You are bleeding for an additional -" + dot + " damage.");
					damage += dot;
				}
				You.incomeHit(damage);
				System.out.println("You: " + You.pdmgHP() + " / " + You.pHP());
			
				if (You.pdmgHP() <= 0) {
					System.out.println("You has died!");
					break;
				}
			
			// ========================= heal chance =======================
				You.Heal(r.nextInt(100), r.nextInt(100));
				System.out.println();
			
		} while (You.pdmgHP() > 0 && Jack.pdmgHP() > 0);
		}
		else {
			do {
				// ===================== Jack attacks You ======================
				System.out.println("Jack attacks!");
				damage = Jack.Attack(You.pdefence(), You.pparry(), r.nextInt(100), r.nextInt(100));
				if (damage == 0) {
					System.out.println("You parry the atack!");
				} else {
					System.out.println("Jack hits You for -" + damage + " damage.");
				}
			// ===================== run for HoT heal ======================
				You.HoT(damage, r.nextInt(100));
			// ==================== run for DoT damage =====================
				dot = Jack.DoT(damage, r.nextInt(100));
				if (dot > 0) {
					System.out.println("You are bleeding for an additional -" + dot + " damage.");
					damage += dot;
				}
				You.incomeHit(damage);
				System.out.println("You: " + You.pdmgHP() + " / " + You.pHP());
			
				if (You.pdmgHP() <= 0) {
					System.out.println("You has died!");
					break;
				}
			
			// ========================= heal chance =======================
				You.Heal(r.nextInt(100), r.nextInt(100));
				System.out.println();
				
			
				
			// 888888888888888888888888888888888888888888888888888888888888888888888888888888888
			// 888888888888888888888888888888888888888888888888888888888888888888888888888888888
			
			
				
			// ===================== You attack Jack ======================
				System.out.println("You attack!");
				damage = You.Attack(Jack.pdefence(), Jack.pparry(), r.nextInt(100), r.nextInt(100));
				if (damage == 0) {
					System.out.println("Jack parries the attack!");
				} else {
					System.out.println("You hits Jack for -" + damage + " damage.");
				}
			// ===================== run for HoT heal ======================
				Jack.HoT(damage, r.nextInt(100));
				
			// ==================== run for DoT damage =====================
				dot = You.DoT(damage, r.nextInt(100));
				if (dot > 0) {
					System.out.println("Jack is bleeding for an additional -" + dot + " damage.");
					damage += dot;
				}
				Jack.incomeHit(damage);
				System.out.println("Jack: " + Jack.pdmgHP() + " / " + Jack.pHP());
			
				if (Jack.pdmgHP() <= 0) {
					System.out.println("Jack has died!");
					break;
				}
			
			// ========================= heal chance =======================
				Jack.Heal(r.nextInt(100), r.nextInt(100));
				System.out.println();
			
			
		} while (You.pdmgHP() > 0 && Jack.pdmgHP() > 0);
		}
	}

}
