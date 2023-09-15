I denna uppgift har jag använt mig utav 2 apier, Italian jokes och waifu api. På api sida 1 använder jag mig utav knappar som väljer olika bilder från apiet. Detta görs genom att länken som deklareras inte är komplett och sedan får de slutgiltiga delarna när knappen trycks. Jag har även en fake backstack som görs med home knappen, denna är också i api 2. Med hjälp av glide så läggs bilder och gifs in i imageviewen som är på sidan.
Jag har använt mig av json simple för det lokala sparade librariet för att kunna läsa json som kommer från apien. 
På api sidan två används ett textfält, 4 knappar för apiet och en knapp för att ta tillbaka till startsidan, jag använder mig utav setText för att sätta texten till det skämtet som apiet ger tillbaka från requesten. 
På mainActivity finns det en liten dold knapp som spelar upp ljud och samma sak finns på mainActivity2. 
Jag har signerat både en bundle och en apk fil och lagt de överst i githubben för enkel tillgång. 

På mainActivity så har jag en override som gör så att det inte går att backa ut från appen utan att använda hem eller trayen. Detta är ett medvetet val. 

Jag använde mig utav sfw delen av waifu api men det går aldrig att vara 100% säker på att det inte är något där som man inte har sett.
