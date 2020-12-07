/*
📎 https://www.acmicpc.net/problem/10807 - 개수 세기
📌 배열에 count 저장해놓고 세기
 */

fun main() {
    BJ_10807().solution()
}

class BJ_10807{
    fun solution() {
        var numberSaveArr = IntArray(202){0}
        val N = readLine()!!.toInt()
        val inputArr = readLine()!!.split(" ").map{it.toInt()}.forEach {
            if(it < 0) {
                val tmp = it*-1 + 100
                numberSaveArr[tmp]++
            }else{
                numberSaveArr[it]++
            }

        }
        val v = readLine()!!.toInt()
        if(v < 0) {
            print(numberSaveArr[v*-1 + 100])
        }else {
            print(numberSaveArr[v])
        }
    }
}