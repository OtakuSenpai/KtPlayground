package com.otakusenpai.calculator

import java.util.Scanner

fun plus(lnum: Long, rnum: Long): Long = rnum + lnum
fun plus(lnum: Int, rnum: Int): Int = rnum + lnum

fun minus(lnum: Long, rnum: Long): Long {
  var temp : Long
  temp = 0
  if(rnum > lnum) temp =  (rnum - lnum)
  else if(lnum > rnum) temp = (lnum - rnum)
  else temp = 0
  return temp
}
fun minus(lnum: Int, rnum: Int): Int {
  var temp : Int
  temp = 0
  if(rnum > lnum) temp = (rnum - lnum)
  else if(lnum > rnum) temp = (lnum - rnum)
  else temp = 0
  return temp
}

fun multiply(lnum: Long, rnum: Long): Long {
  var temp : Long
  temp = 0
  try {
    temp = lnum * rnum
  }
  catch(e :Exception) {
    println("Error in operation.\nError was ${e.message}")
  }
  return temp
}
  
fun multiply(lnum: Int, rnum: Int): Long {
  var temp : Long
  temp = 0
  try {
    temp = lnum * rnum
  }
  catch(e :Exception) {
    println("Error in operation.\nError was ${e.message}")
  }
  return temp
}

fun divide(lnum: Long, rnum: Long): Double {
  var temp : Double
  temp = 0.0
  try {
    temp = lnum/rnum
    return temp
  }
  catch(e :Exception) {
    println("Error in operation.\nError was ${e.message}")
  }
}

fun divide(lnum: Int, rnum: Int): Double {
  var temp : Double
  temp = 0.0
  try {
    temp = lnum/rnum
    return temp
  }
  catch(e :Exception) {
    println("Error in operation.\nError was ${e.message}")
  }
}

fun calc(lnum: Int, rnum: Int, op: Char): Double {
  var temp : Double
  temp = 0.0
  if(op == '+') temp = plus(lnum,rnum)
  else if(op == '-') temp = minus(lnum,rnum)
  else if(op == '*') temp = multiply(lnum,rnum)
  else if(op == '/') temp = divide(lnum,rnum)
  else println("Unsupported operator!")
  return temp.toDouble() 
}

fun main(args: Array<String>) {
  var reader = Scanner(System.'in')
  var value : String
  var retValue : Double
  var lnum : Int
  var rnum : Int
  var op : Char
  retValue = 0.0
  lnum = 0
  rnum = 0
  while(true) {
    print("Enter left number: ")
    value = reader.next()
    lnum = value.toInt()
    println(" ")
    println("Enter right number: ")
    value = reader.next()
    rnum = value.toInt()
    println(" ")
    println("Enter operator: ")
    value = reader.next()
    op = value.toInt()
    println(" ")
    retValue = calc(lnum,rnum,op)
    println("Result is: {$retValue}")
  }
} 
