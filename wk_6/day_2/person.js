//classes do exist but we are not using them.  This is how we create something like a class


const Person = function(name, petName){
  this.name = name;
  this.petName = petName;

}



//hit p and you will get the option for prototype
// prototype is creating methods related to the 'class' like declaring a method within the class in ruby.
//this is good for saving memory where it doesn't need to be loaded with every instance????
//when you call the method it will look for a method within Person function.  If it can't find it it will then look for a prototype of Person and if it find it here it will run it.  If it cn't find either it will return and error.

Person.prototype.greet = function () {

  console.log(`Hi my name is ${this.name}`);

};

Person.prototype.feed = function(food){
  this.petName.eat(food);//function written in pet.js
  console.log(`${this.name} fed ${this.petName.name} a plate of ${food}`);

};

//needs to be exported to be seen in the app.js file

module.exports = Person;
