/*
📎 https://www.acmicpc.net/problem/11726 - 2 X n 타일링
📌 문제 풀이 --> https://choheeis.github.io/newblog//articles/2020-10/DynamicProgramming2 에서 알 수 있다.
 */

fun main() {
    val n = readLine()!!.toInt()
    print(BJ_11726().solution(n))
}

class BJ_11726 {
    fun solution(n: Int): Int {
        var D = IntArray(1001){0} // memoization을 위한 배열(점화식 표현과 맞추려고 D라고 이름 지음)
        D[0] = 1 // 아래 for문에서 i가 2일 때 D[0]이 되는데 2 X 2 크기의 직사각형의 가장 오른쪽에 가로 형태의 2 X 1 직사각형 2개가 들어가는 경우에도 방법의 수는 1임
        D[1] = 1 // 아래 for문에서 i가 1일 때 D[1]이 되는데 2 X 2 크기의 직사각형의 가장 오른쪽에 세 형태의 2 X 1 직사각형 1개가 들어가는 경우에도 방법의 수는 1임

        for(i in 2..n) {
            D[i] = D[i-1] + D[i-2]
            D[i] = D[i] % 10007
        }

        var answer = D[n]
        return answer
    }
}