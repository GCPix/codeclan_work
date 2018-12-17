--types of joins

-- INNER Join, needs commonality cusomter_id and cusomter.id

SELECT c.* FROM customers c
  INNER JOIN pizza_orders po
  ON c.id = po.customer_id;

--   id |    name
-- ----+------------
--  1 | Colin Bell
--  3 | Debi Skea
-- (2 rows)

  SELECT po.* FROM pizza_orders po
    INNER JOIN customers c
    ON c.id = po.customer_id;

   --  id | customer_id |  topping  | quantity
   -- ----+-------------+-----------+----------
   --   1 |           1 | pineapple | 3
   --   2 |           3 | ham       | 1
   -- (2 rows)


-- if I want information from both tables
   SELECT po.*, c.* FROM pizza_orders po
     INNER JOIN customers c
     ON c.id = po.customer_id;

--customer name and pizza topping

SELECT c.name AS full_name, po.topping FROM customers c INNER JOIN pizza_orders po ON  c.id = po.customer_id;

-- LEFT JOIN & RIGHT Join
SELECT c.*, po.*
FROM customers c LEFT JOIN pizza_orders po ON c.id = po.customer_id;
