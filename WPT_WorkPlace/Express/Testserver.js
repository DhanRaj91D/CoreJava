var express = require('express');
var app = express();

var planetrouter=require('./lanetsrouter')
app.use("/planet",planetrouter)


app.get('/', (request, response) => {
    return response.send('OK');
  });

app.get('/hi',(req,resp)=>{

  return resp.send('hi from server')
});
  
  
// start the server in the port 3000 !
app.listen(8000, function () {
    console.log('Example app listening on port 8000.');
});

