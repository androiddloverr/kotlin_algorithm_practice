/*
📎 https://www.acmicpc.net/problem/2577 - 숫자 세기
📌 1000*1000*1000 = 10억 int 저장 가능
 */

fun main() {
    BJ_2577().solution()
}

class BJ_2577 {
    fun solution() {
        var mulNum = 1
        for(i in 0..2) {
            val tmp = readLine()!!.toInt()
            mulNum *= tmp
        }
        val numToStr = mulNum.toString()
        var checkArr = IntArray(10){0}
        numToStr.forEach {
            checkArr[it.toInt()-48]++
        }

        checkArr.forEach{
            println(it)
        }
    }
}