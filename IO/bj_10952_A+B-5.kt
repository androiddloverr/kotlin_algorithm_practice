/*
📎 https://www.acmicpc.net/problem/10952 - A+B-5
📌 c++에서 프로그램 종료는 return 0 을 사용했지만 코틀린에서는 return 만 사용함
 */

fun main() {
    while(true) {
        val nums: List<Int> = readLine()!!.split(" ").map{ it.toInt() }
        if(nums[0] == 0 && nums[1] == 0) {
            return
        }else {
            println(nums[0] + nums[1])
        }
    }
}