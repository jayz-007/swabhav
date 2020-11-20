import { Customer } from "./customer";
import { Address } from "./customer";
var customer= new Customer(2,'jay');

console.log(customer.getId());

console.log(customer.getName());

var address= new Address("kalwa");
console.log(address.getAddress());