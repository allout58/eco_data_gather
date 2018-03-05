package com.jameshollowell.eco.datagather

/**
 * Created by James Hollowell on 3/4/2018.
 */

fun main(args: Array<String>): Unit {
    val parser = FileParser()
    parser.parseFile("data/Item/Arrow.cs")
}