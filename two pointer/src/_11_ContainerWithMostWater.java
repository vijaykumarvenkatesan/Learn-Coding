public class _11_ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,2,5,1,8,4};
        int left =0;
        int right =height.length-1;
        int max =0;
        while(left < right){
            max = Math.max(max,(right-left)*Math.min(height[left],height[right]));
            if(height[left] < height[right]) left++;
            else right--;
        }
//        return max;
    }
}
