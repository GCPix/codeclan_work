const PubSub = require('../helpers/pub_sub.js')

const MountainView = function(container){
  this.container = container
};

MountainView.prototype.bindEvents = function () {
  console.log(this.container);
  this.getData()

};

MountainView.prototype.getData = function () {
  PubSub.subscribe('Munro:allDataGiven', (event) => {
    const mountains = event.detail;
    console.log(mountains);
    const mountainDetail = this.showData(mountains)

    ;

  })
};

MountainView.prototype.showData = function (mountainArray) {
  return mountainArray.forEach(mountain => this.renderMountain(mountain))
};

MountainView.prototype.renderMountain = function (mountain) {
  mountainDiv = document.createElement('div')
  mountainDiv.classList = 'mountain-block'
  mountainName = document.createElement('h2')
  mountainDiv.appendChild(mountainName)
  mountainName.textContent = mountain.name
  this.createPara('height', mountain.height)
  this.createPara('gridref_letters', mountain.gridref_letters)
  this.createPara('gridref_eastings', mountain.gridref_eastings)
  this.createPara('metoffice_loc_id', mountain.metoffice_loc_id)
  this.container.appendChild(mountainDiv);
};

MountainView.prototype.createPara = function (key, value) {
  const p = document.createElement('p')
  p.textContent = `${key}: ${value}`
  this.container.appendChild(p)
};
module.exports = MountainView;
