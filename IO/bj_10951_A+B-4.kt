/*
📎 https://www.acmicpc.net/problem/10951 - A+B-4
📌 코틀린에서 입력 함수 readLine() 을 사용하여 EndOfFile(EOF)를 체크하는 방법은 readLine() 의 반환값이 null 인지 체크하는 것이다.
📌 readLine() 함수의 반환값은 null 또는 string형 데이터인데 null이 반환되는 경우는 입력 대상이 되는 파일의 끝에 도달해 더 이상 입력할 값이 없을 경우이다.
 */

fun main() {
    while(true) {
        val check = readLine()
        if(check == null) {
            return
        } else {
            val input = check.split(" ").map{ it.toInt() }
            println(input[0] + input[1])
        }
    }
}