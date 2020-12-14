/*
📎 https://www.acmicpc.net/problem/1406 - 에디터
📌 시간초과가 13번 난 문제... 중간에 원소를 삽입/삭제하는 작업이 많아서 Array를 사용하면 안됨. Linked List 사용
📌 또 Linked List의 add(), remove() 사용하면 시간 복잡도가 O(N)이라서 시간초과 남 --> ListIterator 사용해야 함
📌 이렇게 해줘도 시간초과 남. 입출력 시간까지 빠르게 해줘야함
📌 ListIterator에 대해서는 https://choheeis.github.io/newblog//articles/2020-12/kotlin-iterator 참고하기
 */

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    BJ_1406().solution()
}

class BJ_1406 {
    fun solution() {
        /** Things you need to solve this problem */
        val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
        val bufferedWriter = BufferedWriter(OutputStreamWriter(System.`out`))
        val list = LinkedList<String>()
        bufferedReader.readLine().forEach {
            list.add(it.toString())
        }
        val iterator = list.listIterator(list.size) // listIterator 생성
        val M = bufferedReader.readLine().toInt()

        /** Action */
        for(i in 0 until M) {
            val tmp = bufferedReader.readLine().split(" ")
            if(tmp[0] == "L") {
                if(iterator.hasPrevious()) {
                    iterator.previous()
                }
            }else if(tmp[0] == "D") {
                if(iterator.hasNext()) {
                    iterator.next()
                }
            }else if(tmp[0] == "B") {
                if(iterator.hasPrevious()) {
                    iterator.previous()
                    iterator.remove()
                }
            }else {
                iterator.add(tmp[1])
            }
        }

        list.forEach {
            bufferedWriter.write(it)
        }
        bufferedWriter.flush()
        bufferedWriter.close()
    }
}