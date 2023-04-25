fun main() {
    var myString = randomString("Florence")


    // Invoking multiples()
    multiples()

    // Invoking class CurrentAccount
    var x = CurrentAccount("12344556666", "Florence Wangui", 1000000.0)
    println(x.accountName)
    println(x.accountNumber)
    println(x.balance)

    println(x.deposit(5000.0))
    println(x.withdraw(20000.0))
    x.details()

    // Invoking class SavingsAccount
    var y = SavingsAccount(2, "12344556666", "Florence Wangui", 1000000.0)
    println(y.withdraw(10000.0))
}

/*
1. Write and invoke one function that takes in a random string and returns the
following values: first character, last character, length of the string and
whether it begins with a vowel or not.
 */
//data class randomString(var str: String)
fun checkStrings(str: String): Boolean{
    if (str[0] == 'a' || str[0] == 'e' || str[0] == 'i' || str[0] == 'o' || str[0] == 'u'){
        return true
    }
    return false
}

/*
Question 2
Create a function that takes in a password as a parameter. For a password to
be valid it must meet the following conditions:
1. Must be at least 8 characters long
2. Must be at most 16 characters long
3. Must not be “password”
4. Must contain a digit
Your function should determine whether the password provided is valid or not.
The function returns true/false
 */
fun checkPassword(password: Any): Boolean{
    for(char in chars){
            if (char 8.. 16){

        }
    }
}

/*
Question 3
Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
multiples of both 6 and 8 it should print out “Bingo!” (5pts)
*/
fun multiples(){
    for (num in 1..1000){
        if (num % 6 == 0 && num % 8 == 0){
            println("Bingo!")
        }else if(num % 6 == 0 || num % 8 == 0){
            println("$num")
        }
        else{
            println("Neither a multiple of 6 nor 8!")
        }
    }
}
/*
Question 4

Create a class CurrentAccount with the following attributes: account number,
account name, balance. It has the following functions:
a. deposit(amount: Double) - Increments the balance by the amount
deposited
b. withdraw(amount: Double) - Decrements the balance by the amount
withdrawn
c. details() - Prints out the account number and balance and name in
this format: “Account number x with balance y is operated by z”
 */

public open class CurrentAccount(var accountNumber: String, var accountName: String, var balance: Double){
    fun deposit(depositAmount: Double): Double{
        return balance + depositAmount
    }
    open fun withdraw(withdrawAmount: Double):Double{
        return balance - withdrawAmount
    }
    fun details(){
        println("Account number $accountNumber with balance $balance is operated by $accountName.")
    }
}

/*
Question 5

Create another class SavingsAccount. It has the same functions and
attributes as the current account except for one attribute, withdrawals: Int.
Withdrawals is a counter variable that is used to keep track of how many
withdrawals have been made from the account in a year. The only other
difference is that the savings account withdraw() method first checks if the
number of withdrawals is less than 4 for it to allow one to withdraw money
from the account. It also increments the withdrawals attribute after a
successful withdrawal.
 */

class SavingsAccount(var withdrawals: Int, accountNumber: String, accountName: String, balance: Double): CurrentAccount(accountNumber, accountName, balance) {
    override fun withdraw(withdrawAmount: Double):Double{
        if (withdrawals < 4)
            withdrawals++
        return withdrawAmount
        }

    }

