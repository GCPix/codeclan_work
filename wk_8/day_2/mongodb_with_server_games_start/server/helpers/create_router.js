const express = require('express');
const ObjectID = require('mongodb').ObjectID;

const createRouter = function (collection) {

  const router = express.Router();

  //index
router.get('/', (req, res)=>{
  collection.find().toArray().then((docs) => {
    res.json(docs);
  });
});
// show
router.get('/:id', (req, res) => {
  const id = req.params.id;
  collection.findOne({_id: ObjectID(id)}).then((doc) => {
    res.json(doc);
  });

})
//create
//the return is in the first .then as we don't want anything to return until the promise is ready
//if you get undefined on this it is probably because you don't have bodyparser in your server.js
router.post('/', (req, res) => {
  collection.insertOne(req.body)
  .then(() => collection.find().toArray())
  .then((docs) => res.json(docs))
})

//destroy
router.delete('/:id',(req, res) => {
  const id = req.params.id
  collection.deleteOne({_id: ObjectID(id)})
  .then(() => collection.find().toArray())
    .then((docs) => res.json(docs))

})
//update
router.put('/:id', (req,res) => {
  const id = req.params.id;
  const updatedData = req.body;
  collection.updateOne(
    {_id: ObjectID(id)},
    {$set: updatedData}
  ).then(() => collection.find().toArray())
    .then((docs) => res.json(docs))

})

  return router;

};




module.exports = createRouter;
