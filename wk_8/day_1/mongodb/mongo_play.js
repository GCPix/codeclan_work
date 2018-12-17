use Zoo;
db.dropDatabase();

db.animals.insertOne({name: "Janet", type: "Polar Bear"});
db.animals.insertOne({name: "Norman", type: "Capybara", age: 5});
db.animals.deleteOne({name: "Janet"})

db.zookeepers.insertMany([

{

name: 'Paul',
favAnimal: ['tiger', 'lion']
},

{name: 'Ringo',
favAnimal: ['penguin', 'seal']}

])
