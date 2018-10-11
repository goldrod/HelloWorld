package kotlinDemo

import com.google.gson.Gson
import com.google.gson.JsonElement
import java.io.File
import java.io.FileNotFoundException

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

    //扩展函数
    private fun String.spaceToCamelCase():String{
        val strList = (this as java.lang.String).split(" ")
        var result = ""
        strList.map {if (strList.indexOf(it) == 0) {
                        it.substring(0, 1).toLowerCase() + it.substring(1, it.length)
                    } else {
                        it.substring(0, 1).toUpperCase() + it.substring(1, it.length)
                    }}
                .forEach { result = result.plus(it) }
        return result
    }

    fun test(){
        //过滤list
        val list = listOf(9,7,3,4,5,6,1,2).filter { it > 3 }

        //string内插
        println("Name $name")

        //遍历map
        val map = mapOf("1" to "one","2" to "second")
        for((k,v) in map){
            println("$k -> $v")
        }

        println("Convert this to camelcase".spaceToCamelCase())

        //if not null 缩写
        val files = File("Test").listFiles()
        println(files?.size)

        //if not null and else 缩写
        println(files?.size ?: 0)

        //if null 执行一个语句
        val size = files?.size ?: throw FileNotFoundException("文件夹不存在")

        //if not null 执行代码

        list?.let{list.sortedBy { it } } ?: print("list为空")

        val result = try{
            transform("black")
        }catch (e:IllegalArgumentException){
            throw IllegalArgumentException(e)
        }

        //对一个对象实例
        val basicGrammar = BasicGrammar()
        with(basicGrammar){
            testWhile()
            print()
            describe("Hello")
        }

    }

    //返回when表达式
    private fun transform(color:String):Int{
        return when(color){
            "red" -> 1
            "yellow" -> 2
            else -> throw IllegalArgumentException("Invalid color param value")
        }
    }

    //单表达式函数
    fun theAnswer() = 42

    //对于需要泛型信息的泛型函数的适宜形式
    inline fun <reified T: Any> Gson.fromJson(json: JsonElement): T = this.fromJson(json, T::class.java)

}