require('minitest/autorun')
require('minitest/rg')

require_relative('../band')
require_relative('../musician')
require_relative('../instrument')

#although instrument is used in musician it isn't required so needs done here #too

class BandTest < Minitest::Test
  def setup
    drums = Instrument.new("drums")
    @meg = Musician.new("Meg White", drums)
    guitar = Instrument.new("guitar")
    piano = Instrument.new("Piano")
    @jack = Musician.new("Jack White", guitar)
    @gillian = Musician.new("Gillian", piano)

    @band = Band.new("The White Stripes", [@meg, @jack])

    @band2 = Band.new("Lifehouse", [@meg, @jack, @gillian])
  end

  def test_band_has_name
    assert_equal("The White Stripes", @band.name)
  end

  def test_band_can_play_song
    #act
    expected = ["I'm playing Seven Nation Army!", "I'm playing Seven Nation Army!"]

     actual = @band.perform("Seven Nation Army")

     assert_equal(expected, actual)


  end

  def test_band_can_play_song_w_piano
    expected = ["I'm playing You and Me!", "I'm playing You and Me!", "Plink, plonk ... I'm playing You and Me!"]

     actual = @band2.perform("You and Me")

     assert_equal(expected, actual)
  end
end
