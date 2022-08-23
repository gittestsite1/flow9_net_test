fun run_test(){

    /**
     * 함수 영역안에서 호출한 대상을 this로 사용할수 잇따.
     * this는 생략한다.
     * run을 수행하고 나서 그 안에서
     * remove, size등 list에서 사용할수 있는 것들을 마음대로 사용가능하다.
     * 요약) 속성이나, 함수를 (.) 없이 사용할수 있다.
     * */
    var list = mutableListOf("Scope", "Function")
    list.run {
        println(list)
        val listSize = size
        add(2, "call")
        val listSize2 = size
        val test_a =
        println("리스트의 길이 run = $listSize // $listSize2")
        println(list)
        remove("Scope")
        val listSize3 = size
        println("리스트의 길이 run = $listSize3")
        println(list)

    }
}

fun let_test(){

    /**
     * let을 사용하는 경우, 호출대상을 it으로 사용할수 있다.
     * it는 생략할수 없지만, 이름을 바꿀수는 있다.
     * */
    var list = mutableListOf("aaa", "bbb", "ccc")
    list.let {
        var listSize = it.size
        println(list)
        it.add(1, "add_let")
        println(list)

        println("리스트의 길이는 let = $listSize")
    }
}

fun main() {
    run_test()
    let_test()

}