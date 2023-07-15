/*----------------------------------------------------------------------------------------------------------------------	 
    Sınıf Çalışması: Bir torbada bulunan [1, 99] arasındaki toplardan, çekilen top geri atılmamak üzere, çekilen iki topun da 
    çift olma olasılığını simüle eden programı yazınız  
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
		java.util.Random r = new java.util.Random();
		
		System.out.print("Input width, height, count and a value");
		int width = kb.nextInt();
		int height = kb.nextInt();
		int count = kb.nextInt();
		long value = kb.nextLong();	
		
		r.setSeed(value);
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
		IntPoint point = new IntPoint();
		
		point.x = random.nextInt(min, bound);		
		point.y = random.nextInt(min, bound);		
		
		return point;
	}
	
	public static IntPoint create(java.util.Random random, int minX, int boundX, int minY, int boundY)
	{
		IntPoint point = new IntPoint();
		
		point.x = random.nextInt(minX, boundX);		
		point.y = random.nextInt(minY, boundY);		
		
		return point;
	}
}


class EvenTwoBallsSimulation {
	public double probability;
	
	public static int getFirstBall(java.util.Random r)
	{
		return r.nextInt(1, 100);
	}
	
	public static int getSecondBall(java.util.Random r, int first)
	{
		int second;
		
		while ((second = r.nextInt(1, 100)) == first)
			;
		
		return second;
	}
	
	public void run(int n)
	{
		java.util.Random r = new java.util.Random();
		int count = 0;
		
		for (int i = 0, i < n; ++i) {
			int first = getFirstBall(r);
			int second = getSecondBall(r, first);
		} 
			
		
		
	}
}

