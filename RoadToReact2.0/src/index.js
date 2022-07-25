//to be added
import axios from "axios";

axios
    .get('https://fakestoreapi.com/products/1')
    .then(function (response) {
    // handle success
        console.log(response);
    })
    .catch(function (error) {
    // handle error
        console.log(error);
    })
    .finally (function () {
    // always executed
    });

    //axios taking 1 promise as compare to fetch it is taking 2 promise