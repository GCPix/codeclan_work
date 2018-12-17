import React, { Component } from "react";
import About from "./About";
import Home from "./Home";
import Pricing from "./Pricing";
import Contact from "./contact";
import {BrowserRouter as Router, Route, Switch} from "react-router-dom";
import Navbar from "./NavBar"

class Main extends Component {
constructor(){
  super();
  this.state = {
    pricing:[
      {
        level: "Hobby",
        cost: 0
      },
      {
        level: "Startup",
        cost: 10
      },
      {
        level: "Enterprise",
        cost:100
      }
    ]
  }

}

  render() {
      return (
        <Router>
          <React.Fragment>
            <Navbar/>
            <Switch>
            <Route exact path = "/" component = {Home}/>
            <Route path = "/about" component = {About}/>
            <Route path = "/pricing"
                  render =  {() => <Pricing prices = {this.state.pricing}/>}
            />
            <Route path = "/contact" component = {Contact}/>
            </Switch>
          </React.Fragment>
        </Router>
      )
  }
// Switch helps with paths such as /:name which would show the component on all pages essentially 


}

export default Main;
