/*----------------------------------------------------------------------------------------------------------------------	 
    Sınıf Çalışması: İki zar atıldığında çift (ikisinin de aynı) gelme olasılığını yaklaşık olarak hesaplayan basit bir
    simülasyon programını yazınız
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{		
		CoinTailSimulationApp.run();				
	}
}

class CoinTailSimulationApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Parayı kaç kez atmak istersiniz?");
			int n = Integer.parseInt(kb.nextLine());
			
			if (n <= 0)
				break;
			
			CoinTailSimulation cts = new CoinTailSimulation();
			
			cts.run(n);
			
			System.out.printf("Yazı gelme olasılığı:%f%n", cts.probability);
		}	
		
	}
}

class CoinTailSimulation {
	public double probability;
	
	public void run(int n)
	{
		java.util.Random r = new java.util.Random();
		
		int count = 0;
		
		for (int i = 0; i < n; ++i)
			if (r.nextBoolean())
				++count;
		
		probability = (double)count / n;
	}	
}