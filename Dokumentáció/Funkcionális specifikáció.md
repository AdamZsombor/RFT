
# Funkcionális specifikáció
## 1. Áttekintés
Egy olyan mini játék alkalmazást fejlesztettüknk ki amely legenerál egy random számot 1 és 50 között, majd a felhasználónak kell kitalálnia a számot. A játékban segítséget kap a játékos, hogy a keresett szám az kissebb vagy nagyobb.

## 2. Jelenlegi helyzet
A meglévő alap játékot szeretnénk kiegészíteni olyan funkciókkal, hogy a játékos saját maga tudja beállítani az alsó és felső határokat. Ezen felül hibakezelési módszereket kell még beépíteni a kódba, hogy a felhasználó ne tudjon megadni rossz adatokat.  

## 3. Jelenlegi üzleti folyamatok modellje
Egyszerű játék, ha nagy korlátokat állítasz be akkor, hogy a leggyorsabban megtalálja a játékos a keresett számot vagy szerencsésnek vagy logikusan kell gondolkoznia.


## 4. Követelménylista
Modifikáció:  A felhasználó megadja a minimum és maximum számot a játék kezdetén.
Bevitel: A felhasználó nem tud bevinni hibás adatokat.
Játék: a játék sikeresen letud fudni hiba nélkül.

## 5. Képernyőterv
<br>Kezdő ablak:<br>

![Képernyőterv](Screenshot01.png)
<br>Játék ablak:<br>

![Képernyőterv](Screenshot02.png)


## 6. Forgatókönyv
Futási időben kettő szereplő figyelhető meg.
Az egyik maga az alkalmazás, ami várja az input-ot, ami alapján a játék paraméterei beállíthatóak.
A másik szereplő a felhasználó, aki az ablakon elkhelyezett elemeket feltduja tölteni a kedve szerint.
Nem megfelelő adatok esetén a játék szól, a helytelenségről.

## 7. Fogalomszótár
input - Bemenet, amit az alkalmazás vár a felhasználótól<br> 
online - Leggyakrabban arra használják, ha valami megtalálható az interneten vagy valaki fel van kapcsolódva az internetre.
felhasználók - Azok a személyek, akiknek létre lett hozva egy alkalmazás és ők használják azt.
