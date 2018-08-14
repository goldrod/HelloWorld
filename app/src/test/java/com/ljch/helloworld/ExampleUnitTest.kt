package com.ljch.helloworld

import com.rdf.cdk.CodeUtil
import org.junit.Test


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun test() {
        val str = "kKETPG6oRbCjwwsYkQEDrQvPvu85UgiGq+Bt6Xwb3McEfpjKKfnBc9iX05akWkuRyLK2XFNgLesmwiepR7y7M7zA2DnaTsnh5IvsTDrAojs="
//        println(Base64.decode(str.toByteArray(charset("utf-8"))))
        println(CodeUtil.decodeQrCode(str))
    }



}
