const assert = require('assert') //package that comes with node.js

assert.equal(1, '1') //will pass but not return anything
assert.strictEqual(true,true)

assert.strictEqual(1, '1')//will not pass
assert.strictEqual([1,2,3],[1,2,3]) //won't pass as different objects
assert.deepEqual([1,2,3], [1,2,3])//will pass has not looking at objects but at actual values
assert.deepEqual([1,2,3], ['1','2','3']) //will pass as values are the same
assert.deepStrictEqual([1,2,3], ['1','2','3'])//won't pass because they are different objects
