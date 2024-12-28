package arrays;
//wap to find the find the when to sell and buy stocks
public class dponstocks {
	public static int sell2buy(int [] arr) {
		int minimal = arr[0];
		int profit = 0;
		for(int i = 1;i<arr.length;i++) {
			int cost = arr[i] - minimal; 
			profit = Math.max(profit, cost);
			minimal = Math.min(minimal, arr[i]);
		}
		return profit;
	}
	
	public static void main(String[] args) {
		int [] arr = {7,1,2,5,6,3};
		System.out.println("the profit is "+sell2buy(arr));
	}
}
