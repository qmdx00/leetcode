package s0001

object Main {
  def main(args: Array[String]): Unit = {
     println(Solution.twoSum(Array(2, 7, 12, 15), 9).deep)
  }
}

object Solution {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val numsMap = nums.zipWithIndex.toMap
    for (idx <- nums.indices) {
      val t = target - nums(idx)
      if (nums.contains(t) && idx != numsMap(t))
        return Array(idx, nums.indexOf(t))
    }
    Array[Int]()
  }
}