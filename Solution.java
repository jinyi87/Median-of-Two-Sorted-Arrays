
public class Solution
{
	public double findMedianSortedArrays(int[] nums1, int[] nums2)
	{
		int m = nums1.length, n = nums2.length;
		if ((m + n) % 2 == 1)
		{
			int result = 0;
			for (int i = 0, j = 0, k = 0; k < (m + n) / 2 + 1; k++)
			{
				if (i < m && j < n)
				{
					result = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
				} else if (i < m && j == n)
				{
					result = nums1[i++];
				} else
				{
					result = nums2[i++];
				}
			}
			return result;
		} else
		{
			double[] result = new double[2];
			for (int i = 0, j = 0, k = 0; k < (m + n) / 2 + 1; k++)
			{
				if (i < m && j < n)
				{
					result[k % 2] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
				} else if (i < m && j == n)
				{
					result[k % 2] = nums1[i++];
				} else
				{
					result[k % 2] = nums2[i++];
				}
			}
			return (result[0] + result[1]) / 2;
		}
	}
}