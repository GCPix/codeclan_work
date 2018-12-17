const PubSub = require('../helpers/pub_sub.js');
const Request = require('../helpers/request.js')

const Joke = function () {
  this.text = null;
}

Joke.prototype.getData = function () {
  const request = new Request('https://icanhazdadjoke.com/');//url needs to be correct for purpose
  request.get((data) => {
    PubSub.publish('Joke:joke-loaded', data.joke) //this block is basically what you want to do with the data
  });

}

module.exports = Joke;
