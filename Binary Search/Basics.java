

public class Basics {
    public static void main(String[] args) {
        int[]arr={2,3,4,5,6,7,8,9,10};
        int target=5;
        int result=binarySearch(arr,target);
        System.out.println("Target found at index: " + result); // Output: Target found
    }

    static int binarySearch(int[]arr,int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target<arr[mid]){ // left hand side ..
                end=mid-1;

            }
            else if(target>arr[mid]){ // right hand side ..
                start=mid+1;
            }
            else{
                return mid; // found the target
            }
        }

        return -1; // target not found
    }

}
