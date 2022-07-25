import {sum} from "./sum.js"; //ES6 syntax

test('check sum', () => {
    expect(sum(1, 2)).toBe(3);
});
//jest only understand ES5 syntax to convert it we use babel  

