# Osmos / Agar.io
Final Project 2017 (Bermet and Janice Pd.9)

FEATURES
-------------------------------------------------------------------------------
Main Player's object follows mouse movements

As Main Player moves it loses mass

Main Player gains size and slows down as it eats

Enemies move randomly accross the speed and respawn according to the size of the Main Player

Enemy players change color based on Main Player's size
   - Yellow is safe to eat
   - Red is not safe to eat

GAME OVER screen when Main Player dies.
YOU WIN! screen comes up after Main Player gets to a certain size.

BUGS
-------------------------------------------------------------------------------
Sometimes (near the beggining) yellow enemies close enought to the Main Player's size may kill you.
After Main Player gets to a certain size... it goes rogue and does not follow mouse coordinates. (solved this with the YOU WIN! screen)
The YOU WIN! screen is also used when the game breaks itself (Some objects get too large)

DEVELOPMENT LOG
-------------------------------------------------------------------------------
May 30:
Completed Prototype and UML diagram.

May 31st:
First commit.

June 2nd:
Bermet looked at Demos and Examples. She figured out how to move(base on mouse movements, absorb other circles, and change certain variables in processing.
Janice set up the classes belonging to interface Player in Java. (she had a weird time committing the pde files)

June 6:
After some exploring with processing in class. Some variables were changed to be more realistic.

June 7:
Bermet altered some eating feature to work properly with the processing program. Completed the first version of Osmos.pde
The project became demoable.

June 11:
Janice added Enemies' color and respawning features. Altered the movements of enemies players so they moved more randomly and bounced off edges of screen. These new alterations to enemy would hopefully add to the difficulty of the game.
Janice also made the Main Player lose size as it moved.

June 12:
Bermet further worked on how the enemies bounced off the edges of the screen. (Window size was altered from "full screen" to given dimensions.)
Bermet worked on adding particle emission to the Main Player and Enemy-Enemy interactions (eating each other).