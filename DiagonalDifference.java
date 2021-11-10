package missionHackerRank;

public class DiagonalDifference {

	public static void main(String[] args) {
		
		int arr[][] = 	{
								{3, 4, 6},
								{2, 4, 7},
								{3, 8, 4}
						};
		
		/*
		 * Calculate the Difference of Diagonal Sum;
		 */

		int left_diagonal = 0, right_diagonal = 0;
		
		for(int i = 0, j = arr[0].length - 1; i < arr[0].length; i++, j--)
		{
			left_diagonal += arr[i][i];
			right_diagonal += arr[i][j];
		}
		
		System.out.println(Math.abs(left_diagonal - right_diagonal));
	}

}