require("pg")

class PizzaOrder
	attr_accessor :first_name, :last_name, :quantity, :topping

	attr_reader :id
	def initialize(options)
		@id = options["id"].to_i if options["id"]
		@first_name = options["first_name"]
		@last_name = options["last_name"]
		@quantity = options["quantity"].to_i
		@topping = options["topping"]
	end

	def save() # create
		db = PG.connect({ dbname: "pizza_shop", host: "localhost" })


		sql = "INSERT INTO pizza_orders
			(first_name, last_name, quantity, topping)
			VALUES
			($1, $2, $3, $4)
			RETURNING *" #RETURNING * everythings, you could just return the id


			values = [@first_name, @last_name, @quantity,@topping
			] #this is used to stop sql injection breaking our database?????

		db.prepare('save', sql)
		@id = db.exec_prepared('save', values)[0]["id"].to_i
		db.close()

	end

	def delete()
		db = PG.connect({dbname: "pizza_shop", host: "localhost"})

		sql = "DELETE FROM pizza_orders WHERE id = $1"

		values = [@id]
		#even when only one thing this needs to be an array

		db.prepare("delete_one", sql)

		db.exec_prepared("delete_one", values)

		db.close()
	end
		def PizzaOrder.all() #aka read

			#this is where the class method is written.  needs to have the class name.whatever

			db = PG.connect({dbname: "pizza_shop", host: "localhost"})

			sql = "SELECT * FROM pizza_orders"

			db.prepare("all", sql) #need require pg for this
			orders = db.exec_prepared("all") #need require pg for this
			db.close()

			return orders.map{|order_hash| PizzaOrder.new(order_hash)}
		end

		def update()
			db = PG.connect({dbname: "pizza_shop", host: "localhost"})

			sql = "UPDATE pizza_orders SET (first_name, last_name, quantity,topping) = ($1, $2, $3, $4) WHERE id = $5"

			values = [@first_name, @last_name, @quantity, @topping, @id]

			db.prepare("update", sql)
			db.exec_prepared("update", values)

			db.close()
		end
		def PizzaOrder.delete_all()
			db = PG.connect({dbname: "pizza_shop", host: "localhost"})

			sql = "DELETE FROM pizza_orders"

			db.prepare("delete_all", sql)

			db.exec_prepared("delete_all")

			db.close()
		end
end
