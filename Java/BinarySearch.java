class BinarySearch{
  
    public static void main(String[] args){
        int[] arr = { 1, 3, 5, 7, 9, 12, 14, 65, 343 };
        System.out.println(binarySearch(arr, 65));
    }
  
    public static int binarySearch(int[] nums, int target) {
      
        int start = 0;
        int end = nums.length - 1;
      
        while(end >= start){
          
            int  middleIndex = (start + end) / 2;
            int middleValue = nums[middle];
          
            if (target == middleValue){
                return middleIndex;
              
            } else if (target > middleValue){
               start = middleIndex + 1;
              
            } else {
                end = middleIndex - 1;
            }
        }
      
        return -1;
    }
}

  
}
