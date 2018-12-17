const PubSub = require('../helpers/pub_sub.js');

const CountryDetailView = function(container){
  this.container = container

};

CountryDetailView.prototype.bindEvents = function () {
  PubSub.subscribe('RestCountries:fullCountryData', (event)=> {
        const country = event.detail;
        console.log(country);
        this.renderData(country);

  })
};

CountryDetailView.prototype.renderData = function (index) {
  const countryName = document.createElement('h2');
  this.container.appendChild(countryName);
  //countryName.textContent =
};

module.exports = CountryDetailView;
