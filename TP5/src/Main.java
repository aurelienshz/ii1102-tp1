
public class Main {
	
	public static void main(String[] args) {
		File file = new File();
		
		file.add(1);
		file.add(3);
		file.add(5);
		
		file.display();
		
		
		System.out.println("Take : " + file.take());
		file.display();
				
		file.add(6);
		file.add(9);
		
		file.display();
		
		System.out.println("Take : " + file.take());
		System.out.println("Take : " + file.take());
		file.display();
		System.out.println("Take : " + file.take());
		file.display();
	}

}
