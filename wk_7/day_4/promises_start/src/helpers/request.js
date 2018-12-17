const Request = function (url) {
  this.url = url;
}

Request.prototype.get = function () {
  return fetch(this.url)
          .then(response=>response.json()) // this is the promise
          .catch(err => console.log(err); //catch is for error handling
};


module.exports = Request;
