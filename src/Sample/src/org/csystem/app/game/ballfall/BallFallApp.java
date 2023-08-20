package org.csystem.app.game.ballfall;

import org.csystem.game.ballfall.BallFall;

import java.util.Scanner;

public class BallFallApp {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		
		while (true) {
			System.out.print("Input width and height:");
			int width = kb.nextInt();
			int height = kb.nextInt();
			
			BallFall.play(width, height);
			
			if (width == 0 || height == 0)
				break;
		}	
	}

	public static void main(String[] args)
	{
		run();
	}
}
