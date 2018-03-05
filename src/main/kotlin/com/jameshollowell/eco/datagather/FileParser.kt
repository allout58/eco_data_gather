package com.jameshollowell.eco.datagather

import java.io.File
import java.io.InputStream

/**
 * Created by James Hollowell on 3/4/2018.
 */
class FileParser {
    private val namespaceRegex = Regex("""namespace [A-z0-9.]+\s*[{]([^\e]*)[}]""")

    fun parseFile(filename: String): Unit {
        val inputStream: InputStream = File(filename).inputStream()
        val inputString = inputStream.bufferedReader().use { it.readText() }
        val matches = this.namespaceRegex.matchEntire(inputString)
        if (matches != null && matches.groupValues.size == 2) {
            print("Namespace content")
            println(matches.groupValues[1])
        }
        else {
            println(matches)
        }
    }
}