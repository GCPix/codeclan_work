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

# # print out all the names using a loop then an enumerable
#
# for pet in pets
#   p pet[:name]
#
# end
#
# pets.each{|pet| p pet[:name]}
#
# # fine a pet using a loop then an enumerable
#
result = nil

for pet in pets
  if pet == "Merlin"
    result = pet
  end
end

result2 = pets.find{|pet| pet[:name] == "Merlin"}

result1=nil
  pets.each do |pet|
    if pet[:name] == "Merlin"
      result1 = pet
    end
  end

  p result
  p result1
  p result2
