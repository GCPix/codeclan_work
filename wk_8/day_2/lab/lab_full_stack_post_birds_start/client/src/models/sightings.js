const Request = require('../helpers/request.js');
const PubSub = require('../helpers/pub_sub.js');

const Sightings = function (url) {
  this.url = 'http://localhost:3000/api/sightings';
  this.request = new Request(this.url);
};

Sightings.prototype.bindEvents = function () {
  PubSub.subscribe('SightingView:sighting-delete-clicked', (evt) => {
    this.deleteSighting(evt.detail);
  });

  PubSub.subscribe('SFV:newbird', (evt) => {
    console.log(evt.detail);
    this.saveSighting(evt.detail);
  })
};

Sightings.prototype.getData = function () {
  this.request.get()
    .then((sightings) => {
      PubSub.publish('Sightings:data-loaded', sightings);
    })
    .catch(console.error);
};

Sightings.prototype.deleteSighting = function (sightingId) {
  this.request.delete(sightingId)
    .then((sightings) => {
      PubSub.publish('Sightings:data-loaded', sightings);
    })
    .catch(console.error);
};
Sightings.prototype.saveSighting = function (sighting) {
  this.request.post(sighting)
  .then((sightings) => {
    PubSub.publish('Sightings:data-loaded', sightings);
  })
  .catch(console.error);
};

module.exports = Sightings;
