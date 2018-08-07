package kotlinDemo

class IdiomaticUsage (val name:String,val email:String){

    /*
     *—— 所有属性的 getters （对于 var 定义的还有 setters）
     *—— equals()
     *—— hashCode()
     *—— toString()
     *—— copy()
     *—— 所有属性的 component1()、 component2()……等等（参见数据类）
     */

//    //延迟属性
//    val p by Lazy { }

    //函数默认参数
    fun foo(a:Int=0,b:String=""){}

    fun test(){
        //过滤list
        var list = listOf(1,2,3,4,5,6).first { it > 3 }

        //string内插
        println("Name $name")

        //遍历map
        var map = mapOf("1" to "one",2 to "second")
        for((k,v) in map){
            println("$k -> $v")
        }

    }


}