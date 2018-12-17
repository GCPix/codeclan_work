const numbers = [1,2,3,4,5]
//standard for loop to go through an array
// for(let n of numbers){
//   console.log(`this is number ${n}`);
// };
//
// //using the foreach and function
// numbers.forEach(function(num){
//
// console.log(`this is number ${num}`)
//
// });

//exactly the same but using the =>
// numbers.forEach(num => {console.log(`this is number ${num}`)});

//
// const multiplyByTwo = function(){
//   const result = [];
//   numbers.forEach((number) => {
//     doubledNumber = number*2
//     result.push(doubledNumber)
//
//   })
//   return result;
// };
//

const multiplyByTwo = function(){
  return numbers.map((number) => {
    return number * 2;
  });
};
console.log(multiplyByTwo());
//
// const getEvens = function(){
//   const result = [];
//
//   numbers.forEach((num) =>{
//     if (num%2 === 0){
//       result.push(num)
//     };
//   })
//   return result
// };

const getEvens = function(){
   return numbers.filter((number) => {
    return number%2===0;
  });

};
//
const sumElements = function(){
  let sum = 0
  numbers.forEach((num) =>{
    sum+=num
  });
  return sum;
};

const sumElements = function(){
  return numbers.reduce((sum, currentNumber) => {return sum + currentNumber},0);//,0 is the intial value for the sum

};
console.log(getEvens());
console.log(sumElements());

//below is essentially what forEach does where array is the array name and callback is the function we are doing to manipulate the values for the array

// callback is a function that can be passed????
const ourForEach = function(array, callback){
  for(let element of array){
    callback(element)
  }
}

ourForEach(numbers, (number) => {
  console.log(`the number is ${number}`);

})
