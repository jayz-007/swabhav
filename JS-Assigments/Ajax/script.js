var fetch = document.querySelector("#fetchBtn");
var pop = document.querySelector("#popBtn");
const xhr = new XMLHttpRequest();

fetch.addEventListener('click',fetchData);

function fetchData(){
    console.log("Fetch Button clicked");

    // GET Request
    //xhr.open("GET","https://jsonplaceholder.typicode.com/todos/1",true);
    
    // POST Request
    xhr.open("POST","http://dummy.restapiexample.com/api/v1/create",true);
    xhr.getResponseHeader("content-type","application/json");

    xhr.onprogress = function(){
        console.log("On Progress");
    }

    xhr.onload = function() {
        console.log(this.responseText);
    }
    params = '{"name":"test1234","salary":"123","age":"23"}';
    xhr.send(params);
}

pop.addEventListener("click",popHandler);

function popHandler(){
    console.log("Populate Button clicked");

    // GET Request
    xhr.open("GET","	http://dummy.restapiexample.com/api/v1/employees",true);
    
    xhr.onload = function() {
        let obj = JSON.parse(this.responseText);
        console.log(obj.data);
        var list = document.querySelector("#list");
        var str = "";
        for(key in obj.data){
            str += obj.data[key].employee_name + "</br>";
        }
        list.innerHTML = str;
    }
    xhr.send();
}