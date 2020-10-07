/*
📎 https://www.acmicpc.net/problem/10953 - A+B-6
 */

fun main() {
    val T: Int = readLine()!!.toInt()

    for(i in 0 until T) {
        val nums = readLine()!!.split(',').map{ it.toInt() }
        println(nums[0] + nums[1])
    }
}