Things you need to play liar's dice: 

At least two liars. 
14 Dice
At least 7 rounds and no more than 13 rounds.
One or two cups or something to conceal the rolled dice.
A set of rules about what dice you can claim.

Classes to consider for the game:

A die class for one die.
A cup or hand class for 7 dice.
A console class that takes input from the player and uses the input into the game.
A game class that keeps creates players, keeps track of the score and ends once one player wins and controls the flow of the game.

Another class to consider is a player class.








Cliff's outline walk through.

What is needed?
At least two players.
7 six sided dice per player.
Each player requires a cup.
Surface to roll dice.

Example of a round:
Both player roll dice inside of the cup.
Players place the cup upside down on flat surface with dice hidden underneath.
Players look at their dice.
Lead player makes a claim of how many of a die value is in play.
Next player decides if previous player is lying. 
If they do not think the player is lying they make a claim for the next player.
The new claim must increase the number of dice or increase the die value with any amount. 
Repeat until someone is called a liar.

When liar is called, check all dice in play against the claim. 
If the claim was valid the accuser loses 1 die.
If the claim was a lie the liar loses 1 die.
A player is removed from the game when they have 1 die left.
Game continues until only 1 player remains.

What entities exist?
Dice 
Players
Cups
Table
Game

What methods should we make for our entities that create Liar's dice?
Dice:
Constructor to instantiate a die object.
getter to get the value of one die.
toString method to display to console.
roll to roll one die.

Cup/Hand:
constructor to instantiate a cup/hand object made of dice objects.
claim method that sets a claim of how many dice and which dice a player claims they have, I need to enhance my method to check that a player is putting in a 
valid claim, i.e. they are either increasing the number of dice or
claiming higher sided dice.
getter to get the dice objects.
getter to get a player's claim.
checkClaim to check to see if a player's claim is true.
roll to roll all dice in their cup/hand
roll to roll selected dice in their cup/hand
display that prints their hand/cup to the screen when a player inputs "show"
toString to convert a cup/hand object to string.

Console class: 
creates the scanner object
welcome displays a greeting and should explain succinctly how to play game
getChoice asks a user to pick a die and returns their choice
getChoices does the same thing but takes and returns choices
displayCup asks the player to enter 'show' to run the displayCup method.
getComparison asks a user to enter 'bull' to check other player's claim.
clearScreen clears the console so player's cup/hand isn't shown to the other player.
askClaim prompts the player to input their claim and returns the claim to the hand/cup claim method.

Game:
Both players are instantiated using the cup/hand class
Keeps track of the game rounds with a while-loop and game set to true.
Once one of the player's cup/hand object's size is equal to 2 then game is false
and stops the loop.
The logic mimics a 1 vs 1 game of liar's dice with player1 going first. 



