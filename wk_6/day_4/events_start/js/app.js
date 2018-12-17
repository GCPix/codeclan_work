document.addEventListener('DOMContentLoaded', () => {


const handleButtonClick = function(){

  const buttonResult = document.querySelector('#button-result');
    buttonResult.textContent = 'so long, farewell';
  }
const handleInput = function(event){
  let value = event.target.value;
  const inputText = document.querySelector('#input-result');
    inputText.textContent = value;

};

const handleSelectChange = function(event){
  let value = event.target.value;
  const selectItem = document.querySelector('#select-result');
  selectItem.textContent = value;

};

const handleFormSubmit = function(event){
  event.preventDefault();
  const resultParagraph = document.querySelector('#form-result');
  resultParagraph.textContent = `${event.target.first_name.value}  ${event.target.last_name.value}`

};



  const button = document.querySelector('#button');
  button.addEventListener('click', handleButtonClick);//the funciton doesn't have breackets at this stage because it isn't actually being called until they click.  At that point the system will essentially put brackets on it and run it.

  const textInput = document.querySelector('#input');
  textInput.addEventListener('input', handleInput);


  const selection = document.querySelector('#select');
  selection.addEventListener('change', handleSelectChange);


  const form = document.querySelector('#form');
  form.addEventListener('submit', handleFormSubmit);

});
