

public class Basics {
    public static void main(String[] args) {
        int[]nums={12,23,45,56,67,89,90};
        int target=56;
        int ans=liniarSearch(nums, target);
        System.out.println(ans);
    }

// search in the array ..return the index item found and dont find print -1..
static int liniarSearch(int[]arr,int target){
    if(arr.length==0){
        return -1;
    }

    for(int index=0;index<arr.length;index++){
        // cheak for the element at every index if it is = target
        int element=arr[index];
        if(element==target){
            return index;
        }
    }
    // cant find the target ..
    return -1;

}
}
