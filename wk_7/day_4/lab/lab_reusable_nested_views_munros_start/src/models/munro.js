const PubSub = require('../helpers/pub_sub.js')
const Request= require('../helpers/request.js')

const MunroData = function(){
this.mountainArray = null

};

MunroData.prototype.bindEvents = function () {
  this.getData()

};

MunroData.prototype.getData = function () {
  const request = new Request('https://munroapi.herokuapp.com/api/munros')
  request.get().then(responseData => {
    this.mountainArray = responseData
    console.log(this.mountainArray);
    PubSub.publish('Munro:allDataGiven', this.mountainArray)
    this.getRegionalData()
  })
};

MunroData.prototype.getRegionalData = function () {
  const regionList = this.getUniqueRegions()
  const regionalLists = this.mountainByRegion(regionList)
  console.log('ttt',regionalLists);
};

MunroData.prototype.getUniqueRegions = function () {
    return this.mountainArray.map(mountain => mountain.region).filter((region, index, regions) => regions.indexOf(region)===index
)};


MunroData.prototype.mountainByRegion = function (regionList) {

  const test = regionList.map((region) => {
    return {
      region: region,
      regionalMountainList: this.mountainArray.filter(mountain => mountain.region === region)
    }
  })
  console.log(test);
};
module.exports = MunroData;
