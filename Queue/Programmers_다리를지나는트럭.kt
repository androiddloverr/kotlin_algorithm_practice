/*
📎 https://programmers.co.kr/learn/courses/30/lessons/42583 - 다리를 지나는 트럭
📌 큐에 다리를 현재 건너고 있는 트럭을 넣어서 품!
 */

fun main() {
    val programmers42583 = Programmers_42583()
    val value1 = 100
    val value2 = 100
    val value3 = intArrayOf(10, 10, 10, 10, 10, 10, 10, 10, 10, 10)
    print(programmers42583.solution(value1, value2, value3))
}

class Programmers_42583{
    fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        var bridge_queue = arrayListOf<Int>()
        var weight_sum = 0
        var time = 0
        var index = 0

        while(index <= truck_weights.size-1) {
            if(weight_sum + truck_weights[index] <= weight) {
                weight_sum += truck_weights[index]
                bridge_queue.add(truck_weights[index])
                time++
                index++
            }else{
                bridge_queue.add(0) // 큐 크기 채우기 위함
                time++
            }

            // 큐 크기 벗어나면 앞에꺼 빼야함
            if(bridge_queue.size == bridge_length) {
                weight_sum -= bridge_queue[0]
                bridge_queue.removeAt(0)
            }
        }

        var answer = time + bridge_length // 맨 마지막 트럭이 다리를 끝까지 지나는 시간 더해줌
        return answer
    }
}