package udacity

import java.util.Random

fun main(args: Array<String>) {
    //Create a lambda and assign it to rollDice, which returns a dice roll (number between 1 and 12).
    //Extend the lambda to take an argument indicating the number of sides of the dice used for the roll.
    //If you haven't done so, fix the lambda to return 0 if the number of sides passed in is 0.
    val rollDice = { sidesDiceRoll: Int -> if (sidesDiceRoll == 0) 0 else Random().nextInt(12) + 1 }

    //Create a new variable, rollDice2, for this same lambda using the function type notation.
    val rollDice2: (Int) -> Int = { sides ->
        if (sides == 0) 0
        else Random().nextInt(sides) + 1
    }

    //Pass your rollDice2 function as an argument to gamePlay() to generate a dice roll every time gamePlay() is called.
    gamePlay(rollDice2(4))
}

fun gamePlay(rollDice: Int) {
    println(rollDice)
}
