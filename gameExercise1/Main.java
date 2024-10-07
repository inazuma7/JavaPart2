package gameExercise1;


	//player
	 class Player{
		 String name;
		 double health;
		 int level;
		 
		 //object member
		 Weapon weapon;
		 Armor armor;
		 
		 Player(String name, double health){
			 this.name = name;
			 this.health = health;
		 }
		 
		 void attack(Player opponent) {
			 double attackPower = this.weapon.attackPower;
			
			 System.out.println(this.name + " attacking "+ opponent.name + " with power " + attackPower); 
			 opponent.defence(attackPower);
		 }
		 
		 void defence(double attackPower) {	 
			 //will take the damage 
			 //if attackPower  > defencePower then 
			 
			 double damage;
			 if (this.armor.defencePower < attackPower) {
				 damage = attackPower - this.armor.defencePower;
			 }else {
				 damage = 0;
			 }
			 
			     this.health -= damage;
				 System.out.println(this.name + " gets damage " + damage);
			 
		 }
		 
		 void equipWeapon(Weapon weapon) {
			 this.weapon = weapon;
		 }
		 
		 void equipArmor(Armor armor) {
			 this.armor =armor;
		 }
		 
		 void display() {
			 System.out.println("\nName : " + this.name);
			 System.out.println("Health : " + this.health + " hp" );
			 this.weapon.display();
			 this.armor.display();
		 }
	 }
	 
	//weapon
	 class Weapon{
		 double attackPower;
		 String name;
		 
		 Weapon(String name, double attackPower){
			 this.name = name;
			 this.attackPower = attackPower;
		 }
		 
		 void display() {
			 System.out.println("Weapon : " + this.name + " , Attack : " + this.attackPower);
		 }
	 }
	
	//armor
	 class Armor{
		 double defencePower;
		 String name;
		 
		 Armor(String name, double defencePower){
			 this.name = name;
			 this.defencePower = defencePower;
		 }
       void display() { 
		 System.out.println("Armor : " + this.name + " , defence : " + this.defencePower);
	 }

	 }	 
	 

public class Main {

	public static void main(String[] args) {
		
		//object
		Player player1 = new Player("inazuma",100);
		Player player2 = new Player("aethoraalbi", 90);
		
		
		Weapon sword = new Weapon("sword",15);
		Weapon keris = new Weapon("keris",10);
		
		
		Armor iron = new Armor("Iron",10);
		Armor fire = new Armor("Fire", 8);
		
		//player 1
		player1.equipWeapon(sword);
		player1.equipArmor(iron);
		player1.display();
		
		
		//player 2
		player2.equipWeapon(keris);
		player2.equipArmor(fire);
		player2.display();
		
		System.out.println("\nWar is Startttt");
		System.out.println("\nPart - 1\n");
		player1.attack(player2);
		player1.display();
		player2.display();
		
		System.out.println("\nPart - 2\n");
		player2.attack(player1);
		player1.display();
		player2.display();
		
	}
}
