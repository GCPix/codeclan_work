document.addEventListener('DOMContentLoaded', () => {
  console.log('JavaScript loaded');
  const updateTitle = function(){

  };
  const updateOnSubmit = function(){


    const createArea = document.createElement('div');

    // document.div.classList.add('bookDetail')
    event.preventDefault();

    //updateTitle
    const updateTitle = document.querySelector('#reading-list');
    const titleDetail = document.createElement('p');
    titleDetail.textContent = `Title: ${event.target.title.value}`
    debugger;
    updateTitle.appendChild(titleDetail)

    // updateAuthor();
    const updateAuthor = document.querySelector('#reading-list');
    const authorDetail = document.createElement('p');
    authorDetail.textContent = `Author: ${event.target.author.value}`
    updateTitle.appendChild(authorDetail)
    // updateType();
    const updateType = document.querySelector('#reading-list');
    const typeDetail = document.createElement('p');
    typeDetail.textContent = `Category: ${event.target.category.value}`
    updateType.appendChild(typeDetail)
    //reset form fields

    // document.getElementById('new-item-form').reset(); // get element and query selector will create a performance hit so shouldn't use this method.

    const form = event.target
    form.reset()
  };


  const submitForm = document.querySelector('#new-item-form');
  submitForm.addEventListener('submit', updateOnSubmit);

  const handDeleteBtnClicked = function(event){

  };

  // const deleteBtn = document.querySelector('#deleteAll');
  // deleteBtn.addEventListener("click", handDeleteBtnClicked)
});
