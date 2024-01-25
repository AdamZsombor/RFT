# Követelmény specifikáció
## 1. Áttekintés
***

Egy vidéki kisvárosi általáos iskola napközis csoportok oktató találták ki, hogy jó lenne játékosan tanítani az első osztályosokat a számok megismerésére ezért felkértek minket egy egyszerű számkitalálós játék lefejlesztésére.


## 2. Jelenlegi rendszer
***
A terem hátsó részében egy régi asztali számítógép van ami éppen hogy eltud futtatni valamit.
Erre szügséges egy:
-   egyszerű
-   letisztult
-   gyors
-   könnyű

játék, mivel több nem futtatódna a rendszeren. 

## 3. Vágyálom rendszer
***
A diákok megismerkednek a számokkal 1-100-ig a játék segítségével.
A gyorsabban tanulók tudnak állítani a nehézségen, úgy hogy saját maguk adják meg a tartományt.
versenyezhetőség: tudnak versenyezni egymással, ki milyen gyorsan találja meg a számot.
A felhasználó saját maga tudja beállítani a játék tartományát és, hogy meggyorsítsuk a rendszert a játék tippelés gombjait tudja irányítani az ENTER billentyűzettel is.

## 4. Funkcionális követelmény
***
Játékmód választás: A játékos kitudja választani milyen játékmódot akar játszani.

Alap játékmód - A játékos egy kattintással tudja kezdeni a játékot egy előre meghatározott skálaintervallumban.

Felhasználói funkció -  A felhasználó fel tudja venni a alső és felső határt.

Visszatérés: A felhasználó megtudja választani mit akar játszani egy lejátszott kör után

Ez után a játékos rapid módra betudja vinni a számokat.

## 5. Jelenlegi üzleti folyamatok modellje
***
A programunk 1 és 100 közötti számot generál
A fehasnáló betudja vinni a minimum és maximum értéket.

## 6. Igényelt üzleti folyamatok

A felhasználó fel tudja venni a alső és felső határt
Tudja használni mind a gombot mind az entert a játék kötben.
A felhasználó kitudja választani a neki kedvező játékmódot. 

## 7. Követelménylista
***
| Modul      | ID         | Név  |v. |  Kifejtés|
| ------------- |:-------------:| -----:|-|--|
| Felület   | K1 | Menü |1.1| A felhasználó kitudja választani a játékmódot|
|Modifikáció | K2 | határértékek megadása  |1.0| A felhasználó fel tudja venni a min és max határt |
| Felület| K3 | visszajelzés  | 1.0| a rendszer kiírja helyesen, hogy alacsonyabb vagy magasabb a keresett szám |
| Felület| K4 | Reset  |1.0|A felhasználó újratudja indítani a játékot a neki kedvező paraméterekkel |


## 8. Fogalomtár
***
rapid: a lehető leggyorsabban.