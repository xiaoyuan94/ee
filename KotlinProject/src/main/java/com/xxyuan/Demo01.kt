package com.xxyuan

fun main() {
    var a = 1
    // 模板中的简单名称：
    val s1 = "a is $a"
    a = 2
    // 模板中的任意表达式：
    val s2 = "${s1.replace("is", "was")}, but now is $a"

    System.out.println(s1)
    System.out.println(s2)

}
