class ConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) 
    {
        int maxcount=0;
        int currentcount=0;
        for(int num:nums)
        {
            if(num==1)
            {
                currentcount++;
            }
            else
            {
                maxcount=Math.max(maxcount,currentcount);
                currentcount=0;
            }
        }
        maxcount=Math.max(currentcount,maxcount);

        return maxcount;        
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example test cases
        int[] nums1 = {1, 1, 0, 1, 1, 1};
        int[] nums2 = {1, 0, 1, 1, 0, 1};
        int[] nums3 = {0, 0, 0, 1, 1, 1, 1, 0, 1, 1};

        // Printing results
        System.out.println("Max consecutive ones in nums1: " + findMaxConsecutiveOnes(nums1)); // Output: 3
        System.out.println("Max consecutive ones in nums2: " + findMaxConsecutiveOnes(nums2)); // Output: 2
        System.out.println("Max consecutive ones in nums3: " + findMaxConsecutiveOnes(nums3)); // Output: 4
    }
}