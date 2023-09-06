class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
     int i = 0, j = 0;
        int n1=nums1.length;
        int n2=nums2.length;
        double arr[]=new double[n1+n2];
        // Initial index of merged subarray array
        int k = 0;
        
        while (i < n1 && j < n2&&k<(n1+n2)/2+2) {
            if (nums1[i] <= nums2[j]) {
                arr[k] = nums1[i];
                i++;
            }
            else {
                arr[k] = nums2[j];
                j++;
            }
            k++;
        }
        /* Copy remaining elements of L[] if any */
        while (i < n1&&k<(n1+n2)/2+2) {
            arr[k] = nums1[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2&&k<(n1+n2)/2+2) {
            arr[k] = nums2[j];
            j++;
            k++;
        }
        if((n1+n2)%2==1)
        {
            return arr[(n1+n2)/2];
        }
        else
        {
            return (arr[(n1+n2)/2]+arr[(n1+n2)/2-1])/2;
        }
}   
    }
