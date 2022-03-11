const {response}=require('express')
var express= require("express")
var planetrouter=express.Router()

planetrouter.get('/',(req,resp)=>{

resp.send("earth is planet")


});

module.exports=planetrouter