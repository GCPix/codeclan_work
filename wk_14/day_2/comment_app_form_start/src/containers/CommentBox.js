import React, { Component } from "react";
import CommentList from "../components/CommentList";
import CommentForm from "../components/CommentForm"

class CommentBox extends Component {

  constructor() {
    super();
    this.state = {
      data: [
        { id: 1,
          author: "Brendan Eich",
          text: "Always bet on JavaScript."
        },
        { id: 2,
          author: "Reg Braithwaite",
          text: "The strength of JavaScript is that you can do anything. The weakness is that you will."
        }
      ]
    };

    this.handleCommentSubmit = this.handleCommentSubmit.bind(this);
  }
  /*we don't push state because of asynch behaviour so we are creating a new array and then we will replace the original one with the new one ... is a spread operator basically it is unpacking the state array*/
handleCommentSubmit(submittedComment){
  submittedComment.id = Date.now()
  const updatedComments = [...this.state.data, submittedComment]
  this.setState({data: updatedComments})
}

componentDidMount(){
  console.log('hello!');
}

componentDidUpdate(prevProps, prevState){
console.log('component has updated');
console.log(prevProps);
console.log(prevState);}




  render() {
    return (
      <div className="comment-box">
      <h2>Add a Comment</h2>
      <CommentForm onCommentSubmit = {this.handleCommentSubmit}/>
        <h2>Comments</h2>
        <CommentList data={this.state.data} />
      </div>

    );
  }
}

export default CommentBox;
