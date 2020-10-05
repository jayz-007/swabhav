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
       
        for(key in obj.data){
             var name = obj.data[key].employee_name   ;
           var age =+ obj.data[key].employee_age 
            markup = "<tr><td> "  
                    + name + "</td><td>"+age+ "</td></tr>"; 
                tableBody = $("table tbody"); 
                tableBody.append(markup); 
                console.log("end of program");
                 
        }
         
           
                
           
          
    }
    xhr.send();
}

