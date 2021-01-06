package connections;


import java.util.Arrays;

public class Knapsack1 {
	public static int[]usedWeights = {0,0,0,0,0};
	public static int recur(int[]weights, int[]values, int index, int maxWeight, int val) {
		if(index ==0) {
			return 0;
		}
		if(weights[index]>maxWeight) {
			return recur(weights, values, index-1, maxWeight, val);
		}
		/*else {
			maxWeight -= weights[index];
			val+= values[index];
			usedWeights[index]=weights[index];
		}
		if(maxWeight == 0){
			return val;
		}*/
		//System.out.println(Arrays.toString(usedWeights));
		return Math.max(recur(weights, values, index-1, maxWeight, val),
					recur(weights, values, index-1, maxWeight-weights[index], val)+values[index]);
	}
	public static void main(String[] args) {
		int[]weights = {6, 3, 1, 4, 2};
		int[]values = {10, 4, 1, 2, 7};
		int index = weights.length-1;
		int maxWeight = 5;
		int val =0;
		System.out.println(recur(weights, values, index, maxWeight, val));
		System.out.println(Arrays.toString(usedWeights));
	}

}

