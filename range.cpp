// C++ program to find total count of an element
// in a range
#include<bits/stdc++.h>
using namespace std;

// Returns count of element in arr[left-1..right-1]
int findFrequency(int arr[], int n, int left,
						int right, int element)
{
	int count = 0;
	for (int i=left-1; i<=right; ++i)
		if (arr[i] == element)
			++count;
	return count;
}

// Driver Code
int main()
{
	int arr[] = {2, 8, 6, 9, 8, 6, 8, 2, 11};
	int n = sizeof(arr) / sizeof(arr[0]);

	// Print frequency of 2 from position 1 to 6
	cout << "Frequency of 2 from 1 to 6 = "
		<< findFrequency(arr, n, 1, 6, 2) << endl;

	// Print frequency of 8 from position 4 to 9
	cout << "Frequency of 8 from 4 to 9 = "
		<< findFrequency(arr, n, 4, 9, 8);

	return 0;
}
