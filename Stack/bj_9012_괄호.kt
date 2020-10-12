/*
📎 https://www.acmicpc.net/problem/9012 - 괄호
📌 스택을 arrayList로 구현 - push = add / pop = removeAt
 */

fun main() {
    val T: Int = readLine()!!.toInt()

    for(i in 0 until T) {
        val str: String = readLine()!!
        var arrayList = arrayListOf<Char>()
        var exception: Boolean = false

        str.forEach {
            if (it == '(') {
                arrayList.add(it)
            }else if(it == ')') {
                if (arrayList.size == 0) {
                    // (()()))( 일 경우 예외 처리
                    exception = true
                }else {
                    arrayList.removeAt(arrayList.size - 1)
                }
            }
        }

        if(exception == true) {
            println("NO")
        } else if ( arrayList.isEmpty() ) {
            println("YES")
        } else {
            println("NO")
        }
    }
}