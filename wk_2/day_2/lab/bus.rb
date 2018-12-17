class Bus


def initialize (route_number, destination, passengers)
  @route_number = route_number
  @destination = destination
  @passengers = passengers
end

  def drive
    return "brumm, brumm"
  end

  def passenger_count
    return @passengers.length
  end

  def add_passenger(passenger)
    @passengers << passenger
  end

  def remove_passenger(passenger)
    for pass in @passengers
      if pass == passenger
        @passengers.delete(passenger)
      end
    end
  end

  def remove_all_passengers
    @passengers = []
  end 
end
