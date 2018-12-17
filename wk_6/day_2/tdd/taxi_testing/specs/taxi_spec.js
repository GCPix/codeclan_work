const assert = require('assert')
const Taxi = require('../taxi.js')

describe('Taxi', function(){

  let taxi;

  beforeEach(function(){
    taxi = new Taxi('Toyota', 'Prius', 'Gillian')

  });


  it('should have a manufacturer', function(){

    const actual = taxi.manufacturer //actual
    assert.strictEqual(actual, 'Toyota')//assert
  });

  it('should have a model', function(){

    const actual = taxi.model //actual
    assert.strictEqual(actual, 'Prius') //assert
  });

  it('should have a driver', function(){

    const actual = taxi.driver //actual
    assert.strictEqual(actual, 'Gillian')
  });

  describe('passengers', function(){

    it('should start with no passengers', function(){
      const actual = taxi.passengers
      assert.deepStrictEqual(actual, [])//used when comparing arrays
    });

    it('should be able to add a passenger to the taxi', function(){
          taxi.addPassenger('Sally')
          const actual = taxi.numberOfPassengers();
          assert.strictEqual(actual,1)

    });
    it('should be able to count the number of passengers', function(){
        taxi.addPassenger('Louise')
        taxi.addPassenger('Paul')
        const actual = taxi.numberOfPassengers();
        assert.strictEqual(actual, 2)

    });
    it('should be able to remove a passenger searching by name from the taxi', function(){
        taxi.addPassenger('Louise')
        taxi.addPassenger('Paul')
        taxi.removePassengerByName('Louise')
        const actual = taxi.passengers
        const expected = ['Paul']
        assert.deepStrictEqual(actual, expected)


    });
    it('Should be able to remove all passengers at once from a taxi', function(){
      taxi.addPassenger('Louise')
      taxi.addPassenger('Paul')
      taxi.removeAllPassengers()
      const actual = taxi.numberOfPassengers();
      assert.strictEqual(actual, 0)

    });
  });
});
