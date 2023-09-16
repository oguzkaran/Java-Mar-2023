/*----------------------------------------------------------------------------------------------------------------------
	
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;

class App {
	public static void main(String [] args)
	{
		RandomArrayGenerator generator = new RandomArrayGenerator(new Random(), 10, 10, 21);

		for (int i = 0; i < generator.length(); ++i)
			System.out.printf("%d ", generator.get(i));

		System.out.println();
	}
}

class RandomArrayGenerator {
	private final int [] m_data;

	public RandomArrayGenerator(Random random, int count, int min, int bound)
	{
		m_data = ArrayUtil.generateRandomArray(random, count, min, bound);
	}

	public int length()
	{
		return m_data.length;
	}

	public int get(int index)
	{
		return m_data[index];
	}
}