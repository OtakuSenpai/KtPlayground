package otakusenpai.calculator

import java.util.Scanner

fun sum(rhs: String, lhs: String): String {
	val temp1 = rhs.toDouble()
	val temp2 = lhs.toDouble()
	return (temp1 + temp2).toString()
}

fun minus(lhs: String, rhs: String): String {
	val temp1 = rhs.toDouble()
	val temp2 = lhs.toDouble()
	return (temp2 - temp1).toString()
}

fun divide(num: String, den: String): String {
	var retValue: String = ""
	try {
	  retValue = (num.toDouble()/den.toDouble()).toString()  
	}
	catch(e: Exception) {
	  println("Error in operation.\nError was ${e.message}")
	}
	return retValue
}

fun multiply(lhs: String, rhs: String): String {
	var retValue: String = ""
	try {
	  retValue = (lhs.toDouble() * rhs.toDouble()).toString()
	}
	catch(e: Exception) {
	  println("Error in operation.\nError was ${e.message}")
	}
	return retValue
}

fun calc(lhs: String, rhs: String, op: Char): Double {
	var temp1 : String = ""
	if(op == '+') temp1 = sum(lhs,rhs)
	else if(op == '-') temp1 = minus(lhs,rhs)
	else if(op == '*') temp1 = multiply(lhs,rhs)
	else if(op == '/') temp1 = divide(lhs,rhs)
	else println("Unsupported operator!")
	return temp1.toDouble()
}

fun main(args: Array<String>) {
  println("Hello World!")
  var retValue : Double 	
  var reader = Scanner(System.`in`)
  var value : String 
  var lhs : String 
  var rhs : String 	
  var op : Char
  var found = false
  op = '+'	
	
  while(true) {
	print("Enter left number: ")
	value = reader.next()  
	lhs = value
	println("\n")
	print("Enter right number: ")
	value = reader.next()
	rhs = value
	println("\n")
	println("Enter operator: ")
	value = reader.next()
    while(!found) {
        if(value.length == 1) {
			found = true
			op = value.single()
		}
	    else {
		    println("Reenter input: ")
			found = false
		}
	}	  
	print("\n")
	retValue = calc(lhs,rhs,op)
	println("Result is $retValue")          
  }	
}
