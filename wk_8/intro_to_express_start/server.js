const express = require('express')
const app = express();
//express has methods called get, post, put and delete (probably others too)
app.use(express.static('client/public'))
//split into the root res and req are sresponse and requrest
app.get('/', (req, res)=>{
  res.sendFile('index.html');
});

//w use node server.js but we want it to constantly listen hence app.listen

app.listen(3000, ()=>{
  console.log('App running on port 3000');
})
