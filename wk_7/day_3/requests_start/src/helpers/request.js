const Request = function(url){
  this.url = url
};

Request.prototype.get = function (onComplete) {
  const xhr = new XMLHttpRequest(); // creates a new request


  xhr.open('GET', this.url); // make it a get request and sent it to url
  xhr.setRequestHeader('Accept', 'application/json');//tell API you want a json format back
  xhr.send();//now send it
  xhr.addEventListener('load', () => {
    console.log(xhr);
    if(xhr.status !==200){
      return;
    }

    const jsonString = xhr.responseText;
    const data =JSON.parse(jsonString); // changes the string brought in to an object
    onComplete(data);


  });//bit like the DOMContentLoaded we can't just keep going we need to make sure the data is there

};

module.exports = Request
