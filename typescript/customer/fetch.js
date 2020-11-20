"use strict";
exports.__esModule = true;
var customer_1 = require("./customer");
var customer_2 = require("./customer");
var customer = new customer_1.Customer(2, 'jay');
console.log(customer.getId());
console.log(customer.getName());
var address = new customer_2.Address("kalwa");
console.log(address.getAddress());
