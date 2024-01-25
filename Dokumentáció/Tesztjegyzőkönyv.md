 | Teszteset               | Elvárt eredmény                                                                                                     | 
 |-------------------------|---------------------------------------------------------------------------------------------------------------------| 
 | Helytelen adat megadása | A művelet nem hajtódik végre. Üzenetben jelezni a felhasználónak, hogy miért és milyen adatok megadásával történhet.|
 | Helyes adat megadása    | Megtörténik a művelet.                                                                                              | 
 | ... | ... | 

#### Ezeket a teszteseteket végrehajtani a legtöbb kombinációval


**Tesztelő:** Sipos Máté

**Tesztelés dátuma:** 2024.Január.18.

| Tesztszám | Rövid leírás                     | Várt eredmény                                                                   | Eredmény                                                                       | Megjegyzés                |
|-----------|----------------------------------|---------------------------------------------------------------------------------|--------------------------------------------------------------------------------|---------------------------|
| Teszt #01 | A játék helyesen generálja le a számot és helyes visszajelzést ad | A játék a megadott tartomásnyban műküdik és helyes visszajelzést ad | A játék a megadott tartomásnyban műküdik és helyes visszajelzést a| Kikell pótolni, hogy a felhasználó saját maga tudja beírni a számokat!   |
| Teszt #02 | A játékot hibátlanul újralehet indítani, új számmal. | Művelet végre hajtódik . A képernyőről eltűnik az előző játék| Művelet végre hajtódik . A képernyőről eltűnik az előző játék |  Nem találtam problémát. |
| Teszt #03 | Enterrel lehet számokat bevinni | A művelet végrehajtódik. | Az enterrel nem csinál semmit | Javításra szorul. |

**Tesztelő:** Ádám Zsombor

**Tesztelés dátuma:** 2024.Január.21.

| Tesztszám | Rövid leírás                     | Várt eredmény                                                                   | Eredmény                                                                       | Megjegyzés                |
|-----------|----------------------------------|---------------------------------------------------------------------------------|--------------------------------------------------------------------------------|---------------------------|
| Teszt #01 | A játék rendeltetésszerű használata | Az eltalálandó szám a megadott minimum és maximum szám között van | Az eltalálandó szám nem megfelelő tatományban van | A random szám maximum értékéből nem volt kivonva a minimum érték, ez okozta a hibát, javításra került.   |
| Teszt #02 | A felhasználói felületen megjelenő string vizsgálata | a felhasználói felületen nyelvtani szabályoknak megfelelően jelennek meg az instrukciók | az instrukcióból hiányzik több szóköz is | a string interpolációban nem volta szóközök beszúrva, ezzel esztétikai hibát okozva |
| Teszt #03 | Enterrel lehet számokat bevinni | A művelet végrehajtódik. | A művelet végrehajtódik. | Nem találtam problémát. |
| Teszt #04 | Nem megfelelő adat beírása a felhasználó input mezejébe | Hiba üzenet tájokaztatja a felhasználót arról hogy a megadott értékek nem helyesek | Hiba üzenet tájokaztatja a felhasználót arról hogy a megadott értékek nem helyesek | Nem találtam problémát. |


**Tesztelő:** Sipos Máté

**Tesztelés dátuma:** 2024.Január.25.

| Tesztszám | Rövid leírás                     | Várt eredmény                                                                   | Eredmény                                                                       | Megjegyzés                |
|-----------|----------------------------------|---------------------------------------------------------------------------------|--------------------------------------------------------------------------------|---------------------------|
| Teszt #01 | xxxxxxxxxx | xxxxxxxxxxx |  xxxxxxxxxxxxxx| xxxxxxxxxxxx |
| Teszt #02 | xxxxxxxxxx | xxxxxxxxxxx |  xxxxxxxxxxxxxx| xxxxxxxxxxxx |
| Teszt #03 | xxxxxxxxxx | xxxxxxxxxxx |  xxxxxxxxxxxxxx| xxxxxxxxxxxx |



