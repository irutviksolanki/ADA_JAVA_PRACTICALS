class MakeChange 
{ 
	public static void main(String[] args) 
	{     
		int[] coins = {1, 5, 10}; 
		int sum = 26; 
		MakeChange m = new 	MakeChange(); 
		System.out.println("At least " + m.coinChangeProblem(coins, sum)+ " Coins Are Required To Make a Value of " + sum); 
	} 
	int coinChangeProblem(int[] coins, int sum) 
	{     
		int totalCoins = coins.length; 
		double[][] arr = new double[totalCoins + 1][sum + 1]; 
		for(int j = 0; j <= sum; j++) 
		{
			arr[0][j] = Double.POSITIVE_INFINITY; 
		}       
		for(int i = 1; i <= totalCoins; i++) 
		{ 
			arr[i][0] = 0; 
		} 
		for(int i = 1; i <= totalCoins; i++) 
		{ 
			for(int j = 1; j <= sum; j++) 
			{ 
				if(coins[i - 1] <= j)
				{					
					arr[i][j] = min(1 + arr[i][j - coins[i - 1]], arr[i - 1][j]);
				}
				else
				{
				arr[i][j] = arr[i - 1][j]; 
				}	
			} 
		}
		return (int)arr[totalCoins][sum]; 
	}
	double min(double a, double b)
	{ 
		if(a <= b){ 
			return a; 
		} 
		else{ 
		return b; 
		} 
	} 

}
