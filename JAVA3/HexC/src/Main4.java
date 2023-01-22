import java.util.Arrays;

class Main4 {
	public static void main(String[] args) {
		int[] array = new int[]{0,1,2,2,3,0,4,2};
		int val = 2;
		Main4 m = new Main4();
		m.removeElement(array,val);
	}
    public void removeElement(int[] nums, int val) {
        int k = 0;
        System.out.println(Arrays.toString(nums));
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k] = nums[i];
                k++;
            }
        }
       System.out.println(Arrays.toString(nums));
    }

}