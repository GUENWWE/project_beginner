#include<iostream>
using namespace std;
 void insertionSort(int arr[],int n)
 {
        int key,j;
        for (int i = 1; i < n; i++)
        {
            key = arr[i];
            j = i-1;
            while (j>=0&&arr[j]>key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1]=key;
            

        }
 }       
void sapxep(int arr[], int n)
    {    
        for (int i = 0; i < n; i++)
        {
            cout << arr[i] <<" ";
        }
    }    
        
int main(){
    int n;
    int arr[] = {12,11,13,5,6};
    n = 5;
    insertionSort(arr,n);
    sapxep(arr,n);


}