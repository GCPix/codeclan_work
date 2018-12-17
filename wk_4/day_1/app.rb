require('sinatra')
require('sinatra/contrib/all')

get '/hi' do #/hi is the root
  return "Hello me"

end

# each of the webserver methods uses the following format
# verb path do
#   do something
# end

get "/roll-die" do
  return "rolling the die.. #{(rand 1...7)}"
end

get "/name/:first/:last" do #anything predixed with a colon on url is placeholder for user input (it actually comes up as a hash
  #return params.to_s  #this allows you to access the hash (params) to work with the data.  You always want to use the word params
  return "Your name is #{params[:first]} #{params[:last]}"
end
# enter http://localhost:4567/name/Gillian/Campbell in the address bar it will show "first => "Gilian", "last" => "Campbell"

get "/friends/:number" do
  friends = ["joey", "phoebe", "Monica", "Chandler", "rachel", "Ross"]
  index = params["number"].to_i - 1
  return friends[index]
end #in address bar change :number to the actual number it will print the friends name

get "/square/:num" do
  num = params[:num].to_i
    return "number squared = #{num **2}"
end

get "/pet/:hello" do
  "Hello pet"

end
#we need the/name in the middle of the one below sot hat it can differentiate between this and the one above otherwise it can't see thd difference.
get '/pet/name/:name' do
  "Hello #{params[:name]}"
end
