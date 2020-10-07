/*
📎 https://www.acmicpc.net/problem/20950 - A+B-3
 */

fun main() {
    val T = readLine()!!.toInt()

    for(i in 0 until T) {
        val nums: List<Int> = readLine()!!.split(" ").map{ it.toInt() }
        var sum: Int = 0
        sum = nums[0] + nums[1]
        println(sum)
    }
}