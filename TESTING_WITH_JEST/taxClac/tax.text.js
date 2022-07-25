import {tax,savings} from "./tax_calculator.js";


test("check percentage",()=>{
    expect(tax(300000)).toBe(30001)
});

test("check saving",()=>{
    expect(savings(800000)).toBe(80001)
});