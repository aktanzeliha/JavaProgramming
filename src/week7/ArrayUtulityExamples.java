package week7;

import java.util.Arrays;

public class ArrayUtulityExamples {
    public static void main(String[] args) {

   int[] nums= {5,4,10,100,50,35};
   int[]nums2= nums;
   /*
   the real object that holds space in memory is {5,4,10,100,50,35};
    */
        System.out.println("nums2.equalas(nums)= " + Arrays.equals(nums, nums2));
        System.out.println(nums2==nums);//true

        int[] num3= {5,4,10,100,50,35};

        System.out.println("nums3.equalas(nums)="+ Arrays.equals(nums, num3 ));

        System.out.println(num3==nums);// false

// we rae sorting nums2
        Arrays.sort(nums2);
        System.out.println(Arrays.toString(nums));

        nums[0]=1000;
        System.out.println("nums2[0]="+ nums2[0]);

   // i want to create a copy of num3, however iwant it to be different

   int[] num4= Arrays.copyOf(num3,num3.length);

        System.out.println(Arrays.toString(num4));
        Arrays.sort(num3);

        System.out.println("-- after sorting num3----");
        System.out.println("Arrays.toString(num4=");
 //  burasi yarim kaldi, oscarin canli yayinindan , vardir notlarda oradan alabilirsin devamini





    }




}
