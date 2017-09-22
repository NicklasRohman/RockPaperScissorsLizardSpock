# RockPaperScissorsLizardSpock

Dag 1: Kopplat till databas, arbetat med GUI, NameBox färdig, lite css, Quitfunktion gjord.
Dag 2: Gjort mer css kod, Fixat färdigt helpBox knappens funktion. Märkt att inte Quit funktionen inte fungerar helt hundra.
Dag 3: Kan nu lägga in spelare i databasen, ska fundera ut ett bättre sätt att lägga in spelare bara.
Dag 4: Suttit med att försöka få fram värdena och hur man tillverkar en spelare på en bra sätt.
Dag 5: Gjort en resultBox ännu inte testad eller helt klar, ändrat om player funktionen till en singelton i stället för en factory, fungerade inte som jag ville i detta läget kanske går att bygga om det senare till factory. har arbetat med Sql för savePlayer() men den fungerar inte ännu.
Dag 6:
Dag 7:
Dag 8:
Dag 9:
Dag 10:
Dag 11:
Dag 12:


Ska göras:
Save sql fungerar inte 





//For the Rock-Paper-Scissor-Spock-Lizard version:
//
//Let's assign a number to each move (0, 1, 2, 3, 4).
//
//Notice that every move beats two moves:
//
//The move previous to it in the cycle (or four cases ahead)
//The move two cases ahead in the cycle
//So let d = (5 + a - b) % 5. Then:
//
//d = 1 or d = 3 => a wins
//d = 2 or d = 4 => b wins
//d = 0 => tie