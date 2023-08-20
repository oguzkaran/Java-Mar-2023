package org.csystem.game.ballfall;

public class BallFall {
	public String pattern;

	public static void fillSpace(int begin, int end, StringBuilder sb)
	{
		for (int i = begin; i < end; ++i)
			sb.append(' ');
	}
	
	public static void fillBall(int ballIndex, int end, StringBuilder sb)
	{
		fillSpace(0, ballIndex, sb);
		sb.append('*');
		fillSpace(ballIndex + 1, end, sb);
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
	
	public void play(int width, int height)
	{
		boolean right = false;
		int ballIndex = 0;

		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= height; ++i) {
			sb.append('|');
			fillBall(ballIndex, width, sb);
			if (width != 1) {
				right = updateRightFlag(right, ballIndex, width);
				ballIndex = updateBallIndex(ballIndex, right);
			}
			sb.append("|\r\n");
		}

		pattern = sb.toString();
	}
}
