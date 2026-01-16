package foundation.array;

/**
 * 删除有序数组中的重复项
 * <p>
 * 给你一个 非严格递增排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。然后返回 nums 中唯一元素的个数。
 * <p>
 * 考虑 nums 的唯一元素的数量为 k。去重后，返回唯一元素的数量 k。
 * <p>
 * nums 的前 k 个元素应包含 排序后 的唯一数字。下标 k - 1 之后的剩余元素可以忽略。
 * <p>
 * 判题标准:
 * <p>
 * 系统会用下面的代码来测试你的题解:
 * <p>
 * int[] nums = [...]; // 输入数组
 * int[] expectedNums = [...]; // 长度正确的期望答案
 * <p>
 * int k = removeDuplicates(nums); // 调用
 * <p>
 * assert k == expectedNums.length;
 * for (int i = 0; i < k; i++) {
 * assert nums[i] == expectedNums[i];
 * }
 * 如果所有断言都通过，那么您的题解将被 通过。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [1,1,2]
 * 输出：2, nums = [1,2,_]
 * 解释：函数应该返回新的长度 2 ，并且原数组 nums 的前两个元素被修改为 1, 2 。不需要考虑数组中超出新长度后面的元素。
 * 示例 2：
 * <p>
 * 输入：nums = [0,0,1,1,1,2,2,3,3,4]
 * 输出：5, nums = [0,1,2,3,4,_,_,_,_,_]
 * 解释：函数应该返回新的长度 5 ， 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4 。不需要考虑数组中超出新长度后面的元素。
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= nums.length <= 3 * 104
 * -100 <= nums[i] <= 100
 * nums 已按 非递减 顺序排列。
 */
public class LC26_RemoveDuplicatesFromSortedArray {

    /**
     * 删除排序数组中的重复项，返回不重复元素的数量
     */
    public static int removeDuplicates(int[] nums) {
        // 判断数组是否为空
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // slow 指向下一个可写入不重复元素的位置
        int slow = 1;

        // fast 从第二个元素开始扫描
        for (int fast = 1; fast < nums.length; fast++) {
            // 如果第二个元素不等于前一个
            if (nums[fast] != nums[fast - 1]) {
                // 说明不重复，向前移动
                nums[slow] = nums[fast];
                slow++;
            }
        }

        return slow;
    }

}
