package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("How many numbers are there?");
	int n = in.nextInt();
	int[] highScores = new int[n];
	for (int i=0; i<highScores.length; i++)
	{
	highScores[i]= i+2;
	}
	for (int i=0; i<highScores.length; i++)
	{
		System.out.print(highScores[i]);
		}
	}
	}