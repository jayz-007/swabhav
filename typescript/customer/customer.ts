export class Customer{
    constructor (private _id :number ,private _name :String){}
      public getId():number {
           return this._id;
      }
      public getName() :String{
          return this._name;
      }
     
   }
   
   export class Address{
       constructor(private _address :String){}
       public getAddress():String{
           return this._address;
       }
   
   }
   
  