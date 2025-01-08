public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {5, 15, 3, 8, 9, 1 , 20, 7};

        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }

        System.out.println("\nThe sorted version is: ");
        nums = sort(nums);
        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }


    public static int[] sort(int[] nums){
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length - i - 1; j++){
                System.out.println("J = " + nums[j]+ "; J+1= " + nums[j+1]);
                if(nums[j] > nums[j+1]){
                    System.out.println("SWAP");
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
                else{

                }
            }
        }
    
        return nums;
    }
}
