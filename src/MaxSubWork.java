
public class MaxSubWork {

	public int solve(int [] subArray){
		int max = subArray[0];//Start max off with the sum of the first digit in the array
		int[] sum = new int[subArray.length];//Create new array with same length as initial array
		sum[0] = subArray[0];//Give it the same first value, This array holds our sums and the initial (first sum) is simply the first value
		
		for (int i = 1; i < subArray.length; i++){
			sum[i] = Math.max(subArray[i], sum[i - 1] + subArray[i]);//Compares previous sum value in sum array to the sum of the last sum value and the next value in the initial array
			max = Math.max(max, sum[i]);//Figures out which number is the bigger number, our previous sum or the new sum we just derived
		}
		
		return max;//Returns max value takes from the array of sums
		
	}
}
