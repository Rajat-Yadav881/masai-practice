const strr = "[one}two]three{(}[[}[";
function myhead(strr) {
  let str = [];
  for (let i = 0; i < strr.length; i++) {
    if (
      strr[i] === "(" ||
      strr[i] === "[" ||
      strr[i] === "{" ||
      strr[i] === ")" ||
      strr[i] === "]" ||
      strr[i] === "}"
    ) {
      str.push(strr[i]);
    }
  }
  console.log(str.join(""));
  let stk = [];
  let flag = false;

  for (let i = 0; i < str.length; i++) {
    if (str[i] === "(" || str[i] === "[" || str[i] === "{") {
      stk.push(str[i]);
    } else {
      if (stk.length === 0) {
        flag = true;
        break;
      } else {
        if (
          (str[i] === ")" && stk[stk.length - 1] !== "(") ||
          (str[i] === "]" && stk[stk.length - 1] !== "[") ||
          (str[i] === "}" && stk[stk.length - 1] !== "{")
        ) {
          flag = true;
          break;
        } else {
          stk.pop();
        }
      }
    }
  }
  if (flag === true) {
    console.log("not balanced");
  } else {
    if (stk.length === 0) {
      console.log("balanced");
    } else {
      console.log("not balanced");
    }
  }
}

myhead(strr);
