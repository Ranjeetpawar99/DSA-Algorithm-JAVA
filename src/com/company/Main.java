package com.company;
import java.util.Scanner;

public class Main {

    public static int [] reverseArray(int arr[],int start,int end)
    {
       int temp;
    while(start!=end)
    {
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        //handle(Decrement and Increment)
        start++;
        end--;
    }
    return arr;
    }

    public static void main(String[] args)
    {
        // write your code here
        int recievedArray[];
        Scanner s = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 5};
         recievedArray= reverseArray(arr,0, (arr.length)-1);

        //printing the elements
        for (int i=0;i<arr.length;i++){
            System.out.println(recievedArray[i]);
        }
    }
}