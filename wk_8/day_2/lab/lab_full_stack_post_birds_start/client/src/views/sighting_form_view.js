const PubSub = require('../helpers/pub_sub.js')

const SightingFormView = function (form) {
  this.form = form;
};

SightingFormView.prototype.bindEvents = function () {
  this.form.addEventListener('submit', (evt) => {
    this.handleSubmit(evt);
  });
};

SightingFormView.prototype.handleSubmit = function (evt) {
  evt.preventDefault();

  const newBird = {

    species: evt.target.species.value,
    location: evt.target.location.value,
    date: evt.target.date.value
  };
  debugger;
  PubSub.publish('SFV:newbird', newBird)
  evt.target.reset();
};

module.exports = SightingFormView;
