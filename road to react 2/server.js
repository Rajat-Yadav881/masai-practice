//PORT??-->it is the number upto 65K
const PORT = 3000;
const path = require("path");
const jsonServer = require("json-server");
const server = jsonServer.create();
const router = jsonServer.router(path.join(__dirname,"db.json"));
const middleewares = jsonServer.defaults();
server.use(middleewares);
server.use(jsonServer.bodyParser);
server.use("/api",router);
server.listen(PORT,()=>console.log(`JSON Server is running on the port ${PORT}`));


//frontend x backend
//5500 x 3000

//step1:install npm package json-server
//step2:create server.js
//step3:setUp database , re-run server
//step4:go to the location on browser

