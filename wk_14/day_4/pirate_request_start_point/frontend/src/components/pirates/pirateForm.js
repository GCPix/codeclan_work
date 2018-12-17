import React from 'react'

const PirateForm = (props) => {

  const shipOptions = props.ships.map((ship) => {
    return <option key={ship.id} value = {ship._links.self.href}>{ship.name}</option>
  })

  function handleSubmit(evt){
      evt.preventDefault()
      const pirate = {
        "firstName": evt.target.firstName.value,
        "lastName": evt.target.lastName.value,
        "age": evt.target.age.value,
        "ship": evt.target.ship.value

      }
      console.log(pirate);
      props.handlePiratePost(pirate)
  }
//name values below are from the database table
  return (

    <form onSubmit = {handleSubmit}>
    <input type="text" placeholder="First Name" name="firstName"/>
    <input type="text" placeholder="Last Name" name="lastName"/>
    <input type="number" placeholder="Age" name="age"/>

    <select name="ship">
      {shipOptions}
    </select>
    <button type = "submit">Save</button>
    </form>
  )

}

export default PirateForm;
