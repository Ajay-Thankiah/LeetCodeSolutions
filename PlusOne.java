class PlusOne {
    //int[] res = new int[digits.length+1];
    //from last index
    //add 1
    //if(val > 9) val = 0;
    //else break
    //if(i < 0 && res[0] == 0) res[0] = 1
    //else return Arrays.copyOfRange(res, 1,digits.length+1);
    //return res
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int[] res = new int[len+1];
        int i=0;
        boolean incrementFlag = true;
        for(i=len-1;i>=0;i--){
            if(incrementFlag) {
                res[i+1] = digits[i]+1;
                if(res[i+1] > 9) res[i+1] = 0;
                else incrementFlag = false;
            }
            else res[i+1] = digits[i];
        }
        if(res[1] == 0) res[0] = 1;
        else return Arrays.copyOfRange(res, 1,digits.length+1);
        return res;
    }
}