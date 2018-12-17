require('sinatra')
require('sinatra/contrib/all')
require('pry')

require_relative('./models/calculator')
also_reload('./models/*')#this is to tell sinatra to relaod files from models if any update is made

get '/' do
  erb(:home)

end

get '/about_us' do
  erb(:about_us)
end
get '/add/:num1/:num2' do

  calculator = Calculator.new(params[:num1].to_i, params[:num2].to_i) #params are string so need to change to integer
  @calculation = calculator.add() #do not use return here otherwise nothing will happen
  erb(:result)
end

get '/subtract/:num1/:num2' do
  calculator = Calculator.new(params[:num1].to_i, params[:num2].to_i)
  @calculation = calculator.subtract()
  erb(:result)
end

get '/multiply/:num1/:num2' do
  calculator = Calculator.new(params[:num1].to_i, params[:num2].to_i)
  @calculation = calculator.multiply()
  erb(:result)
end

get '/divide/:num1/:num2' do
  calculator = Calculator.new(params[:num1].to_i, params[:num2].to_i)
  @calculation = calculator.divide()
  erb(:result)
end
