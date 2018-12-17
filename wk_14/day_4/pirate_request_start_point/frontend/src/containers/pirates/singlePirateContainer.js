import React, {Component} from 'react';
import SinglePirate from '../../components/pirates/singlePirate.js';

import Request from '../../helpers/request.js';

class SinglePirateContainer extends Component {
  constructor(props){
    super(props);
    this.state = {
      pirate: null
    }
    this.handleDelete = this.handleDelete.bind(this);
  }
// you hsouldn't be using window.location = at this point you should be calling the same fetch request we used  inside componentDidMount by writing it in its own method
  handleDelete(id){
    const url = '/api/pirates/'+ id;
    let request = new Request();

    request.delete(url).then(() => {
      window.location = '/pirates'
    });
  }
  componentDidMount() {
    let request= new Request();

    const url = '/api/pirates/'+this.props.id + '?projection=embedShip'
    //embedShip is the 'name' from the projection in intellij
    request.get(url).then(data => this.setState({pirate: data}))
  }
    render(){
    return (
       <SinglePirate pirate = {this.state.pirate} handleDelete={this.handleDelete}/>
    )
  }
}

export default SinglePirateContainer;
