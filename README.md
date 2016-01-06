# Defend The City: Single Encounter Test
# Ruleset (ver. 1.1.0a)
Last Revision: 2016-01-05

## Table of Contents
- [Objective](#objective)
    - [Lose States](#lose-states)
    - [Win States](#win-states)
- [Character Attributes](#character-attributes)
  - [Stamina](#stamina)
  - [Injuries](#injuries)
- [Action Attributes](#action-attributes)
  - [Offense and Defense Scores](#offense-and-defense-scores)
  - [To Hit Score](#to-hit-score)
  - [Action Cost](#action-cost)
- [Turn Structure](#turn-structure)
     - [Step 1](#step-1)
     - [Step 2](#step-2)
     - [Step 3](#step-3)
     - [Step 4](#step-4)     
     - [Step 5](#step-5)
     - [Step 6](#step-6)
 
##Objective
Defeat the enemy

####Win States
Strike a [lethal wound](#injuries) at the enemy.

####Lose States
Suffers a [lethal wound](#injuries).

##Character Attributes

Character attributes apply equally to both the player and enemy characters.

####Stamina

Starts at 20 and depletes as [actions](#action-attributes) are performed.

####Injuries

Characters start out uninjured. 
Every [successful hit](#to-hit-score) results in a lethal wound upon the target character.
A character that is lethaly wounded is considered defeated or deceased.

##Action Attributes

Action attributes are the same for actions performed by both the player and enemy characters.

####Offense and Defense Scores

On every action during combat, a character must decide how to balance its defense and offense. 
That choice is represented as a pair of whole numbers that range from 0 to 5, but need to add up to 7 or less. 
The pair of values is collectively referred as “Score Values”.

####To-Hit Score

Determines the chance that a character’s attack upon another will be successful. Calculated as: 

*To-Hit Score* = (*Offense Score* - *Target's Defense Score*) / 5

Negative to-hit values are rounded up to 0.

####Action Cost

The amount of stamina an action costs, calculated as the sum of the action’s final score values. If at the start of a turn, a character has no stamina left, it will not be able to perform attack and might not be able to defend itself.

##Turn Structure

Every turn consists of the resolution of one action from each of the characters engaged in combat.

#####Step 1

The score values for the actions of each character are chosen.

#####Step 2

Both characters' score values are revealed. 

#####Step 3

All characters have their stamina reduced by the action cost on that turn.

#####Step 4

The offense scores of each character's actions are compared. 

If the characters actions share the same offense score, then both are considered to be attacking at the same time and their to-hit scores will be checked independently.

Otherwise, the character with the highest offense score is considered to be attacking first. 
That character to-hit score will be checked first. If and only if the attack is not sucessful, the to-hit score of the character with the lowest offense score will then be checked for sucess.

#####Step 5

The attack rolls are checked against each character's to-hit score according to the previous step.

#####Step 6

Characters are checked for lethal injuries and for stamina left. 
If both characters were lethaly wounded or both are out of stamina, the combat ends in a draw.
