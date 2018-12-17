## Task: using enumerable methods:
## 1. Find the pet which breed is Husky
## 2. Make an array of all of the pets' names
## 3. Find out if there are any pets of breed 'Dalmation' (true or false)
## 4. Find the most expensive pet i.e. pet with the highest/maximum price
## 5. Find the total value (price) of all of the pets added together.
## 6. Change each pet so their price is 50% cheaper

pets = [
{
    name: "Sir Percy",
    pet_type: :cat,
    breed: "British Shorthair",
    price: 500
},
{
    name: "King Bagdemagus",
    pet_type: :cat,
    breed: "British Shorthair",
    price: 500
},
{
    name: "Sir Lancelot",
    pet_type: :dog,
    breed: "Pomsky",
    price: 1000,
},
{
    name: "Arthur",
    pet_type: :dog,
    breed: "Husky",
    price: 900,
},
{
    name: "Tristan",
    pet_type: :dog,
    breed: "Basset Hound",
    price: 800,
},
{
    name: "Merlin",
    pet_type: :cat,
    breed: "Egyptian Mau",
    price: 1500,
}
]

## 1. Find the pet which breed is Husky

pet_detail = pets.find{|pet| pet[:breed] == "Husky"}
p pet_detail

## 2. Make an array of all of the pets' names

pet_name_array = pets.map{|pet| pet[:name]}

p pet_name_array

## 3. Find out if there are any pets of breed 'Dalmation' (true or false)

pet_search_breed = pets.any?{|pet| pet[:breed] == "Dalmation"}

p pet_search_breed

## 4. Find the most expensive pet i.e. pet with the highest/maximum price

# most_expensive_pet = pets.each{|pet|
#   {pet.each{|name, pet_value| value = 0
#     if pet_value > value
#       pet.map{|name, pet_value| value = pet_value}
#     end
#     }
#   }
#
#   p most_expensive_pet[:name]

p pets.max_by{|pet| pet[:price]}



  ## 5. Find the total value (price) of all of the pets added together.

  prices = pets.map{|p| p[:price]}
    prices.reduce{|sum, price| sum + price}
  ## 6. Change each pet so their price is 50% cheaper

  p pets.each{|pet| pet[:price] /=2}
