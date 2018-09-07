class LargestNumberAtleastTwice {
    //finding largest 2 numbers
    //Arrays.sort(nums) //-->nlog(n)
    //3,4,1,12,5,2,9
    //max = second = nums[0] = 3
    //after 1st swap --> nums[0] = 4, nums[i] = 3
    //after 2nd if --> second = nums[i] = 3
    //max = nums[0]
    //secondLargest = nums[0]
    //for i=1 to len
    //if(nums[i] > max) swap nums[i] and nums[0]
    //if(nums[i] > secondLargest) secondLargest = nums[i]
    public int dominantIndex(int[] nums) {
        //int max = nums[0];
        int secondMax = 0;
        int len = nums.length;
        int temp = 0;
        int pos = 0;
        for(int i=1;i<len;i++){
            if(nums[i] > nums[0]){
                pos=i;
                temp = nums[i];
                nums[i] = nums[0];
                nums[0] = temp;
            }
            if(nums[i] > secondMax) secondMax = nums[i];
            System.out.println(i+" "+pos+" "+nums[0]+" "+secondMax);
        }
        if( nums[0] >= secondMax*2) return pos;
        return -1;
    }
	
	public int dominantIndexLettCodeSolution(int[] nums) {
        int maxIndex = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] > nums[maxIndex])
                maxIndex = i;
        }
        for (int i = 0; i < nums.length; ++i) {
            if (maxIndex != i && nums[maxIndex] < 2 * nums[i])
                return -1;
        }
        return maxIndex;
    }
}