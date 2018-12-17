require_relative("models/movie")
require_relative("models/star")
require_relative("models/casting")

require("pry-byebug")

Casting.delete_all()
Movie.delete_all()
Star.delete_all()

movie1 = Movie.new({"title" => "scream", "genre" => "horror", "budget" => 50000})
movie1.save
movie2 = Movie.new({"title" => "scream2", "genre" => "horror", "budget" => 40000})
movie2.save

star1 = Star.new({"first_name" => "john", "last_name" => "smith" })
star1.save
star2 = Star.new({"first_name" => "Jane", "last_name" => "Jones"})
star2.save
star3 = Star.new({"first_name" => "Sarah", "last_name" => "Geller" })
star3.save

casting1 = Casting.new({"fee" => 5000,"movie_id" => movie1.id, "star_id" => star1.id})
casting1.save
casting2 = Casting.new({"fee" => 6000,"movie_id" => movie2.id, "star_id" => star2.id})
casting2.save
casting3 = Casting.new({"fee" => 4000,"movie_id" => movie1.id, "star_id" => star3.id})
casting3.save

binding.pry
nil
