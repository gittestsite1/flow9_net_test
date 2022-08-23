fun test_apply(){

    /*
     * 아래 내용은 지금 잘 파악이 안된다.
     */
    var list = mutableListOf("scope", "function")
//    var list = mutableListOf("")
    list.apply {

        add("aaa")
        val listSize = size
        println("리스트의 길이 = $listSize")
        println(list)
    }

    /*
    * with는 확장형 함수가 아니여서 인자값으로 대상을 전달
    * */
    with(list){
        val listSize = size
        println("리스트의 길이 = $listSize")
        println(list)
    }
}


fun main() {

/**
 * 앞에 01에서, run, let처럼 스코프 함수는 자신을 호출한 대상을 this, it으로 대체 가능
 * 그 외에도 다음과 같은 스코프 함수 존재
 * run, with, apply
 * */

    test_apply()
}