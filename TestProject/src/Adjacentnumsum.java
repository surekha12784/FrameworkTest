
public class Adjacentnumsum {
	
	 public int rob(int[] nums) {
		 
		 int[] arr=new int[nums.length];
		 for(int i=0;i<nums.length;i++){
			 if(i==0) arr[0]=nums[0];
			 else if(i==1)  arr[1]=Math.max(nums[0],nums[1]);
			 else 
				arr[i]= Math.max(arr[i-2]+nums[i],arr[i-1]);
 		 }
		return arr[nums.length-1];
	      
	    }
        
    
 public static void main(String[] args){
	 Adjacentnumsum a=new Adjacentnumsum();
	 int[] num=new int[]{2,7,9,3,1};
	 int highest=a.rob(num);
	 System.out.println("highest:"+highest);
 }

}
