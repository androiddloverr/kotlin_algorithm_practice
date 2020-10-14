/*
📎 https://www.acmicpc.net/problem/10799 - 쇠막대기
📌 스택에 인덱스를 1부터 1씩 증가시켜가며 넣다가 )를 만났을 때 현재 인덱스가 스택 top에 있는 인덱스랑 1차이 나면 레이저라는 것
📌 레이저 만났을 때 레이저를 이루는 ( 인덱스를 pop 하고 난 후에 스택에 남아있는 데이터 수가 만난 레이저에 의해 잘리는 막대 수이다
📌 만약 스택 top에 있는 인덱스랑 현재 인덱스랑 1보다 큰 차이가 난다면 그건 어떤 막대 하나의 끝이라는 것이다.
📌 이해가 안된다면 참고하기 --> https://hsp1116.tistory.com/29
 */

fun main() {
    var stack = arrayListOf<Int>()
    var index = 1
    var total = 0
    readLine()!!.forEach {
        if(it == '(') {
            stack.add(index)
            index++
        }else{
            if(stack[stack.size-1] == index-1){
                // tag 인 경우
                stack.removeAt(stack.size-1)
                total += stack.size
            }else{
                stack.removeAt(stack.size-1)
                total += 1
            }
            index++
        }
    }
    print(total)
}