package mypack;

interface Tamilnadu
{
	void findtamil();
}

interface Andhra extends Tamilnadu
{
	void findtelugu();
	
}
class State implements Andhra
{
	public void findtamil()
	{
		System.out.println("Tamil");
	}
	public void findtelugu()
	{
		System.out.println("Telugu");
	}
}

public class Interproj {

	public static void main(String[] args) {
		Andhra fLang = new State();
		fLang.findtamil();
		fLang.findtelugu();
	}

}