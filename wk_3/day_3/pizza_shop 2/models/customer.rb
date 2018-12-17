require('pg')
require_relative('../db/sql_runner')

class Customer
attr_reader :id, :name

  def initialize(options)
    @id = options["id"].to_i if options["id"]
    @name = options["name"]

  end

    def save()
      sql = "INSERT INTO customers(name) VALUES ($1) RETURNING id"

      values = [@name]
      result = SqlRunner.run(sql, values)
      @id = result[0]["id"].to_i
    end
# if you want to do something to a number of rows, make it a class method (self is just saying this is a method belonging to this class
    def self.delete_all()

      sql = "DELETE FROM customers"
      SqlRunner.run(sql)

    end

    def self.all()
      sql = "SELECT * FROM customers"
      customers = SqlRunner.run(sql) #this will give you back a postgress object (thing with tuples)
      return customers.map{|customer_hash| Customer.new(customer_hash)}
    end

    def pizza_orders()
      sql = "SELECT * FROM pizza_orders WHERE customer_id = $1"

      values = [@id]

      orders = SqlRunner.run(sql, values)

      return orders.map{|order_hash| PizzaOrder.new(order_hash)}

    end
end
