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

Character's *To Hit Score* = (Character's *Offense Score* - Target's *Defense Score*) / 5,

where negative values are rounded up to 0.

####Action Cost

The amount of Stamina an Action costs, calculated as the sum of the Action’s current Score values. If at the start of a Turn, a Character has no Stamina, it cannot assign

##Encounters

Every enemy you meet starts a new combat Encounter. During combat Encounters, Characters act

##Turn Structure

Every Turn consists of the resolution of one Action from each Character engaged in combat.

#####Step 1

The Score Values for each Character are chosen.

#####Step 2

Both Character’s Score Values for the Turn are revealed. 
The Character with the lowest Offense Score, if any, must chose whether or not to forfeit his Offense Score.

#####Step 3

The action’s Stamina cost of both charaters is deduced from its current Stamina.

#####Step 4

If characters share the same Offense Score:
Both characters are considered to be attacking at the same time. 
Both THS are used independently to check for the sucess of each character’s attack.

If characters do NOT share the same Offense Score:
The character with the highest Offense Score is considered to be attacking first. 
His THS is used to determine if the attack was successful. 
If the attack was not sucessful, then and only then, second character’s THS is used to determine if his attack was sucessful. 

#####Step 5

The attack rolls are checked against each character's THS in the order set by in previous step.
If a character is hit by an attack, it dies and the encounter is over. 
Otherwise, the a new Turn begins until one of the characters is slain or neiter has any Stamina left.

