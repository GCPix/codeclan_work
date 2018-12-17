const PubSub = require('../helpers/pub_sub.js');
const Request = require('../helpers/request.js');

const RestCountries = function(){
  this.countryArray = []

};


RestCountries.prototype.bindEvents = function () {
  this.getData()
  PubSub.subscribe('SelectView:countryPicked', (event)=>{
    const countryIndex = event.detail
    console.log('test:', countryIndex);
    this.getCountryInfo(countryIndex)
  })
};

RestCountries.prototype.getData = function () {
  const request = new Request('https://restcountries.eu/rest/v2/all')
  request.get((data) =>{
    PubSub.publish('RestCountries:APIAllData', data)
    this.countryArray = data;

  })
};
RestCountries.prototype.getCountryInfo = function (index) {
  const countryInfo = this.countryArray[index]
  console.log('countryInfo:', countryInfo);
  PubSub.publish('RestCountries:fullCountryData', countryInfo)


};

module.exports = RestCountries;
