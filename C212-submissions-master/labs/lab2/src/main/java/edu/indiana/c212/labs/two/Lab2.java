package edu.indiana.c212.labs.two;

public class Lab2 {
	public static int recursiveAdd(int x, int y){
		if (y == 0){
			return x;
		} else if (x == 0){
			return y;
		} else {
			return recursiveAdd (x + 1,y - 1);}
	    }
	public static int iterativeAdd(int x, int y){
	
		while (y > 0){
			x = x + 1;
			y = y - 1;
		}
		return x;
	}
	public static int iterativeMult(int x, int y){
		int sum = 0;
		while (y != 0){
			sum = sum + x;
			y = y - 1;
		}
		return sum;
	}
	public static int iterativeExp(int x, int exp){	
		int answer = 1;
		while (exp > 0){
			answer = iterativeMult(answer,x);
			exp = exp - 1;
		}
		return answer;
	}

    public  static void printExpected(Object expected, Object actual){
        System.out.printf("Expected value is : %s, received value was: %s. \n", expected, actual);
    }

	public static void main(String[] args){
		printExpected(4, recursiveAdd(0, 4));//Expected result 4
		printExpected(7, recursiveAdd(3, 4));//Expected result 7
		printExpected(7, iterativeAdd(3, 4));//Expected result 7
		printExpected(12, iterativeMult(3, 4));//Expected result 12
		printExpected(81, iterativeExp(3, 4));//Expected result 81

	}
}