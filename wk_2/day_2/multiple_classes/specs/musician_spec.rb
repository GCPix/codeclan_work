require('minitest/autorun')
require('minitest/rg')

require_relative('../musician')
require_relative('../instrument')

class MusicianTest < Minitest::Test

  def setup
    @guitar = Instrument.new("Guitar")
    @piano = Instrument.new("Piano")
    @musician1 = Musician.new("Jimi Hendrix", @guitar)
    @musician2 = Musician.new("Freddy Mercury", @piano)
  end

  def test_musician_has_name
    assert_equal("Jimi Hendrix", @musician1.name)
  end

  def test_musician_can_play_song__guitar
    assert_equal("I'm playing Hey Joe!", @musician1.play_song("Hey Joe"))
  end
  def test_can_play_song__piano
    assert_equal("Plink, plonk ... I'm playing Bohemian Rhapsody!", @musician2.play_song("Bohemian Rhapsody"))
  end
end
