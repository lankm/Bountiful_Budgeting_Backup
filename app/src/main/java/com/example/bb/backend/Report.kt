package com.example.bb.backend

import java.time.LocalDateTime
import java.util.*

class Report : Budget {
    var date: Date = Calendar.getInstance().time

    //constructors
    constructor(b: Budget) : super(b)
    constructor(b: Budget, d: Date) : super(b) {
        date = d
    }

    fun print() : String {
        var str: String = "Month: " + date.toString().substring(4,7) + "\n\n"
        str += this.showAll()

        return str
    }
}