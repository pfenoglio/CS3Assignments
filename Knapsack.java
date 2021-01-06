import java.util.Arrays;

public class Knapsack {
	public static int[]usedWeights = {0,0,0,0,0};
	public static int recur(int[]weights, int[]values, int index, int maxWeight, int val) {
		if(index ==0) {
			return 0;
		}
		if(weights[index]>maxWeight) {
			return recur(weights, values, index-1, maxWeight, val);
		}
		else {
			maxWeight -= weights[index];
			val+= values[index];
			usedWeights[index]=weights[index];
		}
		if(maxWeight == 0){
			return val;
		}
		return Math.max(recur(weights, values, index-1, maxWeight, val), val );
	}
	public static void main(String[] args) {
		int[]weights = {1, 3, 6, 4, 2};
		int[]values = {1, 4, 10, 2, 7};
		int index = weights.length-1;
		int maxWeight = 5;
		int val =0;
		System.out.println(recur(weights, values, index, maxWeight, val));
		System.out.println(Arrays.toString(usedWeights));
	}

}
//
