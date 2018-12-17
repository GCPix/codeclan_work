(window["webpackJsonp"] = window["webpackJsonp"] || []).push([[0],{

/***/ "./client/src/helpers/pub_sub.js":
/*!***************************************!*\
  !*** ./client/src/helpers/pub_sub.js ***!
  \***************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
eval("__webpack_require__.r(__webpack_exports__);\nconst PubSub = {\n  publish: function (channel, payload) {\n    var event = new CustomEvent(channel, {\n      detail: payload\n  });\n    document.dispatchEvent(event);\n  },\n\n  subscribe: function (channel, callback) {\n    document.addEventListener(channel, callback);\n  }\n};\n\n// module.exports = PubSub;\n/* harmony default export */ __webpack_exports__[\"default\"] = (PubSub);\n\n\n//# sourceURL=webpack:///./client/src/helpers/pub_sub.js?");

/***/ })

}]);