
import java.util.Random;

// PATCH 2.0

public class Warld {

	public static void main(String[] args) {
		
		Random r = new Random();
		rewrite Tom = new rewrite();
		rewrite Jack = new rewrite();
		
		String weapon = "dagger";
		int level = 40;
		
		
		// Initialize Base Stats and Weapons
		Tom.baseStats(level);
		Tom.weaponStats(weapon);
		
		Jack.baseStats(level);
		Jack.weaponStats(weapon);
		
		
		/*
		Tom.pinfo();
		System.out.println();
		Jack.pinfo();
		System.out.println();
		*/
		
		
		int damage;
		int dot;
		
		do {
			// ===================== Tom attacks Jack ======================
				System.out.println("Tom attacks!");
				damage = Tom.Attack(Jack.pdefence(), Jack.pparry(), r.nextInt(100), r.nextInt(100));
				if (damage == 0) {
					System.out.println("Jack parries the attack!");
				} else {
					System.out.println("Tom hits Jack for -" + damage + " damage.");
				}
			// ===================== run for HoT heal ======================
				Jack.HoT(damage, r.nextInt(100));
				
			// ==================== run for DoT damage =====================
				dot = Tom.DoT(damage, r.nextInt(100));
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
			
			
			
			// ===================== Jack attacks Tom ======================
				System.out.println("Jack attacks!");
				damage = Jack.Attack(Tom.pdefence(), Tom.pparry(), r.nextInt(100), r.nextInt(100));
				if (damage == 0) {
					System.out.println("Tom parries the atack!");
				} else {
					System.out.println("Jack hits Tom for -" + damage + " damage.");
				}
			// ===================== run for HoT heal ======================
				Tom.HoT(damage, r.nextInt(100));
			// ==================== run for DoT damage =====================
				dot = Jack.DoT(damage, r.nextInt(100));
				if (dot > 0) {
					System.out.println("Tom is bleeding for an additional -" + dot + " damage.");
					damage += dot;
				}
				Tom.incomeHit(damage);
				System.out.println("Tom: " + Tom.pdmgHP() + " / " + Tom.pHP());
			
				if (Tom.pdmgHP() <= 0) {
					System.out.println("Tom has died!");
					break;
				}
			
			// ========================= heal chance =======================
				Tom.Heal(r.nextInt(100), r.nextInt(100));
				System.out.println();
			
		} while (Tom.pdmgHP() > 0 && Jack.pdmgHP() > 0);
		
	}

}
