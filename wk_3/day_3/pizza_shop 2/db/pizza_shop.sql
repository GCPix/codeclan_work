DROP TABLE IF EXISTS customers;
DROP TABLE IF EXISTS pizza_orders; -- need to understand CASCADE this doesn't work if the two drop commands are the wrong way round.



CREATE TABLE customers(
  id SERIAL4 PRIMARY KEY,
  name VARCHAR(255)
);

CREATE TABLE pizza_orders (
  id SERIAL4 PRIMARY KEY,
  topping VARCHAR(255),
  quantity INT2,
  customer_id INT4 REFERENCES customers(id)

);
