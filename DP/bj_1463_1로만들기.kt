/*
📎 https://www.acmicpc.net/problem/1463 - 1로 만들기
📌 --> 이 문제의 풀이는 https://choheeis.github.io/newblog//articles/2020-10/DynamicProgramming2 블로그 포스팅을 참고하자.
 */

fun main() {
    val N = readLine()!!.toInt()

    // bottom - top 방식
    var memo = IntArray(N+1){i -> 0}
    memo[0] = -1 // index 0 안씀 처리
    memo[1] = 0 // 1로 만드는 방법은 0이니까 초기화 처리

    for(i in 2..N) {
        var min = N+1 // 최솟값 저장을 위한 초기화

        // 조건 1 - 3으로 나누어 떨어지면, 3으로 나눈다.
        if(i%3 == 0) {
            memo[i] = 1 + memo[i/3]
            if(min > memo[i]) {
                min = memo[i] // 최솟값 저장
            }
        }

        // 조건 2 - 2로 나누어 떨어지면, 2로 나눈다.
        if(i%2 == 0) {
            memo[i] = 1 + memo[i/2]
            if(min > memo[i]) {
                min = memo[i] // 최솟값 저장
            }
        }

        // 조건 3 - 1을 뺀다.
        memo[i] = 1 + memo[i-1]
        if(min > memo[i]) {
            min = memo[i] // 최솟값 저장
        }

        memo[i] = min // 이 때의 min이 가장 최소가 된다.
    }
    print(memo[N])
}