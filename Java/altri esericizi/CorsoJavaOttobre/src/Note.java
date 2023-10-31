
public class Note {
	
	/*
	 * in questa classe saranno elencate tutte le cose fatte su workbench 
	 */
	
//	
//	
//	
//	workbench
//
//	/* togliere la flag */
//
//	SET GLOBAL sql_mode=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY',''));
//
//	/* rimettere la flag */
//
//	SET sql_mode = 'ONLY_FULL_GROUP_BY';
//
//
//
//
//
//	ESERCIZIO
//
//	SELECT Name, Population
//	FROM city
//	WHERE CountryCode = 'ITA'
//	order by Population DESC
//	LIMIT 1;
//
//	ALTRI ESERCIZI
//
//	/* SELECT Name
//	FROM city
//	WHERE name LIKE 's%a'
//	*/
//	/*
//	SELECT Name
//	FROM city
//	WHERE length(Name) >= 5;
//	*/
//	/*
//	SELECT Name
//	FROM city
//	WHERE Name Like '%to%'
//	*/
//	/*
//	SELECT Name
//	FROM city
//	WHERE name LIKE '__n_m%'
//	*/
//	/*
//	SELECT Name
//	FROM city
//	WHERE REGEXP_LIKE(Name, 'n[ˆ -à]');
//	*/
//
//
//	SELECT Name, Region, Continent, LifeExpectancy
//	FROM COUNTRY
//	WHERE Continent IN ('north america', 'south america')  AND LifeExpectancy >= 70 
//	order by LifeExpectancy ASC
//
//	SELECT country.name, country.IndepYear, country.GovernmentForm
//	FROM country
//	WHERE country.IndepYear between '1500' and '1900' and country.GovernmentForm IN ('republic')
//
//
//	/*
//	SELECT city.name, country.name, country.IndepYear
//	FROM city
//	INNER JOIN country
//	ON city.CountryCode = country.code 
//	Order by country.IndepYear ASC;
//	*/
//	SELECT country.name, countryCode, Language, isOfficial
//	FROM country
//	INNER JOIN countrylanguage
//	ON country.Code = countrylanguage.countryCode
//	WHERE countrylanguage.IsOfficial = 'T'
//	GROUP BY country.name
//	-- ORDER BY country.name ASC;
//
//
//
//	SELECT
//	    country.Name AS Paese,
//	    countryLanguage.Language AS Lingua,
//	    countryLanguage.Percentage AS '%'
//	FROM
//	    country
//	INNER JOIN
//	    countrylanguage countryLanguage
//	ON
//	    country.Code = countryLanguage.CountryCode
//	WHERE
//	    countryLanguage.Percentage = (
//	        SELECT MAX(Percentage)
//	        FROM countrylanguage
//	        WHERE CountryCode = country.Code
//	    );
	
	
	
	/*
	 * SHOP ONLINE DB
	 */
	
	
//	
//	
//	shop online db
//
//	CREATE DATABASE shop_online;
//
//	USE shop_online;
//
//	CREATE TABLE clienti (
//	  EmailCliente INT,
//	        Username VARCHAR(250),
//	        Nome VARCHAR(250),
//	        Cognome VARCHAR(250),
//	        Indirizzo VARCHAR(250)
//	);
//	CREATE TABLE ordini (
//	  id_ordine INT,
//	        email_cliente VARCHAR(255),
//	        data_ordine DATE,
//	        costo_totale FLOAT
//	);
//	CREATE TABLE prodotti(
//	  id_prodotto INT,
//	        marca VARCHAR(255),
//	        modello VARCHAR(255),
//	        descrizione VARCHAR(255),
//	        prezzo FLOAT
//	);
//	CREATE TABLE magazzino (
//	  id_prodotto INT,
//	        quantita INT
//	);
//	CREATE TABLE  prodotti_ordinati(
//	  id_ordine INT,
//	        id_prodotto INT,
//	        quantita INT
//	);
//
//	/*
//
//	SELECT * 
//	FROM shop_online.prodotti
//	WHERE prezzo > 15;
//
//
//
//
//	CREATE VIEW disponibilita_magazzino AS
//	SELECT prodotti.id_prodotto, marca, modello, CASE WHEN magazzino.quantita IS NULL THEN 'non catalogato'
//								WHEN magazzino.quantita <= 0 THEN 'prodotto terminato'
//	                            ELSE 'in stock' END AS 'disponibilita'
//	FROM prodotti
//	LEFT JOIN magazzino
//	ON prodotti.id_prodotto = magazzino.id_prodotto
//
//
//	*/
//	
//	
//	
	

}
