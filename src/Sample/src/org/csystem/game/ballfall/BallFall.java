package org.csystem.game.ballfall;

public class BallFall {
	public static void fillSpace(int begin, int end)
	{
		for (int i = begin; i < end; ++i)
			System.out.print(' ');
	}
	
	public static void fillBall(int ballIndex, int end)
	{
		fillSpace(0, ballIndex);
		System.out.print('*');
		fillSpace(ballIndex + 1, end);
	}
	
	public static boolean updateRightFlag(boolean right, int ballIndex, int width)
	{
		if (ballIndex == 0)
			right = true;
		else if (ballIndex == width - 1)
			right = false;
			
		return right;
	}
	
	public static int updateBallIndex(int ballIndex, boolean right)
	{
		if (right)
			return ballIndex + 1;
		
		return ballIndex - 1;
	}
	
	public static void play(int width, int height)
	{
		boolean right = false;
		int ballIndex = 0;
		
		for (int i = 1; i <= height; ++i) {
			System.out.print('|');
			fillBall(ballIndex, width);
			if (width != 1) {
				right = updateRightFlag(right, ballIndex, width);
				ballIndex = updateBallIndex(ballIndex, right);
			}
			System.out.println('|');
		}
	}
}
