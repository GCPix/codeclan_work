document.addEventListener('DOMContentLoaded', () => {

  // const answer = 1+1;
  // console.log('The answer is', answer);

  const fruits = ['apple', 'orange', 'banana'];
  console.table(fruits)

  const person = {
    name: 'Gillian',
    age: 21
  };

  console.table(person)
  console.log(person);
  console.log({person}); // this version will show you the variable name in the console
  // console.table will allow you lay out an array or object to make it clearer


  var number1 = 5;
  number1 =+ 10;

  const number2 = 20 + number1;
  const number3 = number2/10;

  setTimeout(() => {

    document.body.classList.add('lightblue');
  }, 3000)


});
