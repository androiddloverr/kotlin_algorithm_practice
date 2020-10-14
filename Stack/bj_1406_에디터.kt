import java.util.*

/*
📎 https://www.acmicpc.net/problem/1406 - 에디터
📌 시간 제한 안에 풀려면 string이나 배열로 하면 초과 남, 대신 stack이나 linked list로 풀어야 하는 문제.
📌 왜 시간 초과가 나는지는 https://choheeis.github.io/newblog//articles/2019-07/BasicDataStructure 이 포스팅의 배열과 링크드 리스트의 차이를 보자.
📌 ? 하지만,, 자바의 stack 사용해도 시간초과 나구.. 코틀린의 arrayList를 stack처럼 사용해도 시간초과가 난다,, 해결 안된 문제..ㅠ
 */

fun main() {
    // input
    val leftStack = Stack<Char>()
    val rightStack = Stack<Char>()
    readLine()!!.forEach {
        leftStack.push(it)
    }
    val t = readLine()!!.toInt()

    // action
    for(i in 0 until t) {
        val command = readLine()!!.split(" ")
        if(command[0] == "L") {
            if(leftStack.empty() == false) {
                rightStack.push(leftStack.peek())
                leftStack.pop()
            }
        }else if(command[0] == "D"){
            if(rightStack.empty() == false) {
                leftStack.push(rightStack.peek())
                rightStack.pop()
            }
        }else if(command[0] == "B"){
            if(leftStack.empty() == false) {
                leftStack.pop()
            }
        }else {
            leftStack.push(command[1].get(0))
        }
    }

    // 문제의 출력 형식에 맞추려면 leftStack에 있는것이 아래부터 출력되어야 하므로 leftStack에 있는 것들을 rightStack에 push 하고 rightStack을 위에서부터 출력함으로써 출력 형식을 맞춰줌
    while(leftStack.empty() == false) {
        rightStack.push(leftStack.peek())
        leftStack.pop()
    }
    while(rightStack.empty() == false){
        print(rightStack.peek())
        rightStack.pop()
    }
}

fun practice() {
    // input
    val leftStack = arrayListOf<Char>()
    val rightStack = arrayListOf<Char>()
    readLine()!!.forEach {
        leftStack.add(it)
    }
    val t = readLine()!!.toInt()

    // action
    for(i in 0 until t) {
        val command = readLine()!!.split(" ")
        if(command[0] == "L") {
            if(leftStack.isNotEmpty()) {
                rightStack.add(leftStack[leftStack.size-1])
                leftStack.removeAt(leftStack.size-1)
            }
        }else if(command[0] == "D"){
            if(rightStack.isNotEmpty()) {
                leftStack.add(rightStack[rightStack.size - 1])
                rightStack.removeAt(rightStack.size - 1)
            }
        }else if(command[0] == "B"){
            if(leftStack.isNotEmpty()) {
                leftStack.removeAt(leftStack.size-1)
            }
        }else {
            leftStack.add(command[1].get(0))
        }
    }

    for(i in 0 until leftStack.size) {
        print(leftStack[i])
    }
    for(i in rightStack.size-1 downTo 0) {
        print(rightStack[i])
    }
}