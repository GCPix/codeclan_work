document.addEventListener('DOMContentLoaded', () =>{

const title = document.querySelector('h1'); // querySelector will only bring the first of the items with the condition back so if you have multiple h1s you want to change or a class assigned to multiple items you can't use this if you want it to work on all of them.

title.textContent = 'Happy, happy, talking, happy talk.....';

// Use document.querySelector to access the paragraph with the ID 'welcome-paragraph' from the DOM.
// What is the difference in output when you use console.log and console.dir?

const welcome = document.querySelector(' #welcome-paragraph');
welcome.textContent = "Talk about things you like to do";
// console.log(welcome);
// console.dir(welcome);

const redElement = document.querySelector('.red');
console.log(redElement);//this can be used to see that what you wrote is actually impacting on the page

const redListItem = document.querySelector('li.red');

redListItem.textContent = "You gotta have a dream";
redListItem.classList.add('bold');
console.dir(redListItem);

const allLiElements = document.querySelectorAll('li');
console.dir(allLiElements);

const newListItem = document.createElement('li');
newListItem.textContent = "If you don't have a dream"
newListItem.classList.add('purple');
// above creates the new list item but don't actually allow it to show.  We need to tell it where to show it.  we basically need to find somewhere to append it to.  In this case it is a list item in a ul so we append it to the ul
const list = document.querySelector('ul');
list.appendChild(newListItem)
})
