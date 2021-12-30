package com.yedam.java.ch0502;

public class referenceTypeExample2 {

	public static void main(String[] args) {
		for(int i = 0; i < args.length; i++)
		{
			System.out.println(args[i]);
		}
		//다차원 배열 - > 배열의 배열
		int[][] mathScores = new int[4][3];
		for(int i= 0; i< mathScores.length;i++)
		{
			for(int j=0; j< mathScores[i].length;j++)
			{
				System.out.println("mathScores[" + i +"] ["+j+"]: " + mathScores[i][j]);
			}
		}
		
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2]; //-> int[] englishScores[0]
		englishScores[1] = new int[3];
		for(int i=0; i<englishScores.length;i++) {
			for(int k=0; k< englishScores[i].length;k++) {
				System.out.println("englidfshScores[" + i +"]["+k+"] : " + englishScores[i][k]);
			}
		}
		int[][] javaScores= { {95,80}, {92,96,80} };
		for(int i=0; i<javaScores.length;i++) {
			for(int k=0;k <englishScores[i].length;k++) {
				System.out.println("javascores{"+i + "][" + k+"] : " + javaScores[i][k]);
				
			}
		}
	}

}
