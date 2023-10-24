package com.example.BinarySearch;

public class Ceiling {

    public static void main(String[] args) {

        int [] arr = {2,3,5,9,14,16,18};
        int target = 19;

        int ans  =  ceiling(arr,target);
        System.out.println(ans);
    }



    static int ceiling(int [] arr,int target){


        if(target>arr.length-1){
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        int mid = start + (end-start)/2;

        while(start<=end){
            if(arr[mid]==target){
                return mid;
            }else if(target<arr[mid]){
                end= mid-1;
            }else{
                start = mid +1;
            }
            mid = start + (end-start)/2;
        }

        return start;
    }

}
