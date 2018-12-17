const PubSub = require('../helpers/pub_sub.js');

const SelectView = function(container){
  this.container = container
};

SelectView.prototype.bindEvents = function () {

  PubSub.subscribe('RestCountries:APIAllData', (event)=>{
    const countryList = event.detail
    this.populateList(countryList)

  })

  this.container.addEventListener('change', (event)=>{
    const countryValue = event.target.value;
    console.log(countryValue);
    PubSub.publish('SelectView:countryPicked', countryValue)
  })

};


SelectView.prototype.populateList = function (countryArray) {
    countryArray.forEach((country, index) =>{
      const option = document.createElement('option')
      option.textContent = country.name
      option.value = index
      this.container.appendChild(option)
    })
};

module.exports = SelectView;
