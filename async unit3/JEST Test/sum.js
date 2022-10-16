async function getData(url) {
    let res = await fetch(url)

    let data = await res.json()
    return data;
  }
  module.exports = sum;

  //babel --- convert ES5==ES6
  