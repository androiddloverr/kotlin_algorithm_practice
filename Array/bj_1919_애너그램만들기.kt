/*
📎 https://www.acmicpc.net/problem/1919 - 애너그램 만들기
 */

fun main() {
    BJ_1919().solution()
}

class BJ_1919 {
    fun solution() {
        val input1 = readLine()!!
        val input2 = readLine()!!

        // Things you need to solve this problem
        var firstStringCheckArr = IntArray(26){0}
        var secondStringCheckArr = IntArray(26){0}

        input1.forEach {
            firstStringCheckArr[it.toInt() - 97]++
        }
        input2.forEach {
            secondStringCheckArr[it.toInt() - 97]++
        }

        var sum = 0
        for(i in 0 until 26) {
            if(firstStringCheckArr[i] != secondStringCheckArr[i]) {
                var tmp = firstStringCheckArr[i] - secondStringCheckArr[i]
                if(tmp < 0) {
                    tmp = tmp*-1
                }
                sum += tmp
            }
        }

        print(sum)
    }
}