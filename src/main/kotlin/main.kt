fun main(){
    val a = 50
    val b = 25

    println("For the numbers $a and $b \n")
    println("The sum is greater than 70: "+ (a+b>70))
    println("The sum of $a and $b is " + (a+b) + "\n")

    println("The difference is less than 10: "+ (a-b<10))
    println("The difference of $a and $b is " + (a-b) + "\n")

    println("The product is greater than 1000: "+ (a*b>1000))
    println("The product of $a and $b is " + (a*b) + "\n")

    println("The quotient is less than 4: "+ (a/b<4))
    println("The quotient of $a and $b is " + (a/b) + "\n")

    println("These numbers are evenly divisible: "+ (a%b==0))
    println("The MOD of $a and $b is " + (a%b) + "\n")
}