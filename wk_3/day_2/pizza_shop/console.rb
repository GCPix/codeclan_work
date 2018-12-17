require("pry")
require_relative("./models/pizza_order")

PizzaOrder.delete_all()

order1 = PizzaOrder.new({
	'first_name' => "John",
	'last_name' => "McC",
	'quantity' => 1,
	'topping' => "Vegetarian"
})

order1.save()

order2 = PizzaOrder.new({
	'first_name' => "Colin",
	'last_name' => "Bell",
	'quantity' => 3,
	'topping' => "Kebab"
})

order2.save()

#order2.delete()

order1.topping = "Margherita"
order1.update()

orders = PizzaOrder.all() #this is a class method, belongs to the

binding.pry
nil
