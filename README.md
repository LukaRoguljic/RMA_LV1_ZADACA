# RMA_LV1_ZADACA

Kreirati jednostavnu aplikaciju koja nudi
informacije o tri osobe iz povijesti računarstva koje Vas inspiriraju i za koje smatrate da
su imale važan utjecaj. Za svaku osobu potrebno je staviti sliku, datum rođenja/smrti, i
kratak životopis. Definirati klik na sliku koji ispisuje nasumičan citat te osobe u obliku
Toast poruke, citate je moguće spremiti u XML datoteku u obliku polja stringova.
Aplikaciju je potrebno testirati na barem dva uređaja (stvarna ili virtualna), te osmisliti
ikonu.

## Komentar na rješavanje

Aplikacija je rađena u relativnom layout-u. Korištenjem XML smo odredili izgled activitiy-a. View je podijeljen na tri dijela tako da svaki dio sadrži <ImageView> i desno od slike se nalazi
<TextView> koji je okružen sa <ScrollView> tako da korisnik može listati životopis navedenog znanstvenika. Klikom na sliku se pojavljuje 
toast poruka koja ovisno o dužini rečenice je LONG ili SHORT. Jedini problem na koji sam imao prilikom izrade aplikacije je taj da je <ImageView> također isto bio obavijen 
sa <ScrollView> tako da nikako nisam mogao kliknuti na sliku da mi se ispiše toast poruka , ali uvidom u dizajn prozor aplikacije taj problem je ubrzo riješen.

StackOverflow je korišten kao pomoć pri rješavanju ove zadaće, ali i znanja stečena na prvoj vježbi.

## Razvojna okruženja i tehnologije

*  Android Studio - Razvojna platforma
*  JAVA i XML - Tehnologije
*  Genymotion, Oravcle VM VirtualBox - Simulacija uređaja
*  Vivax Fly 4 - Stvarni uređaj za testiranje aplikacije

## Izgled aplikacije

![alt text](https://i.imgur.com/xz4eWaG.png)


