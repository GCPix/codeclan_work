const planetsData = require('./data/planets.js');
const SolarSystem = require('./models/solar_system.js');

document.addEventListener('DOMContentLoaded', () => {
  const planetsDataModel = new SolarSystem(planetsData);
  console.log(planetsDataModel.planets);

  const menuItems = document.querySelectorAll('li.planet-menu-item')
  console.log(menuItems);
});
