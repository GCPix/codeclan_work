import React from "react";

const Comment = ({commentItem})=>{
  return(
        <div className="comment">
          <h4>{commentItem.text}</h4>
          <p>{commentItem.author}</p>
        </div>
      )
}
// class Comment extends Component {
//   render() {
//     return (
//       <div className="comment">
//         <h4>{this.props.children}</h4>
//         <p>{this.props.author}</p>
//       </div>
//     );
//   }
// }

export default Comment;
