let url = "https://example.com?foo=1&bar=2";

import searchParams from "./url";

test("test our url",()=>{
    expect(searchParams(url, "bar")).toBe("2");
});

//extract parameter then we will use searchParam()