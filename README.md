# Save the Most Precious Thing
The game for the Java course project.

## About the Game
This is a text adventure game set in the Louvre Museum in Paris, France. 
You must enter the correct answer to advance the action or location. 
The correct answer is no more than two words and is often a noun, a verb, or a combination of a verb and a noun. 
At the same time, pay attention to the items that appear in the scene. 
When you pick up an item, this item will be removed from the current location. 
When you throw an item away, this item will be placed on the current location.

Hope you enjoy our game (^^)

## Introduction
Today is Monday, the closing day of the Louvre. 
The sun sets in the west, and the golden sunset shines on the huge glass pyramid in front of the Louvre. 
Although you have seen this beautiful scene many times, the sunset still makes you deeply addicted every time. 
While you were immersed in the scenery, you received a message on your phone...

## The Set of Input Commands
The set of input commands is not strict, so there are a few options to designate what you need to do during the game. 
The responce for the unappropriate command in some situation is like `It seems like this is not the correct direction...` or `This is not the correct command.`

So, here is the list of the input commands currently supported by the game. 
Not all of them are available at every location. 
All the text in square brackets is optional but if you are typing it,
pay attention to the vertical line which means "or".
 - `[go|move] north|south|east|west|back`;
 - `look [around]|observe|explore`;
 - `take|pick` an item;
 - `drop|throw` an item;
 - `read` a readable item;
 - `[check] inventory`;
 - `help`;
 - `tip`.

## Map
![Map](Map.jpg)

## The UML Diagram
![UML](UML.svg)