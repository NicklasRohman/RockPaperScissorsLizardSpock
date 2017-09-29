# RockPaperScissorsLizardSpock
Nicklas Roman SJK16G Systemutveckling Java

Its a Rock,Paper,Scissors,Lizard and Spock game. Player writes his/her name and it will look in the database if the name already exist, if it do exist it will load player record, if not create a new player.

Playing the game:
Player press Rock,Paper,Scissors,Lizard or Spock button. The Ai will make a small calculating and try to counter the players move. 
Depending on what the player has chosen for AI level , it makes some different calculations.

The it will show how is the winner that round.

Help button will only show what takes what.
when exiting game the game will first save players record.

working progress:
I started making GUI first and all the popup windows and after that i made some button functions that was connected to the database.
Then i started to make player Class and i wanted a factory method here and it worked fine at first but the deeper i got in to the code the harder it got to get all the values i wanted. 
When the game start running and i had something to show. I started to evolve it whit more AI.
I made a class diagram when i had a complete runnable game.
You may think i inpro all this from start but i had a idea how it should look in my head, but my planning gotten bigger quickly. More classes were added and more Ai levels were added whit a factory method.

What I did well:
The time frame was very good when I already had a working game a week earlier, which meant that I had time to develop the program so that there were 3 difficulty levels on my AI
Thought it felt like the flow in the work process went well, though it was stuck in the angle of the eye a few times.

What I could do better:
Since I think my code is somehow clumsy, there is certainly a better way to make it smoother. With this I do not mean spaghetti code but more that it should be able to be made more loosely-coupled.

Analysis of choices made:
If class hierarchies could look in a different way? Yes it could. 
I initially had an inner class in the AiAlgoritms interface that had everything that had to do with the calculation. Then moved the inner class to abstractAi.
The database class you should certainly be able to have in model package. Personally, I think it belongs more to the controller because it controls everything that has to do with the database. You can see it as a smaller controller than GamePlay which is the major controller class.
I started trying to do a player factory to make player and AI but I soon realized that it became strange in my code, though it is possible to do that I realized later when I learned a little more about the factory method.
I've made the Human class to the singleton pattern, which gives you the advantage that you can only have one player, but it is also a disadvantage if you would like to develop this for multiplayer game.

I did the Factory Method on the Ai models anyway, which was a extra thing, most to see if I could do it and from that I learned that it should be possible to do that also to player class.
I also did the strategy pattern of AiAlgoritms or as I understand it anyway. It may be that I have misunderstood it all.

Differences and similarities with previous projects:
I have only used design patterns in one to project, but if you go further then I've started using more classes and interfaces against what I started a year ago. Then almost everything was in the main method.
But in the previous project (Monster-v2) I used singleton as well. I like the idea that it one should be one of this class.
Also tried to build the factory method with the singleton class, but it was a less good try. I read a bit about it too and people generally thought that this was completely unnecessary so I let it go for a later project.