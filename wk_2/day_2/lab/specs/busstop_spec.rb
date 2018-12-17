require('Minitest/autorun')
require('Minitest/rg')

require_relative('../bus')
require_relative('../passenger')
#unfinshed see class notes
class BusStopTest < Minitest::Test
  def setup
    @pass1 = Passenger.new("Melanie", 15)
    @pass2 = Passenger.new("Ailsa", 30)
    @pass3 = Passenger.new("Robert" 50)

    passenger = []
    @bus = Bus.new(22, "Foxbar", passengers)

    @busstop = BusStop.new("busstop1", [])
  end

  def test_add_to_queue
    @busstop.add_to_queue(
    assert_equal(0,
  end

end
