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
		System.out.println("Language of Tamilnadu is Tamil");
	}
	public void findtelugu()
	{
		System.out.println("Language of Andhra is Telugu");
	}
}

public class Interproj {

	public static void main(String[] args) {
		Andhra fLang = new State();
		fLang.findtamil();
		fLang.findtelugu();
	}

}