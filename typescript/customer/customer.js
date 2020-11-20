"use strict";
exports.__esModule = true;
exports.Address = exports.Customer = void 0;
var Customer = /** @class */ (function () {
    function Customer(_id, _name) {
        this._id = _id;
        this._name = _name;
    }
    Customer.prototype.getId = function () {
        return this._id;
    };
    Customer.prototype.getName = function () {
        return this._name;
    };
    return Customer;
}());
exports.Customer = Customer;
var Address = /** @class */ (function () {
    function Address(_address) {
        this._address = _address;
    }
    Address.prototype.getAddress = function () {
        return this._address;
    };
    return Address;
}());
exports.Address = Address;
