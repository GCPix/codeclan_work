require("pry")
require_relative("../models/pizza_order")
require_relative("../models/customer")

# PizzaOrder.delete_all()
# Customer.delete_all()

customer1 = Customer.new({"name" => "Gillian"})
customer1.save()

order1 = PizzaOrder.new({
  "topping" => "meaty",
  "quantity" => 1,
  "customer_id" => customer1.id
  })

  order2 = PizzaOrder.new({
    "topping" => "pepperoni",
    "quantity" => 1,
    "customer_id" => customer1.id
    })

order1.save()
order2.save()
order1.topping = "Margherita"
order1.update()
binding.pry
nil
