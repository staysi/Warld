

// PATCH 2.0

public class rewrite {

	private int level;
	
	// Base Stats
	private int strength;
	private int dexterity;
	private int intellect;
	
	// Secondary Stats
	private int crit;
	private int defence;
	private int parry;
	private int attack;
	private int BaseHP;
	private int dmgHP;
	
	// Utility
	private double heal;
	public int DoT;
	public int HoT;
	public int dcounter;
	public int hcounter;
	
	
	public void baseStats(int Level) {
		level = Level;
		strength = 10 + (level);
		dexterity = 12 + (level);
		intellect = 12 + (level);
		
		crit = 10 + dexterity/2;
		defence = 10 + dexterity/4 + intellect/3;
		parry = 5 + defence/2;
		BaseHP = 120 + defence;
		dmgHP = BaseHP;
		
		attack = 5 + strength + dexterity/2;
	}
	
	public void weaponStats(String weapon) {
		if (weapon == "dagger") {
			dexterity += 27;
			BaseHP += 30;
		}
		else if (weapon == "sword") {
			strength += 20;
			defence += 16;
			BaseHP += 35;
		}
		else if (weapon == "staff") {
			intellect += 30;
			defence += 45;
		}
		dmgHP = BaseHP;
	}
	
	public void Heal(int chance, int critHeal) {
		if (chance % 10 == 0) {
			heal = attack + intellect;
			if (critHeal % 20 == 0) {
				heal *= (double)(1 + crit/100);
			}
			System.out.println("========== HEAL +" + (int)heal + "hp ==========");
			dmgHP += heal;
		}
		
	}
	
	
	public void HoT(int idamage, int chance) {
		if (chance % 20 == 0) {
			hcounter = 4;
			if (idamage != 0) {
				HoT = (int)(idamage/4) + intellect/2;
			}
			else {
				HoT = (int)(attack/4) + intellect/2;
			}
			System.out.println("==================== HOT! (+" + HoT + "hp) " + hcounter + "/4");
			dmgHP += HoT;
			hcounter--;
		}
		else if (hcounter > 0) {
			System.out.println("==================== HOT! (+" + HoT + "hp) " + hcounter + "/4");
			dmgHP += HoT;
			hcounter--;
		}
	}
	
	
	public int DoT(int damage, int chance) {
		if (chance % 20 == 0 && damage != 0) {
			DoT = (int)(damage/5 + intellect/2);
			dcounter = 4;
			dcounter--;
			return DoT;
		}
		else if (dcounter > 0) {
			dcounter--;
			return DoT;
		}
		else
			return 0;
	}
	
	public void incomeHit(int damage) {
		dmgHP -= damage;
	}
	
	public int Attack(int eDef, int eParry, int pChance, int cChance) {
		if (pChance <= eParry) {
			System.out.println("========== PARRY ==========");
			return 0;
		}
		else {
			if (cChance <= crit) {
				System.out.println("========== CRIT ==========");
				return (int) (1.5 * attack * (1 - (double)(eDef/100)));
			}
			else 
				return (int) (attack * (1 - (double)(eDef/100)));
		}
		
	}
	
	
	// Print Information
	public int plevel() {
		return level;
	}
	public int pstrength() {
		return strength;
	}
	public int pdexterity() {
		return dexterity;
	}
	public int pintellect() {
		return intellect;
	}
	public int pcrit() {
		return crit;
	}
	public int pdefence() {
		return defence;
	}
	public int pparry() {
		return parry;
	}
	public int pattack() {
		return attack;
	}
	public int pHP() {
		return BaseHP;
	}
	public int pdmgHP() {
		return dmgHP;
	}

	public void pinfo() {
		System.out.println("lvl " + level);
		System.out.println("str " + strength);
		System.out.println("dex " + dexterity);
		System.out.println("int " + intellect);
		System.out.println("crt " + crit);
		System.out.println("def " + defence);
		System.out.println("par " + parry);
		System.out.println("att " + attack);
		System.out.println("bHP " + BaseHP);
	}
}
