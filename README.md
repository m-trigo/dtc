# Defend The City - Ruleset (ver. 1.01a)
Last Revision Date: 2016-01-03
 
## Table of Contents
 
- [Story](#Story)
- [Character Attributes](#Character Attributes)
  - [Stamina](#Stamina)


### Story
Your city is under attack and you are one of its soldiers. 
Grab what you can and help to stem the tides of invaders who have breached the walls. 
This is the night you were trained for.


CHACATER PRIMARY ATTRIBUTES

Stamina (STA)

Starts at 30 and depletes as actions are performed, but replenishes to maximum after each encounter. 
Different actions have different stamina costs. If a character is out of Stamina (zero or negative), it cannot act anymore.


CHARACTER ACTION ATTRIBUTES

Offense Score (OS) and Defense Scores (DS)

When engaged in combat, every action a character can take is represented with a pair of these values. 
The pair is collectively called “Score values”. 
Both values are whole numbers in between and including 0 and 5.

To Hit Score (THS)

Determines the chance that a character’s attack will be successful (every hit is lethal). 
This is calculated as (Offense Score - Enemy’s Defense Score)*20% and negative values are rounded up to 0%.

Action Cost (AC)

The amount of Stamina an action costs.
Calculated as the sum of the action’s current Score values for the action.
It is possible for a character to use more Stamina than it currently has on its last Action.


TURN STRUCTURE

STEP 1: Decision Step

The enemy’s Score values are secretly assigned and the player chooses his for the turn.

STEP 2: Reaction Step

Both character’s Score values for the turn are revealed. 
The character with the lowest Offense Score,if any, must chose whether or not to forfeit his Offense Score.
The Enemy A.I. will never do so.

STEP 3: Action Step

The action’s Stamina cost of both charaters is deduced from its current Stamina.

STEP 4: Attack Order Step

If characters share the same Offense Score:
Both characters are considered to be attacking at the same time. 
Both THS are used independently to check for the sucess of each character’s attack.

If characters do NOT share the same Offense Score:
The character with the highest Offense Score is considered to be attacking first. 
His THS is used to determine if the attack was successful. 
If the attack was not sucessful, then and only then, second character’s THS is used to determine if his attack was sucessful. 

STEP 5: Hit Check Step

The attack rolls are checked against each character's THS in the order set by in previous step.
If a character is hit by an attack, it dies and the encounter is over. 
Otherwise, the a new Turn begins until one of the characters is slain or neiter has any Stamina left.


END-GAME

The game ends when the player character dies or when the 5th enemy is defeated. 
