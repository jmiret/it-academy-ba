USE usairlineflights2;

/* querie_1: Quantitat de registres de la taula de vols. */
SELECT COUNT(*) FROM flights;

/* querie_2: Retard promig de sortida i arribada segons l’aeroport origen. */
SELECT Origin, AVG(flights.ArrDelay) AS prom_arribades, AVG(flights.DepDelay) AS prom_sortides FROM flights GROUP BY Origin ORDER BY Origin ASC;  

/* querie_3: Retard promig d’arribada dels vols, per mesos, anys i segons l’aeroport origen. A més, volen que els resultat es mostrin de la següent forma (fixa’t en l’ordre de les files): */
SELECT Origin, colYear, colMonth, AVG(flights.ArrDelay) AS prom_arribades FROM flights GROUP BY colYear, colMonth, Origin ORDER BY Origin, colYear, colMonth ASC; 

/* querie_4: 4.	Retard promig d’arribada dels vols, per mesos, anys i segons l’aeroport origen (mateixa consulta que abans i amb el mateix ordre). 
Però a més, ara volen que en comptes del codi de l’aeroport es mostri el nom de la ciutat.*/
SELECT usairports.City, flights.colYear, flights.colMonth, AVG(flights.ArrDelay) AS prom_arribades 
FROM flights, usairports 
WHERE flights.origin = usairports.IATA
GROUP BY colYear, colMonth, Origin 
ORDER BY City, colYear, colMonth ASC; 

SELECT usairports.City, flights.colYear, flights.colMonth, AVG(flights.ArrDelay) AS prom_arribades 
FROM flights 
	INNER JOIN usairports
	ON flights.origin = usairports.IATA
GROUP BY colYear, colMonth, Origin 
ORDER BY City, colYear, colMonth ASC; 

/* querie_5: Les companyies amb més vols cancelats, per mesos i any. A més, han d’estar ordenades de forma que les companyies amb més cancel·lacions apareguin les primeres. */
SELECT UniqueCarrier, colYear, colMonth, Cancelled AS total_cancelled
FROM flights
ORDER BY Cancelled DESC, colYear ASC, colMonth;

SELECT UniqueCarrier, colYear, colMonth, SUM(Cancelled) AS total_cancelled
FROM flights
GROUP BY colMonth, colYear
ORDER BY total_cancelled DESC;

/* querie_6: L’identificador dels 10 avions que més distància han recorregut fent vols. */
SELECT TailNum, SUM(Distance) totalDistance 
FROM flights 
WHERE TailNum != ""
GROUP BY TailNum 
ORDER BY totalDistance DESC LIMIT 10;

/* querie_7: Companyies amb el seu retard promig només d’aquelles les quals els seus vols arriben al seu destí amb un retràs promig major de 10 minuts.*/
SELECT flights.UniqueCarrier, AVG(flights.ArrDelay) AS avgDelay
FROM flights
GROUP BY UniqueCarrier 
HAVING AVG(ArrDelay) > 10
ORDER BY avgDelay DESC;  

SELECT flights.UniqueCarrier, AVG(flights.ArrDelay) AS avgDelay
FROM flights
GROUP BY UniqueCarrier 
HAVING avgDelay > 10
ORDER BY avgDelay DESC;  

