/*
📎 https://www.acmicpc.net/problem/1475 - 방 번호
 */

fun main() {
    BJ_1475().solution()
}

class BJ_1475 {
    fun solution() {
        val input = readLine()!!

        // Things you need to solve the problem
        var setCheckArr = IntArray(10){0}
        var sixOrNineCheck = 0

        input.forEach {
            val tmp = it.toInt() - 48
            if(tmp == 6 || tmp == 9) {
                sixOrNineCheck++
            }else{
                setCheckArr[tmp]++
            }
        }

        val tmp1 = setCheckArr.maxOrNull()
        val tmp2 = sixOrNineCheck/2 + sixOrNineCheck%2

        print(kotlin.math.max(tmp1!!, tmp2))
    }
}