
public class Test2
{
	public static void main(String[] args)
	{
		Mobile mobile = new Mobile();
		V5Power v5Power = new V5PowerAdapter(new V220Power()) ; 
		mobile.inputPower(v5Power);
	}
}