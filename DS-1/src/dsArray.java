import java.util.HashSet;
import java.util.Set;

public class dsArray {
    //init - use to create a array with size
    //set - assign a value to a memory position ,arr[2]=10; time complexity= o(1)T, Space = o(1)S
    //get - getting a element ,arr[5] ,O(1)T, O(1)S
    //travers - lopping throw am array, tavel through a array, for loop, o(1)S, o(n)T
    //insert - new mem adding to arr, o(1)s, o(n)T
    //delete - remove sn element o(1)S T

    //problem
    //arr=|6|5|4|3|9|8|0|
    //find the 2 numbers that add=10

    //functn
    public  static  int[] twoNumberSum(int[] arr, int target){
        for (int i=0;i<arr.length;i++){
            for(int j=i+1; j<arr.length-1; j++){
                if(arr[i]+arr[j]==target){
                    return new int[] {arr[i], arr[j]};
                }

            }
        }
        return new int[0];
    }

    public static int[] twoNumSumMethodTwo(int[] arr, int target){
        Set<Integer> nums =new HashSet<>();
        for(int i=0;i< arr.length;i++){
            int num= arr[i];
            int match = target - num;

            if(nums.contains(match)){
                return new int[]{num,  match};
            }else {
                nums.add(num);
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {

        int[] arr={6,5,4,3,9,8,0};
        int target=10;
        int[] result = twoNumberSum(arr,target);
        for (int i=0;i< result.length;i++){
            System.out.println(result[i]);
        }

        int[] res= twoNumSumMethodTwo(arr,target);
        for (int j=0;j<res.length;j++){
            System.out.println(res[j]);
        }


    }
}
