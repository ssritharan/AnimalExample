
public class AnimalMain {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		Animal a = new Animal();
		System.out.println(a.eat());
		System.out.println(a.sleep());
		
		// make a cat
		Cat c = new Cat();
		
		System.out.println(c.eat());
		System.out.println(c.sleep());
		System.out.println(c.purr());
		
		
		// make a bird
        Bird b = new Bird();
		
		System.out.println(b.eat());
		System.out.println(b.sleep());
		System.out.println(b.fly());
		

	}

}
