class LinearSearch{
  
    public static void main(String[] args){
        int[] arr = { 100, 4, 2, 6, 7, 1, 5, 2 ,3, 5, 6, 8, 3 };
        System.out.println(Arrays.toString(linearSearch(arr, 8)));
    }
  
    //Time Complexity is O(n)
    //Works best when a list is unordered
    public static int linearSearch(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            if(target == nums[i]){
                return i;
            }
        }
        return -1;
    }
  
}
