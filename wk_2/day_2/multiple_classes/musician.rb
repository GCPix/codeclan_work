class Musician

attr_reader :name

def initialize(name, instrument)
  @name = name
  @instrument = instrument
end

def play_song(title)
  @instrument.make_sound(title)

end

end
