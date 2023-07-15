/*----------------------------------------------------------------------------------------------------------------------	 
    Random sınıfın logn parametreli ctor'u ile tohum değeri verilerek nesne yaratılabilir. Aşağıdaki örneği inceleyiniz 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{		
		RandomCoordinateGeneratorDemoApp.run();
	}
}

class RandomCoordinateGeneratorDemoApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		
		System.out.print("Input width, height, count and a value");
		int width = kb.nextInt();
		int height = kb.nextInt();
		int count = kb.nextInt();
		long value = kb.nextLong();	
		
		java.util.Random r = new java.util.Random(value);
		
		for (int i = 0; i < count; ++i) {
			IntPoint point = RandomIntPointGenerator.create(r, 0, width, 0, height);
			
			//...
			
			point.print();
		}
			
	}
}

class RandomIntPointGenerator {
	public static IntPoint create(java.util.Random random, int min, int bound)
	{
		return create(random, min, bound, min, bound);
	}
	
	public static IntPoint create(java.util.Random random, int minX, int boundX, int minY, int boundY)
	{
		return new IntPoint(random.nextInt(minX, boundX), random.nextInt(minY, boundY));		
	}
}


class IntPoint {
	public int x, y;
	
	public IntPoint()
	{		
	}
	
	public IntPoint(int a)
	{
		x = a;
	}
	
	public IntPoint(int a, int b)
	{
		x = a;
		y = b;
	}
	
	public double distance()
	{
		return distance(0, 0);
	}
	
	public double distance(IntPoint other)
	{
		return distance(other.x, other.y);
	}
	
	public double distance(int a, int b)
	{
		return Math.sqrt(Math.pow(x - a, 2) + Math.pow(y - b, 2));
	}
	
	public void offset(int dxy)
	{
		offset(dxy, dxy);
	}
	
	
	public void offset(int dx, int dy)
	{
		x += dx;
		y += dy;
	}
	
	public void print()
	{
		System.out.printf("(%d, %d)%n", x, y);
	}
}

