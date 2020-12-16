/*
📎 https://www.acmicpc.net/problem/11328 - Strfry
📌 aab 랑 abb가 Possible 나오지 않도록 주의하기(true, false로 판단하면 안됨)
 */

fun main() {
    BJ_11328().solution()
}

class BJ_11328 {
    fun solution() {
        val N = readLine()!!.toInt()

        for(i in 0 until N) {
            val alphabetCheck1 = IntArray(26){ 0 }
            val alphabetCheck2 = IntArray(26){ 0 }
            val input = readLine()!!.split(" ")

            if(input[0].length != input[1].length) {
                println("Impossible")
                continue
            }

            for(i in 0 until input[0].length) {
                alphabetCheck1[input[0][i] - 'a']++
                alphabetCheck2[input[1][i] - 'a']++
            }

//            for(i in input[0].indices) {
//
//            }

            for(i in 0 until 26) {
                if(alphabetCheck1[i] != alphabetCheck2[i]) {
                    println("Impossible")
                    break
                }
                if(i == 25) {
                    println("Possible")
                }
            }
        }
    }
}