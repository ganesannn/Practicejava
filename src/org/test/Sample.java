package org.test;

public class Sample {
	public static void main(String[] args) {
		int a[][]=new int[2][3];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				if(i==j) {
					a[i][j]=1;
		}
				else {
					a[i][j]=0;
				}
			
		}
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(a[i][j]);
				
			}
			System.out.println("");
			
		}
	}

}
