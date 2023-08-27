/*-------------------------------------------------------------
	FILE		: MatrixUtil.java
	AUTHOR		: Java-Mar-2023 Group
	Last UPDATE	: 27th Aug 2023

	Utility class for matrix operations

	Copyleft (c) 1993 C and System Programmers Association
	All Right Free
-------------------------------------------------------------*/
package org.csystem.util.matrix;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;

public class MatrixUtil {
    public static int [][] generateRandomMatrix(Random random, int row, int col, int min, int bound)
    {
        int [][] matrix = new int[row][col];

        ArrayUtil.fillRandomArray(random, matrix, min, bound);

        return matrix;
    }
}
