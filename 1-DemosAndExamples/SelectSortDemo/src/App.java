public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {5, 15, 3, 8, 9, 1 , 20, 7};

        for (int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + ", ");
        }

        System.out.println("\nThe sorted version is: ");
        nums = selsort(nums);
        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }


    public static int[] selsort(int[] nums){
        int n = nums.length;
        for (int i = 0; i < n; i++){
        int minIdx = i;

            for (int j = 0; j < n; j++){
                System.out.println("J = " + nums[j]+ "; min = " + nums[j+1]);
                if(nums[j] < nums[minIdx]){
                    System.out.println("New Min");
                    //int temp = nums[j];
                    //nums[j] = nums[j+1];
                    //nums[j+1] = temp;
                    minIdx = j;
                }
            }

            int temp = nums[minIdx];
            nums[minIdx] = nums[i];
            nums[i] = temp;
            System.out.println("SWAP, end of cycle ");

        }
    
        return nums;
    }
}
