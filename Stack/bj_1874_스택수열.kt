/*
📎 https://www.acmicpc.net/problem/1874 - 스택 수열
📌 input의 인덱스 0을 계속 removeAt(0)하면서 stack의 top과 비교했음
 */

fun main() {
    val T: Int = readLine()!!.toInt()
    var input: ArrayList<Int> = arrayListOf()

    for(i in 0 until T) {
        input.add(readLine()!!.toInt())
    }

    var arrayList: ArrayList<Int> = arrayListOf(0)
    var result = arrayListOf<Char>()
    var increase: Int = 1
    var exception: Boolean = false

    while(input.size != 0) {
        if(arrayList[arrayList.size-1] < input[0]) {
            if(increase > T) {
                exception = true
                break
            }
            result.add('+')
            arrayList.add(increase)
            increase++
        }else {
            result.add('-')
            if(input[0] == arrayList[arrayList.size-1]) {
                input.removeAt(0)
            }
            arrayList.removeAt(arrayList.size-1)
        }
    }

    // NO이면 +-.. 출력하면 안됨 즉, 한 번에 쭉 출력해야함
    if(exception) {
        println("NO")
    }else{
        result.forEach {
            println(it)
        }
    }
}