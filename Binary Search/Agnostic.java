public class Agnostic {
    public static void main(String[] args) {
        
        int[]arr={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target=22;
        int result=orderagnosticBS(arr,target);
        System.out.println("Target found at index: " + result); // Output: Target found at index: 10
    }
    static int orderagnosticBS(int[]arr,int target){
        int start=0;
        int end=arr.length-1;

        // find whether the array is sorted in ascending or descending order
        boolean isAsc ;
        if(arr[start] < arr[end]) {
            isAsc = true; // ascending order
        } else {
            isAsc = false; // descending order
        }


        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==target) {
                return mid; // found the target
            }

             if(isAsc){
                if(target<arr[mid]){ // left hand side ..
                end=mid-1;

            }
            else if(target>arr[mid]){ // right hand side ..
                start=mid+1;
            }
            } else {
                if(target>arr[mid]){ // left hand side ..
                    end=mid-1;
                }
                else{ // right hand side ..
                    start=mid+1;
                }
            }
            
        }

        return -1; // target not found
    }

}

