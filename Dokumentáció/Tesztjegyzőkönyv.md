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
| Teszt #01 | Menü tesztelése | Kitudom választani a megfelelő játékmódot és az is valósul meg |  Kitudom választani a megfelelő játékmódot és az is valósul meg| Nem tapasztaltam hibát |
| Teszt #02 | Restart tesztelése | Restart után a főmenübe visz vissza |  Restart után a főmenübe visz vissza| Nem találtam hibát |
| Teszt #03 | Előző szám helyes kiírása | A tippelt előző számot helyesen írja ki |  Nem írja ki helyesen az előző tippelt számot| javítani kell |


**Tesztelő:** Ádám Zsombor

**Tesztelés dátuma:** 2024.Január.24.

| Tesztszám | Rövid leírás                     | Várt eredmény                                                                   | Eredmény                                                                       | Megjegyzés                |
|-----------|----------------------------------|---------------------------------------------------------------------------------|--------------------------------------------------------------------------------|---------------------------|
| Teszt #01 | Új kezdőképernyőn lévő haladó játékmód gomb lenyomása | Megjelenik a régi kezdő képernyő | megjelenik az új és a régi kezdőképernyő egyszerre| a gombhoz tartozó metódusban nem rejtettük el a megfelelő vboxot |
| Teszt #02 | alapjátékmód végigjátszása | a végigjátszás után a restart lenyomásával a kezdőképernyőre kerül a felhasználó | a végigjátszás után a restart lenyomásával választhatunk magunknak új számokat, de az eddigi számok memóriában maradnak | selectorvboxot kell a startvbox helyett láthatóvá tenni |
| Teszt #03 | egy játék végigjátszása | a végigjátszás után a restart lenyomásával a kezdőképernyőre kerül a felhasználó | a program megfelelően működik | az előző test után bugfix következett |


**Tesztelő:** Sipos Máté, Ádám Zsombor

**Tesztelés dátuma:** 2024.Január.25.

| Tesztszám | Rövid leírás                     | Várt eredmény                                                                   | Eredmény                                                                       | Megjegyzés                |
|-----------|----------------------------------|---------------------------------------------------------------------------------|--------------------------------------------------------------------------------|---------------------------|
| Teszt #01 | Teljes szoftver teszt | Minden helyesen hibátlanul működik. |  Minden helyesen hibátlanul működik.| Nem tapasztaltunk hibát |
