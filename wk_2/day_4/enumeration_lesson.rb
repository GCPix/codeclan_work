#see enumerable in ruby-docs

chickens = ["marg", "polly", "pete"]

#if it is a single line .each use {} if more than one should use do and end
chickens.each { |chick|
  shouting_chicken = chick .upcase()

  p shouting_chicken
}

#using map in enumeration
name_lengths = chickens.map {|chick| chick.length}
p name_lengths


#map allows you to get it to do something and return the output as a new array

chickens.each_with_index{|chick, index| p "#{chick} is at index #{index}"} # will return name and index


p chickens.find{|chick| chick[0] == "p"} #returns the first one it finds

p chickens.find_all{|chick| chick[0] == "p"} #returns an array of all values

numbers = [1,2,3,4,5,6,7,8,9,10]

p numbers.reduce{|sum, number| sum + number} #sum keeps track of the the sum as you go along so sum = 0, add 1.  sum is now 1, number is 2.  sum is now 3, number is now 3.

p numbers.reduce{|sum, number| sum - number**2}#second example of the reduce, simple terms reduce reduces all numbers in the array to 1 using whatever calculation you have set.

letters = ["a", "b", "c"]

p letters.reduce{|word, letter| word + letter}
