package com.ida.kotlindemo.model

//define Bean class
class Bean {

    var name: String = ""
    var age: Int = 0
    var sex: String = ""

    constructor(name: String, age: Int, sex: String) {
        this.name = name
        this.age = age
        this.sex = sex
    }

}