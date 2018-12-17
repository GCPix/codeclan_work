DROP TABLE characters CASCADE;
DROP TABLE lightsabers;

CREATE TABLE characters (
  id SERIAL8 PRIMARY KEY,
  name VARCHAR(255),
  darkside BOOLEAN,
  age INT
);

CREATE TABLE lightsabers(
  id SERIAL8 PRIMARY KEY,
  colour VARCHAR(255) NOT NULL,
  hilt_metal VARCHAR(255) NOT NULL,
  character_id INT8 REFERENCES characters(id)
);

INSERT INTO characters (name, darkside, age)
  VALUES ('Obi-Wan Kenobi', false, 27);

INSERT INTO characters (name, darkside, age)
  VALUES ('Anakin Skywalker', false, 10);

INSERT INTO characters (name, darkside, age)
  VALUES ('Darth Maul', true, 32);

INSERT INTO characters (name, darkside)
  VALUES ('Yoda', false);

--UPDATE characters SET darkside = true;
UPDATE characters c SET darkside = true WHERE c.name = 'Anakin Skywalker';

UPDATE characters SET (name, darkside) = ('Darth Vader', true) WHERE name = 'Anakin Skywalker';

INSERT INTO characters(name, darkside, age)
  VALUES ('Luke Skywalker', false, 17);

UPDATE characters c SET age = 65 WHERE c.name = 'Obi-Wan Kenobi';

DELETE FROM characters c WHERE c.name = 'Darth Maul';

INSERT INTO characters (name, darkside, age)
  VALUES ('Stormtrooper', true, 25);
INSERT INTO characters (name, darkside, age)
  VALUES ('Stormtrooper', true, 25);
INSERT INTO characters (name, darkside, age)
  VALUES ('Stormtrooper', true, 25);
INSERT INTO characters (name, darkside, age)
  VALUES ('Stormtrooper', true, 25);
INSERT INTO characters (name, darkside, age)
  VALUES ('Stormtrooper', true, 25);

UPDATE characters c SET age = 29 WHERE id >7 AND id <=9; -- could also use between

INSERT INTO lightsabers(colour, hilt_metal, character_id) VALUES ('red', 'Titanium', 4);

INSERT INTO lightsabers(colour, hilt_metal, character_id) VALUES ('blue', 'Iron', 9);
INSERT INTO lightsabers(colour, hilt_metal, character_id) VALUES ('purple', 'Kryptonite', 1);
INSERT INTO lightsabers(colour, hilt_metal, character_id) VALUES ('yellow', 'Selenium', 1);
