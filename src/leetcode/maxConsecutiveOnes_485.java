package leetcode;

public class maxConsecutiveOnes_485 {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int cnt=0;
        int maxcnt=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                cnt++;
                maxcnt=Math.max(maxcnt,cnt);
            }
            else{
                cnt=0;
            }
        }
        return maxcnt;
    }

    public static void main(String[] args) {
        int [] nums = {1,0,1,1,1,0,1,0,0,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
