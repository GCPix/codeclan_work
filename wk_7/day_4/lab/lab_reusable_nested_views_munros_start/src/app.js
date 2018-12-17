const MunroData = require('./models/munro.js')
const MountainView = require('./views/mountain_view.js')

document.addEventListener('DOMContentLoaded', () => {
  console.log('JavaScript Loaded');

  const munros = new MunroData();
  munros.bindEvents();

  const resultPlacement = document.querySelector('#munro-details')
  const mountainView = new MountainView(resultPlacement);
  mountainView.bindEvents();


})
