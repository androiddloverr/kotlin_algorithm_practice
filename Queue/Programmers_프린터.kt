/*
📎 https://programmers.co.kr/learn/courses/30/lessons/42587 - 프린터
📌 우선순위를 우선순위 큐에 넣어서 우선순위 큐의 맨 앞이 항상 제일 큰 우선순위가 오도록 했다.
📌 그리고 arrayList로 큐를 하나 만들어서 pair에 (index, 우선순위) 쌍을 넣고, 가장 앞에 있는 데이터의 우선순위가 우선순위 큐의 맨 앞 데이터와 같지 않으면
큐의 뒤로 넘겨버리는 방식으로 풀었다.
 */

import java.util.*

fun main() {
    val programmers_42587 = Programmers_42587()
    val value1 = intArrayOf(2, 1, 3, 2)
    val value2 = 2
    print(programmers_42587.solution(value1, value2))
}

class Programmers_42587 {
    fun solution(priorities: IntArray, location: Int): Int {
        val compare: Comparator<Int> = compareBy<Int> { it }.reversed()
        val priorityQueue = PriorityQueue<Int>(compare) // 우선순위는 priorityQueue에 넣어서 관리하도록 하기 위함

        var printQueue = arrayListOf<Pair<Int, Int>>()
        priorities.forEachIndexed { index, i ->
            priorityQueue.add(i)
            val pair: Pair<Int, Int> = Pair(index, i)
            printQueue.add(pair)
        }

        var count = 0
        var answer = 0
        while(printQueue.isNotEmpty()) {
            // 일단 맨 앞 데이터 꺼내놓고, 제거해놓음
            val front = printQueue[0]
            printQueue.removeAt(0)

            if(front.second == priorityQueue.peek()) {
                count++
                priorityQueue.poll()
                if(front.first == location) {
                    answer = count
                    break
                }
            }else{
                printQueue.add(front) // 뒤에 다시 넣기
            }
        }
        return answer
    }
}