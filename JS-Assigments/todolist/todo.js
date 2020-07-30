var todos = [];
var completedTodos = 0;
var uncompletedTodos = 0;

for(var i=0;i<localStorage.length;i++){
	var key = localStorage.key(i);
	var value = localStorage.getItem(key);
	var li = document.createElement("li");
		var text = key;
		var t = document.createTextNode(text);
		li.appendChild(t);
		
		
		var btn = document.createElement("BUTTON"); 
        btn.className = "close";  
        btn.innerHTML = " X ";  
         
         btn.addEventListener("click",deleteElement);

    var x = document.createElement("INPUT");
    x.setAttribute("type", "checkbox");
    x.className = "check";
    x.id = "check";
    x.addEventListener("change",addCompletedElement);

    li.appendChild(btn);
    li.appendChild(x);  
    var i = document.getElementById("UncompletedElementsHeader");
if(value === "uncompletedTodos"){
	uncompletedTodos ++;
		document.getElementById("UncompletedElements").appendChild(li);
	
	var notCompleted = document.getElementById("UncompletedElementsHeader");
	
	
	notCompleted.textContent = "UnCompleted Todos" + " "+uncompletedTodos;

}
if(value === "completedTodos"){
	completedTodos++;
		document.getElementById("CompletedElement").appendChild(li);
		var completed = document.getElementById("CompletedElementHeader");
		completed.textContent = "Completed Todos" + " "+completedTodos;

}

	}



function addElement(){
		var li = document.createElement("li");
		var text = document.getElementById("InputBox").value;
		var t = document.createTextNode(text);
		li.appendChild(t);
		if(text === ''){
			alert("You must type something")
		}
		else{
			localStorage.clear();
			const key = text;
			const value ="uncompletedTodos";
			localStorage.setItem(key,value);
			
			

			
		document.getElementById("UncompletedElements").appendChild(li);
		todos.push(text + " X ")
		document.getElementById("InputBox").value="";
		var btn = document.createElement("BUTTON"); 
        btn.className = "close";  
        btn.innerHTML = " X ";  
         
         btn.addEventListener("click",deleteElement);

    var x = document.createElement("INPUT");
    x.setAttribute("type", "checkbox");
    x.className = "check";
    x.id = "check";
    x.addEventListener("change",addCompletedElement);

    li.appendChild(btn);
    li.appendChild(x);  
    var i = document.getElementById("UncompletedElementsHeader");
	
	uncompletedTodos++;
	i.textContent = "UnCompleted Todos" + " "+uncompletedTodos;
		
	}
	
}







function addCompletedElement(text){
	/*var id = document.getElementById("CompletedElement");
	var element = this.parentElement;
	var fun = revokeCompletedElement;
	createListItemElement(id,element,fun);
	*/
	var element = this.parentElement;
	var check = element.lastChild;
	check.removeEventListener("change",addCompletedElement);
	check.addEventListener("change",revokeCompletedElement);
	document.getElementById("CompletedElement").appendChild(element);

	var completed = document.getElementById("CompletedElementHeader");
	var notCompleted = document.getElementById("UncompletedElementsHeader");
	completedTodos++;
	uncompletedTodos--;
	completed.textContent = "Completed Todos" + " "+completedTodos;
	notCompleted.textContent = "UnCompleted Todos" + " "+uncompletedTodos;

	var key = element.firstChild.textContent;
	var value = "completedTodos";
	localStorage.setItem(key,value);
	
}

function revokeCompletedElement(text){
	var element = this.parentElement;
	var check = element.lastChild;
	check.removeEventListener("change",revokeCompletedElement);
	check.addEventListener("change",addCompletedElement);
	document.getElementById("UncompletedElements").appendChild(element);

	var notCompleted = document.getElementById("UncompletedElementsHeader");
	var completed = document.getElementById("CompletedElementHeader");
	uncompletedTodos++;
	completedTodos--;
	notCompleted.textContent = "UnCompleted Todos" + " "+uncompletedTodos;
	completed.textContent = "Completed Todos" + " "+completedTodos;
	var key = element.firstChild.textContent;
	var value = "uncompletedTodos";
	localStorage.setItem(key,value);
	

}



function deleteElement(){
	var li = this.parentElement;
	var text = li.textContent;
	li.remove();
	for(var i =0;i<todos.length;i++){
		
	
		if(todos[i]===text){
			todos.splice(i,1);
			
			
		}
	}
	const key = li.firstChild.textContent;
	const value = localStorage.getItem(key);
	if(value === "uncompletedTodos"){
	uncompletedTodos --;
	var notCompleted = document.getElementById("UncompletedElementsHeader");
	notCompleted.textContent = "UnCompleted Todos" + " "+uncompletedTodos;

}
if(value === "completedTodos"){
	completedTodos--;
		
		var completed = document.getElementById("CompletedElementHeader");
		completed.textContent = "Completed Todos" + " "+completedTodos;

}

	for(var i = 0;i<localStorage.length;i++){
		const keyValue = localStorage.key(i);

		if (key === keyValue) {
			localStorage.removeItem(keyValue);
			
		}
	}
   
}
