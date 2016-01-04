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
- [Turn Structure](#turn-structure)
 

##Objective
The walls of your City have been breached. Defend it from conquest by defeating soliders of the invading forces.

####Win States
Defeat 5 enemy soliders.

####Lose States
If the Player Character suffers a lethal wound, the game is over.

##Character Attributes

####Stamina

Starts at 30 and depletes as actions are performed. Replenishes back to maximum after each encounter. 

####Injuries

Every character starts out uninjured. 
Every successful hit applies a lethal wound on the target character.
A character that is lethaly wounded is considered defeated or deceased.

##Action Attributes

####Offense and Defense Scores

When engaged in combat, every action a character can take is represented as a pair of these values. 
The pair is collectively referred as “Score values”, where both values are whole numbers that range from 0 to 5.

####To Hit Score

Determines the chance that a character’s attack upon another will be successful. Calculated as: 

Character's *To Hit Score* = (Character's *Offense Score* - Target's *Defense Score*) / 5,

where negative values are rounded up to 0.

####Action Cost

The amount of Stamina an Action costs, calculated as the sum of the Action’s current Score values.

##Turn Structure

Every Turn consists of the resolution of one Action from each Character engaged in combat.

####Step 1: Decision Step

The enemy’s Score values are secretly assigned and the player chooses his for the turn.

####Step 2: Reaction Step

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

