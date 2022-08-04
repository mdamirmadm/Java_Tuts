public class TypeCastingExample
{
	public static void main(String args[])
	{
		int a = 10;
		int b = 3;
		float c = (float)a/b;
		byte by = 127;
		by=by++;
		by=by++;
		System.out.println("Byte value: "+ by);
		System.out.println("Answer is "+ c);
	}
}
