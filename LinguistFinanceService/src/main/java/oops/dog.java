package oops;

public class dog implements Animal{
	
	public void dark()
	{
	System.out.println("bark");
	}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	
	Animal dog = new dog();
	dog.sound();
	dog.sound();
	dog.dark();


}

@Override
public void sound() {
	// TODO Auto-generated method stub
	System.out.println("bark");

}

@Override
public void ram() {
	// TODO Auto-generated method stub
	System.out.println("ram");

}
}

