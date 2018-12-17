//int he require below we are importing the constructors which is why Pet and Person are capitals

const Pet = require('./pet.js')
const Person = require('./person.js')

const scooby = new Pet('Scooby Doo', 'Dog')
scooby.eat("scooby snack");
const shaggy = new Person('Shaggy Rodgers', scooby)

shaggy.greet();
shaggy.feed("scooby snack");
