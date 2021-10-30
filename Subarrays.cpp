/*C++ program to find total number of
even-odd subarrays present in given array*/
#include <bits/stdc++.h>
using namespace std;

// function that returns the count of subarrays that
// contain equal number of odd as well as even numbers
int countSubarrays(int arr[], int n)
{
	// initialize difference and answer with 0
	int difference = 0;
	int ans = 0;

	// create two auxiliary hash arrays to count frequency
	// of difference, one array for non-negative difference
	// and other array for negative difference. Size of these
	// two auxiliary arrays is 'n+1' because difference can
	// reach maximum value 'n' as well as minimum value '-n'
	int hash_positive[n + 1], hash_negative[n + 1];

	// initialize these auxiliary arrays with 0
	fill_n(hash_positive, n + 1, 0);
	fill_n(hash_negative, n + 1, 0);

	// since the difference is initially 0, we have to
	// initialize hash_positive[0] with 1
	hash_positive[0] = 1;

	// for loop to iterate through whole
	// array (zero-based indexing is used)
	for (int i = 0; i < n ; i++)
	{
		// incrementing or decrementing difference based on
		// arr[i] being even or odd, check if arr[i] is odd
		if (arr[i] & 1 == 1)
			difference++;
		else
			difference--;

		// adding hash value of 'difference' to our answer
		// as all the previous occurrences of the same
		// difference value will make even-odd subarray
		// ending at index 'i'. After that, we will increment
		// hash array for that 'difference' value for
		// its occurrence at index 'i'. if difference is
		// negative then use hash_negative
		if (difference < 0)
		{
			ans += hash_negative[-difference];
			hash_negative[-difference]++;
		}
		
		// else use hash_positive
		else
		{
			ans += hash_positive[difference];
			hash_positive[difference]++;
		}
	}

	// return total number of even-odd subarrays
	return ans;
}

// Driver code
int main()
{
	int arr[] = {3, 4, 6, 8, 1, 10, 5, 7};
	int n = sizeof(arr) / sizeof(arr[0]);
	
	// Printing total number of even-odd subarrays
	cout << "Total Number of Even-Odd subarrays"
		" are " << countSubarrays(arr,n);

	return 0;
}
