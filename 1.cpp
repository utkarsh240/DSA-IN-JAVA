// print 2nd largest and 2nd smallest element in an array

#include <iostream>
using namespace std;

int main() {
  int n;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++) cin>>arr[i];
  int max=arr[0],min=arr[0];
  for(int i=0;i<n;i++){
      if(arr[i]>max) max=arr[i];
      if(arr[i]<min) min=arr[i];
  }
  int max2=min,min2=max;
  for(int i=0;i<n;i++){
      if(arr[i]>max2 && arr[i]<max) max2=arr[i];
      if(arr[i]<min2 && arr[i]>min) min2=arr[i];
  }
  cout<<max2<<" "<<min2;
  return 0;
}

