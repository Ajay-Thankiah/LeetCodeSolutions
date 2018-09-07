class PivotIndex {
    //[1,2,13,2,-5,4,13,1,3,5,2,9,12,0]
    //if(arr.length < 3) return -1
    //lefstSum = arr[0]
    //pivotVal = arr[1]
    //rightSum=for(2 to len)
    //if(rightSum = leftSum) return 1//1
    //nextPivot = arr[2]
    
    //int i=1;
    //while(i<len-2)//12
    //leftSum = leftSum + pivotVal;
    //pivotVal=nextPivot;
    //rightSum = rightSum - pivotVal;
    //if(rightSum = leftSum) return i//1
    //i++;
    //end while
    //return -1
    public int pivotIndex(int[] nums) {
        //[1,2,13,2,-5,4,13,1,3,5,2,9,12,0]
        //[0,12,9,2,5,3,1,13,4,-5,2,13,2,1]
        int len = nums.length;//14
        if(len < 1) return -1;
        int leftSum = 0;//nums[0];//0
        int pivotVal = nums[0];//nums[1];//12
        int rightSum=0;
        //for(int j=2;j<len;j++){
        for(int j=1;j<len;j++){
            rightSum += nums[j];//from arr[2] to arr[len-1]
        } 
        if(rightSum == leftSum) return 0;//return 1;//1
        int nextPivot = 0;//nums[2];//9

        //int i=2;
        int i=1;
        //while(i<=len-2){
        while(i<=len-1){    
            nextPivot=nums[i];
            leftSum = leftSum + pivotVal;
            pivotVal=nextPivot;
            rightSum = rightSum - pivotVal;
            if(rightSum == leftSum) return i;//1
            i++;
        }//end while
        return -1;
    }
	public int pivotIndexLeetCodeSolution(int[] nums) {
        int sum = 0, leftsum = 0;
        for (int x: nums) sum += x;
        for (int i = 0; i < nums.length; ++i) {
            if (leftsum == sum - leftsum - nums[i]) return i;
            leftsum += nums[i];
        }
        return -1;
    }
}