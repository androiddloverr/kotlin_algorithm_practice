/*
📎 https://programmers.co.kr/learn/courses/30/lessons/42586 - 기능개발
📌 스택에 각 작업마다 걸리는 일 수를 저장하고 top 보다 큰 수가 나올때까지 pop 하면서 count함
 */


fun main() {
    val solution = Programmers_42586()
    val progresses = intArrayOf(95, 90, 99, 99, 80, 99)
    val speeds = intArrayOf(1, 1, 1, 1, 1, 1)
    solution.solution(progresses, speeds)
}

class Programmers_42586 {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var howLongTake = arrayListOf<Int>()

        // stack에 각 작업당 걸리는 일수 저장
        for(i in progresses.size-1 downTo 0) {
            if((100-progresses[i])%speeds[i] != 0) {
                howLongTake.add((100-progresses[i])/speeds[i] + 1)
            }else{
                howLongTake.add((100-progresses[i])/speeds[i])
            }
        }

        var answer = arrayListOf<Int>()
        var count = 1
        var top = howLongTake[howLongTake.size-1] // top
        howLongTake.removeAt(howLongTake.size-1) // pop
        while(howLongTake.isNotEmpty()){
            if(top < howLongTake[howLongTake.size-1]){
                answer.add(count)
                count = 0
                top = howLongTake[howLongTake.size-1]
            }else{
                count++
                howLongTake.removeAt(howLongTake.size-1)
            }
        }
        answer.add(count)
        return answer.toIntArray()
    }
}