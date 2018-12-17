require('Minitest/autorun')
require('Minitest/rg')

require_relative('../bus')
require_relative('../passenger')

class BusTest < Minitest::Test


  def setup
    @pass1 = Passenger.new("Sleepy", 101)
    @pass2 = Passenger.new("Doc", 97)
    @pass3 = Passenger.new("Grumpy", 123)
    @pass4 = Passenger.new("Sneezy", 82)
    passengers = [@pass1, @pass2, @pass3]
    @bus = Bus.new(90, "Foxbar", passengers)

    #passengers = [@pass1, @pass2, @pass3]

  end

  def test_drive
    expected = "brumm, brumm"
    actual = @bus.drive

    assert_equal(expected, actual)
  end
  def test_passenger_count
      expected = 3
      result = @bus.passenger_count

      assert_equal(expected, result)
  end

  def test_add_passenger
    #find passenger from passenger class

    @bus.add_passenger(@pass4)
    #add passenger to @bus.passengers
    assert_equal(4, @bus.passenger_count)

  end

  def test_remove_passenger

      @bus.remove_passenger(@pass2)
    assert_equal(2, @bus.passenger_count)
  end

  def test_remove_all_passengers
    @bus.remove_all_passengers

    assert_equal(0, @bus.passenger_count)
  end
end
