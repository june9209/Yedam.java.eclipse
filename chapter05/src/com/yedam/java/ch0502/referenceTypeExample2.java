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
		
		//for문으로 배열 복사
		int[] oldIntArray = {1,2,3};
		int[] newIntArray = new int[5];
		//복사를 할떈 작은값부터
		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		for(int value : newIntArray) {
			System.out.println(value);
		}
		
		//System.arraycopy()로 배열 복사
		String[] oldStrArray = {"java" , "array" ,"copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(String str : newStrArray) {
			System.out.println(str);
			
		}
		
	}

}
