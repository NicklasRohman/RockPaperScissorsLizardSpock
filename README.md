# RockPaperScissorsLizardSpock

Dag 1: Kopplat till databas, arbetat med GUI, NameBox f�rdig, lite css, Quitfunktion gjord.
Dag 2: Gjort mer css kod, Fixat f�rdigt helpBox knappens funktion. M�rkt att inte Quit funktionen inte fungerar helt hundra.
Dag 3: Kan nu l�gga in spelare i databasen, ska fundera ut ett b�ttre s�tt att l�gga in spelare bara.
Dag 4: Suttit med att f�rs�ka f� fram v�rdena och hur man tillverkar en spelare p� en bra s�tt.
Dag 5: Gjort en resultBox �nnu inte testad eller helt klar, �ndrat om player funktionen till en singelton i st�llet f�r en factory, fungerade inte som jag ville i detta l�get kanske g�r att bygga om det senare till factory. har arbetat med Sql f�r savePlayer() men den fungerar inte �nnu.
Dag 6:
Dag 7:
Dag 8:
Dag 9:
Dag 10:
Dag 11:
Dag 12:


Ska g�ras:
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