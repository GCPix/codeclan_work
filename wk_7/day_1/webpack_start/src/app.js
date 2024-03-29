const Person = require("./models/person");
const RandomAdjective = require("./models/random_adjective");
const moment = require('moment');

document.addEventListener('DOMContentLoaded', function () {
  console.log(moment().format('MMMM Do YYYY, h:mm:ss a'));
  const form = document.getElementById('person-details-form');
  const welcomeElement = document.querySelector('p.welcome');
  const messageElement = document.querySelector('p.message');

  form.addEventListener('submit', function (event) {
    event.preventDefault();
    const name = event.target['name-input'].value;
    const colour = event.target['favourite-colour-input'].value;

    const person = new Person(name, colour);
    person.formatName();
    person.formatColour();

    const greeting = `Hey there, ${person.name}!`;
    welcomeElement.textContent = greeting;

    const randomAdjective = new RandomAdjective();
    const adjective = randomAdjective.get();
    const message = `${person.favouriteColour} is a ${adjective} colour, mate.`;
    messageElement.textContent = message;
  });
});
