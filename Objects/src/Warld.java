
import java.util.Random;
import java.util.Scanner;

// PATCH 2.1

public class Warld {

	public static void main(String[] args) {
		
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		rewrite You = new rewrite();
		rewrite Jack = new rewrite();

		
		System.out.println("Welcome to Warld!");
		
		System.out.println("Choose a name.");
		String name = s.next();
		
		System.out.println("Choose a Class!");
		System.out.println("1 . Warrior - Low Damage / High Defence\n2 . Rogue   - High Damage / Low Defence\n3 . Wizard  - Medium Damage / Ability to Heal");
		int Class = s.nextInt();
		
		int x = 0;
		int weapon;

		String mainHand = "";
		String offHand = "";
		do{
			if (Class == 1) {
				x = 1;
				System.out.println(" === Warrior === ");
				System.out.println(" Choose you're weapon of choice.");
				System.out.println("1 . Dual-Wield Daggers\n2 . Two-Hand Sword\n3 . One-Hand Dagger + Shield");
				weapon = s.nextInt();
				
				do {
					if (weapon == 1) {
						x = 2;
						mainHand = "dagger";
						offHand = "dagger";
						break;
					}
					else if (weapon == 2) {
						x = 2;
						mainHand = "sword";
						offHand = "none";
						break;
					}
					else if (weapon == 3) {
						x = 2;
						mainHand = "dagger";
						offHand = "shield";
						break;
					}
					else {
						System.out.println("Please choose from options 1 / 2 / 3");
						System.out.println("1 . Dual-Wield Daggers\n2 . Two-Hand Sword\n3 . One-Hand Dagger + Shield");
					}
				} while (x != 2);
				break;
			}
			else if (Class == 2) {
				x = 1;
				System.out.println(" === Rogue === ");
				System.out.println(" Choose you're weapon of choice.");
				System.out.println("1 . Dual-Wield Daggers\n2 . Two-Hand Sword\n3 . One-Hand Dagger + Crit Glove");
				weapon = s.nextInt();
				
				do {
					if (weapon == 1) {
						x = 2;
						mainHand = "dagger";
						offHand = "dagger";
						break;
					}
					else if (weapon == 2) {
						x = 2;
						mainHand = "sword";
						offHand = "none";
						break;
					}
					else if (weapon == 3) {
						x = 2;
						mainHand = "dagger";
						offHand = "glove";
						break;
					}
					else {
						System.out.println("Please choose from options 1 / 2 / 3");
						System.out.println("1 . Dual-Wield Daggers\n2 . Two-Hand Sword\n3 . One-Hand Dagger + Crit Glove");
					}
				} while (x != 2);
				
				break;
			}
			else if (Class == 3) {
				x = 1;
				System.out.println(" === Wizard === ");
				System.out.println(" Choose you're weapon of choice.");
				System.out.println("1 . Dual-Wield Wands\n2 . Two-Hand Staff\n3 . One-Hand Wand + Relic");
				weapon = s.nextInt();
				
				do {
					if (weapon == 1) {
						x = 2;
						mainHand = "wand";
						offHand = "wand";
						break;
					}
					else if (weapon == 2) {
						x = 2;
						mainHand = "staff";
						offHand = "none";
						break;
					}
					else if (weapon == 3) {
						x = 2;
						mainHand = "wand";
						offHand = "relic";
						break;
					}
					else {
						System.out.println("Please choose from options 1 / 2 / 3");
						System.out.println("1 . Dual-Wield Wands\n2 . Two-Hand Staff\n3 . One-Hand Wand + Relic");
					}
				} while (x != 2);
				
				break;
			}
			else {
				System.out.println("Please choose options 1 / 2 / 3");
				System.out.println("Choose a Class!");
				System.out.println("1 . Warrior\n2 . Rogue\n3 . Wizard");
			}
		}while(x != 2);
		
		
		
		int level = 40;
		
		
		// Initialize Base Stats and Weapons
		You.baseStats(level, mainHand, offHand);
		//You.weaponStats(mainHand, offHand);
		String OmainHand = "", OoffHand = "";

		System.out.println("What would you like to play against?");
		System.out.println("1 . Random Bot\n2 . Choose class/weapons");
		int bot = s.nextInt();
		
		
		if (bot == 0) {
			int one = r.nextInt(3), two = r.nextInt(3);
			if (one == 0) {
				OmainHand = "dagger";
				if (two == 0)
					OoffHand = "dagger";
				else if (two == 1)
					OoffHand = "shield";
				else if (two == 2)
					OoffHand = "glove";
			}
			else if (one == 1) {
				OoffHand = "none";
				if (two == 0)
					OmainHand = "sword";
				else
					OmainHand = "staff";
			}
			else if (one == 2) {
				OmainHand = "wand";
				if (two == 0)
					OoffHand = "wand";
				else
					OoffHand = "relic";
			} 
		}
		else if (bot == 2) {
			System.out.println("Choose a Class!");
			System.out.println("1 . Warrior - Low Damage / High Defence\n2 . Rogue - High Damage / Low Defence\n3 . Wizard - Medium Damage / Ability to Heal");
			Class = s.nextInt();
			do{
				if (Class == 1) {
					x = 1;
					System.out.println(" === Warrior === ");
					System.out.println(" Choose you're weapon of choice.");
					System.out.println("1 . Dual-Wield Daggers\n2 . Two-Hand Sword\n3 . One-Hand Dagger + Shield");
					weapon = s.nextInt();
					
					do {
						if (weapon == 1) {
							x = 2;
							OmainHand = "dagger";
							OoffHand = "dagger";
							break;
						}
						else if (weapon == 2) {
							x = 2;
							OmainHand = "sword";
							OoffHand = "none";
							break;
						}
						else if (weapon == 3) {
							x = 2;
							OmainHand = "dagger";
							OoffHand = "shield";
							break;
						}
						else {
							System.out.println("Please choose from options 1 / 2 / 3");
							System.out.println("1 . Dual-Wield Daggers\n2 . Two-Hand Sword\n3 . One-Hand Dagger + Shield");
						}
					} while (x != 2);
					break;
				}
				else if (Class == 2) {
					x = 1;
					System.out.println(" === Rogue === ");
					System.out.println(" Choose you're weapon of choice.");
					System.out.println("1 . Dual-Wield Daggers\n2 . Two-Hand Sword\n3 . One-Hand Dagger + Crit Glove");
					weapon = s.nextInt();
					
					do {
						if (weapon == 1) {
							x = 2;
							OmainHand = "dagger";
							OoffHand = "dagger";
							break;
						}
						else if (weapon == 2) {
							x = 2;
							OmainHand = "sword";
							OoffHand = "none";
							break;
						}
						else if (weapon == 3) {
							x = 2;
							OmainHand = "dagger";
							OoffHand = "glove";
							break;
						}
						else {
							System.out.println("Please choose from options 1 / 2 / 3");
							System.out.println("1 . Dual-Wield Daggers\n2 . Two-Hand Sword\n3 . One-Hand Dagger + Crit Glove");
						}
					} while (x != 2);
					
					break;
				}
				else if (Class == 3) {
					x = 1;
					System.out.println(" === Wizard === ");
					System.out.println(" Choose you're weapon of choice.");
					System.out.println("1 . Dual-Wield Wands\n2 . Two-Hand Staff\n3 . One-Hand Wand + Relic");
					weapon = s.nextInt();
					
					do {
						if (weapon == 1) {
							x = 2;
							OmainHand = "wand";
							OoffHand = "wand";
							break;
						}
						else if (weapon == 2) {
							x = 2;
							OmainHand = "staff";
							OoffHand = "none";
							break;
						}
						else if (weapon == 3) {
							x = 2;
							OmainHand = "wand";
							OoffHand = "relic";
							break;
						}
						else {
							System.out.println("Please choose from options 1 / 2 / 3");
							System.out.println("1 . Dual-Wield Wands\n2 . Two-Hand Staff\n3 . One-Hand Wand + Relic");
						}
					} while (x != 2);
					
					break;
				}
				else {
					System.out.println("Please choose options 1 / 2 / 3");
					System.out.println("Choose a Class!");
					System.out.println("1 . Warrior\n2 . Rogue\n3 . Wizard");
				}
			}while(x != 2);
		}
		Jack.baseStats(level, OmainHand, OoffHand);
		//Jack.weaponStats(OmainHand, OoffHand);
		
		
		System.out.println(name + "'s Stats: " + mainHand + " , " + offHand);
		You.pinfo();
		System.out.println("\nJack's Stats: " + OmainHand + " , " + OoffHand);
		Jack.pinfo();
		System.out.println();
		
		
		int isHeal = 0;
		int damage;
		int dot;
		
		do {

			
			// ===================== You attacks Jack ======================
				System.out.println(name + " attacks!");
				damage = You.Attack(Jack.pdefence(), Jack.pparry(), r.nextInt(100), r.nextInt(100));
				if (damage == 0) {
					System.out.println("Jack parries the attack!");
				} else {
					System.out.println(name + " hits Jack for -" + damage + " damage.");
				}
			// ===================== run for HoT heal ======================
				isHeal = Jack.HoT(damage, r.nextInt(100));
				if (isHeal > 0) {
					System.out.println("Jack procs HoT for +" + isHeal + "hp.");
					System.out.println("Jack: " + Jack.pdmgHP() + " / " + Jack.pHP());
					System.out.println();
					isHeal = 0;
				}
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
				isHeal = Jack.Heal(r.nextInt(100), r.nextInt(100));
				if (isHeal > 0) {
					System.out.println("Jack is HEALED for +" + isHeal + "hp.");
					System.out.println("Jack: " + Jack.pdmgHP() + " / " + Jack.pHP());
					System.out.println();
					isHeal = 0;
				}
				else
					System.out.println();
			
			
			// 888888888888888888888888888888888888888888888888888888888888888888888888888888888
			// 888888888888888888888888888888888888888888888888888888888888888888888888888888888
			
			
			
			// ===================== Jack attacks You ======================
				System.out.println("Jack attacks!");
				damage = Jack.Attack(You.pdefence(), You.pparry(), r.nextInt(100), r.nextInt(100));
				if (damage == 0) {
					System.out.println(name + " parries the atack!");
				} else {
					System.out.println("Jack hits " + name + " for -" + damage + " damage.");
				}
			// ===================== run for HoT heal ======================
				isHeal = You.HoT(damage, r.nextInt(100));
				if (isHeal > 0) {
					System.out.println(name + " procs HoT for +" + isHeal + "hp.");
					System.out.println(name + ": " + You.pdmgHP() + " / " + You.pHP());
					System.out.println();
					isHeal = 0;
				}
			// ==================== run for DoT damage =====================
				dot = Jack.DoT(damage, r.nextInt(100));
				if (dot > 0) {
					System.out.println(name + " is bleeding for an additional -" + dot + " damage.");
					damage += dot;
				}
				You.incomeHit(damage);
				System.out.println(name + ": " + You.pdmgHP() + " / " + You.pHP());
			
				if (You.pdmgHP() <= 0) {
					System.out.println(name + " has died!");
					break;
				}
			
			// ========================= heal chance =======================
				You.Heal(r.nextInt(100), r.nextInt(100));
				if (isHeal > 0) {
					System.out.println(name + " is HEALED for +" + isHeal + "hp.");
					System.out.println(name + ": " + You.pdmgHP() + " / " + You.pHP());
					System.out.println();
					isHeal = 0;
				}
				else
					System.out.println();
			
		} while (You.pdmgHP() > 0 && Jack.pdmgHP() > 0);
		
	}

}
