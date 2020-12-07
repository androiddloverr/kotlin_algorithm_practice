/*
📎 https://www.acmicpc.net/problem/10808 - 알파벳개수
 */

fun main() {
    BJ_10808().solve()
}

class BJ_10808 {
    fun solve() {
        val input = readLine()!!
        var alphabets = IntArray(26){ it -> 0 }
        input.forEach {
            // a를 index 0으로 판단하기 위해 아스키코드 사용
            val index = it.toInt() - 97
            alphabets[index]++
        }

        alphabets.forEach{
            print("$it ")
        }
    }
}

