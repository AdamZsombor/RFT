
# Rendszerterv
## 1. A rendszer célja
A rendszer célja, hogy a felhasználó letudja futtatni a játékot minden hiba nélkül, ahol saját maga tudja megadni az adatokat és a játék végén újratudja kezdeni a játékot akár új adatokka. 
## 2. Projektterv
### 2.1 Projektszerepkörök, felelősségek:
Product owner: Sipos Máté

Scrum masters: Ádám Zsombor
### 2.2 Projektmunkások és felelősségek:
Design: Sipos Máté

Developer: Sipos Máté , Ádám Zsombor

Tesztelő: Sipos Máté , Ádám Zsombor

## 3. Követelmények
Funkcionális követelmények:
Felhasználó által megadott adatok hibátlan működése,
Java környezeten való működés.


## 4. Funkcionális terv
### 4.1 Rendszerszereplők:
Felhasználó
### 4.2 Rendszerhasználati esetek és lefutásaik:
Feltöltheti a kívánt tartományt.

Tippelhet számokat.

Újraindíthatja a játékot.
### 4.3 Menühierarchiák:
Main ablak:

tartomány megadása.

játékindítás.

## 5. Fizikai környezet
Az alkalmazás asztali számítógépre, Windows operációs rendszerre készül.

Nincsenek megvásárolt komponenseink.

Fejlesztői eszközök:
IntelIJ community edition.
## 6. Architekturális terv
Az alkalmazásnak nincs szüksége adatbázis rendszerre, illetve keretrendszerre.
## 7. Implementációs terv
IntelIJ / JAVA: Az alkalmazás felületét Java scene, az alkalmazást működtető kódot Java-ban írjuk meg.
## 9.Tesztterv
A tesztelések célja a rendszer és komponensei funkcionalitásának teljes vizsgálata, ellenőrzése, a rendszer által megvalósított üzleti szolgáltatások verifikálása.

Tesztelési eljárások

Unit teszt: Ahol csak lehetséges, szükséges már a fejlesztési idő alatt is tesztelni, hogy a kódrészletek megfelelően működnek-e. Az alkalmazás akkor van kész, ha a tesztesetek hiba mentesen lefutnak minden esetben.

Alfa teszt: A teszt elsődleges célja: az eddig meglévő funkcióknak a különböző asztali gépekkel és laptopokkal való kompatibilitásának tesztelése. A tesztet a fejlesztők végzik. Az eljárás sikeres, ha a különböző gépeken megfelelően működnek a különböző funkciók. A teszt időtartama egy hét.

Beta teszt: Ezt a tesztet nem a fejlesztők végzik.

Tesztelendő Windows rendszerek: Windows 10, vagy újabbak.

A tesztelés időtartama maximum egy hét.

A tesztelés alatt a tesztelő felhasználók visszajelzéseket küldhetnek a fejlesztőknek, probléma/hiba felmerülése esetén.

Ha hiba lép fel, a fejlesztők kijavítják a lehető leghamarabb. Sok hiba esetén a tesztelés ideje elhúzódhat plusz egy héttel.

Tesztelendő funkciók

Nem vihet fel helytelen adatokat a rendszerbe

Képesnek kell kezelnie minden gombot és az enter billentyűt tippelésnél

Újre lehessen indítani a játékot.


## 10. Karbantartási terv
Az alkalmazás folyamatos üzemeltetése és karbantartása, mely magában foglalja a programhibák elhárítását, a belső igények változása miatti módosításokat, valamint a környezeti feltételek változása miatt megfogalmazott program-, illetve állomány módosítási igényeket. Ellenőrizni kell, hogy a jövőben kiadott Windows verziókkal kompatibilis-e az alkalmazás. Idő elteltével új opciókat kell hozzáadni a felülethez, hogy fent tartsuk az érdeklődési szintet.

Karbantartás:

Corrective Maintenance: A felhasználók által felfedezett és "user reportban" elküldött hibák kijavítása.

Adaptive Maintenance: A program naprakészen tartása és finomhangolása.

Perfective Maintenance: A szoftver hosszútávú használata érdekében végzett módosítások, új funkciók, a szoftver teljesítményének és működési megbízhatóságának javítása.

Preventive Maintenance: Olyan problémák elhárítása, amelyek még nem tűnnek fontosnak, de később komoly problémákat okozhatnak.
