
class Pet{
		String name;
		String petType;
		
		//constructor
		Pet(String name, String petType){
			
			this.name = name;
			this.petType = petType;
		}
		
		//method without return & without parameter
		void show(){
			System.out.println("Name : "+this.name);
			System.out.println("Pet type : "+this.petType);
		}
		
		
		//method without return with paramenter
		//to change name
		void setName(String name) {
			this.name = name;
		}
		
		//method with return without parameneter
		String getName() {
			return this.name;
		}
		String getpetType() {
			return this.petType;
		}		
		
		//method dengan return dan parameter
		String sayHi(String message) {
			return message + ",Welcome to petrinar and your cute pet is " +this.name;
		}
		
		
	
	public static void main(String[] args) {
		Pet pet1 = new Pet("Oyen", "Cat");
		//method 
		pet1.show();
		pet1.setName("Uteh");
		pet1.show();
		
		System.out.println(pet1.getName());
		System.out.println(pet1.getpetType());
		
		String data = pet1.sayHi("Hello");
		System.out.println(data);
		
	}


}
