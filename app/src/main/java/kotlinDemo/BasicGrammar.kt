//包定义
package kotlinDemo

/**
 * kotlin的基础语法学习
 **/
class BasicGrammar {

    //定义函数
    fun sum(a:Float,b:Float):Float{
        return a * b
    }

    //函数无返回值unit，可以省略
    fun printSum(a:Int,b:Int){
        println("sum of $a and $b is ${a + b}")
    }

    //定义变量
    var a:Int = 1
    val b = 2

    //这是一行注释

    /*这是多
    行注释
     */

    //使用字符串模板
    fun print(){
        val s1 = "a is $a"//简单
        a = 2
        val s2 = "${s1.replace("is","was")},but now is $a"//表达式
        print(s1)
        print(s2)
    }


    //使用条件表达式
    fun maxof(a:Int,b:Int) :Int {
        return if(a>b) a else b
    }

    //使用空值及null检查, 必须在声明的类型后面添加？来标识该引用为空
    fun getStringLength(obj:Any):Int?{
        if(obj is String){
            return obj.length
        }
        return null
    }

    //使用for循环
    val items = listOf("apple", "banana", "kiwifruit")
    fun testFor(){
        for (index in items.indices){
            println("item at $index is ${items[index]}")
        }
    }

    //使用while循环
    fun testWhile(){
        var index = 0
        while( index < items.size){
            println("item at $index is ${items[index]}")
            index++
        }
    }

    //使用when表达式
    fun describe(obj:Any):String =
            when(obj){
                1 -> "one"
                "Hello " ->"Greeting"
                is Long  ->"Long"
                !is String ->"Not a String"
                else -> "UnKnown"
            }
    //使用区间（rang）
    fun textRang(){
        //区间迭代
        for(x in 1..5){
            print(x)
        }
        println()
        //数列迭代
        for(x in 1..10 step 2){
            print(x)
        }
        println()
        for(x in 9 downTo 0 step 3){
            print(x)
        }
    }


    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    //lambda表达式和映射map集合
    fun testMap(){
        fruits.filter { it.startsWith("a") }
                .sortedBy { it }
                .map { it.toUpperCase() }
                .forEach{ println(it) }
    }

    //创建实列
    val basicGrammar = BasicGrammar()//省略掉new

}