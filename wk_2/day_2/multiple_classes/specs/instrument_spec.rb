require ('minitest/autorun')
require ('minitest/rg')

require_relative('../instrument')

class InstrumentTest < Minitest::Test

  def setup
    @instrument = Instrument.new("Guitar")
    @piano = Instrument.new("Piano")
  end

  def test_has_type
    assert_equal("Guitar", @instrument.type)
  end

  def test_can_make_sound__guitar()
    assert_equal("I'm playing Stairway to Heaven!", @instrument.make_sound("Stairway to Heaven"))
  end

  def test_can_make_sound__piano()
    assert_equal("Plink, plonk ... I'm playing Tiny Dancer!", @piano.make_sound("Tiny Dancer"))
  end

end
