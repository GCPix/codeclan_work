require('Minitest/autorun')
require('Minitest/rg')

require_relative('../passenger')

class PassengerTest < Minitest::Test

  def setup
    @passenger1 = Passenger.new("Gillian", 20)
    @passenger2 = Passenger.new("Peter", 50)
    @passenger3 = Passenger.new("Natalie", 30)
  end

  def test_get_passenger_name
    assert_equal("Gillian", @passenger1.name)
  end


end
