const RestCountries = require('./models/rest_countries.js')
const SelectView = require('./views/select_view.js')
const CountryDetailView = require('./views/country_detail_view.js')

document.addEventListener('DOMContentLoaded', () => {

  const countryContainer = document.querySelector('#countries');
  const selectView = new SelectView(countryContainer);
  selectView.bindEvents()

  const countryInfoContainer = document.querySelector('#country')
  const countryDetailView = new CountryDetailView(countryInfoContainer)
  countryDetailView.bindEvents();

  const countries = new RestCountries;
  countries.bindEvents();

});
