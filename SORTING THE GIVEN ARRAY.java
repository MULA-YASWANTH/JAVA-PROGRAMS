/*Write a Java program to sort the given array.
Sample I/O:
6
12 2 3 5 78 21
2 3 5 12 21 78*/

import java.util.*;
class Main
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[] arr = new int[10];
        int i;
        for(i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int temp;
        for(i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}