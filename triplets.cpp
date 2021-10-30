#include <bits/stdc++.h>
using namespace std;
  
// Function to print all triplets in
// given sorted array that forms AP
void printAllAPTriplets(int arr[], int n)
{
    unordered_set<int> s;
    for (int i = 0; i < n - 1; i++)
    {
    for (int j = i + 1; j < n; j++)
    {
        // Use hash to find if there is
        // a previous element with difference
        // equal to arr[j] - arr[i]
        int diff = arr[j] - arr[i];
        if (s.find(arr[i] - diff) != s.end())
            cout << arr[i] - diff << " " << arr[i]
                 << " " << arr[j] << endl;
    }
    s.insert(arr[i]);
    }
}
  
// Driver code
int main()
{
    int arr[] = { 2, 6, 9, 12, 17,
                 22, 31, 32, 35, 42 };
    int n = sizeof(arr) / sizeof(arr[0]);
    printAllAPTriplets(arr, n);
    return 0;
}
