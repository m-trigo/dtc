# Defend The City - Ruleset (ver. 1.0.2a)
Last Revision: 2016-01-03

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
- [Encounters](#encounters)
- [Turn Structure](#turn-structure)
 

##Objective
The walls of your city have been breached. Defend it from conquest by defeating soliders of the invading forces.

####Win States
Defeat 5 [enemy soliders](#encounters).

####Lose States
If the player character suffers a [lethal wound](#injuries), the game is over.

##Character Attributes

Character attributes apply equally to both the player and enemy characters.

####Stamina

Starts at 30 and depletes as [actions](#action-attributes) are performed. A character's stamina replenishes back to maximum after each [encounter](#encounters). 

####Injuries

Characters start out uninjured. 
Every [successful hit](#to-hit-score) results in a lethal wound upon the target character.
A character that is lethaly wounded is considered defeated or deceased.

##Action Attributes

Action attributes are the same for actions performed by both the player and enemy characters.

####Offense and Defense Scores

On every turn of combat, a character must decide how much effort to spend on its defense and offense. That choice is represented as a pair of whole numbers that range from 0 to 5. The pair of values is collectively referred as “Score Values”.

####To Hit Score

Determines the chance that a character’s attack upon another will be successful. Calculated as: 

*To Hit Score* = (*Offense Score* - *Target's Defense Score*) / 5

Negative values are rounded up to 0.

####Action Cost

The amount of stamina an action costs, calculated as the sum of the action’s final score values. If at the start of a turn, a character has no stamina left, it will not be able to act until the end of the encounter.

##Encounters

Every new enemy you meet will engage you in a combat encounter. 
Combat takes the form of consecutive turns until one of the characters is defeated or both characters are out of stamina.

##Turn Structure

Every Turn consists of the resolution of one Action from each Character engaged in combat.

#####Step 1

The score values for the actions of each character are chosen.

#####Step 2

Both characters' score values are revealed. 
The character with the lowest offense score, if any, is given the option to forfeit his own offense score in order to conserve stamina on that action.

#####Step 3

All characters have their stamina reduced by the action cost on that turn.

#####Step 4

The offense scores of each character's actions are compared. 

If the characters actions share the same offense score, then both are considered to be attacking at the same time and their to hit scores are checked independently.

Otherwise, the character with the highest offense score is considered to be attacking first. 
That character action's to hit score is checked first. If and only if the attack was not sucessful, the to hit score of the character with the lowest offense score is then checked.

#####Step 5

The attack rolls are checked against each character's action's to hit score according to the previous step.

