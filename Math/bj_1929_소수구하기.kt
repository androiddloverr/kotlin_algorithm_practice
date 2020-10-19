/*
📎 https://www.acmicpc.net/problem/1929 - 소수 구하기
📌 에라토스테네스의 체 --> https://choheeis.github.io/newblog//articles/2020-04/%EC%97%90%EB%9D%BC%ED%86%A0%EC%8A%A4%ED%85%8C%EB%84%A4%EC%8A%A4%EC%9D%98%EC%B2%B4
 */

fun main() {
    // input
    val range = readLine()!!.split(" ").map{ it.toInt() }

    // action
    var isSelected = BooleanArray(range[1] + 1){ false }
    isSelected[0] = true // 애초에 소수가 아닌 것 처리
    isSelected[1] = true
    for(i in 2 until isSelected.size) {
        if(isSelected[i] == false) {
            for(j in i+i until isSelected.size step i) {
                isSelected[j] = true
            }
        }
    }

    // output
    for(i in range[0]..range[1]) {
        if(isSelected[i] == false) {
            println(i)
        }
    }
}