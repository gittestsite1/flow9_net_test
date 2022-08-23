fun test_apply(){

    /*
     * 아래 내용은 지금 잘 파악이 안된다.
     * 따라서 대상이 null일 때 null safety 체크를 해야 할 경우는 apply나 run을 사용한다. ??
     * target?.apply { }
     */
    val list = mutableListOf("scope", "function")
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

fun test_also(){
    val list = mutableListOf("scope", "function")

    list.also {
        val listSize = it.size // 모든 속성과 함수를 it.속성 으로 사용할 수 있다.
        println("리스트의 길이 alos= $listSize")
    }
}

fun main() {


/**
 * 앞에 01에서, run, let처럼 스코프 함수는 자신을 호출한 대상을 this, it으로 대체 가능
 * 그 외에도 다음과 같은 스코프 함수 존재
 * run, with, apply
 *
 * ?? 지금 run, apply, let, also 이렇게 나왔는데
 * (run, apply)는 it없이 바로 사용 가능
 * (let, also)는 it으로 접근가능
 * ?? 비슷한거 같은데 왜 이렇게 구분지어서 작업을 했을까??
 * 조금더 알아봐야 할거 같다.
 * */

    test_apply()
    test_also()
}