var todos = [];
var completedTodosCount = 0;
var uncompletedTodosCount = 0;

for(var i = 0;i<localStorage.length;i++){


	const key = localStorage.key(i);
	const value = localStorage.getItem(key);
	var li =document.createElement("li");
	var text = document.createTextNode(key);
	li.appendChild(text);
	
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
    if(value === "uncompletedTodos"){
    	uncompletedTodosCount++;
    	var header = document.getElementById("UncompletedElementsHeader");
    	header.textContent = "UnCompleted Todos "+uncompletedTodosCount;
    	document.getElementById("UncompletedElements").appendChild(li);

    }
    if (value === "completedTodos") {
    	completedTodosCount++;
    	var header = document.getElementById("CompletedElementHeader");
    	header.textContent = "Completed Todos "+completedTodosCount;
    	document.getElementById("CompletedElement").appendChild(li);
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
	
	uncompletedTodosCount++;
	i.textContent = "UnCompleted Todos" + " "+uncompletedTodosCount;
		
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
	completedTodosCount++;
	uncompletedTodosCount--;
	completed.textContent = "Completed Todos" + " "+completedTodosCount;
	notCompleted.textContent = "UnCompleted Todos" + " "+uncompletedTodosCount;

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
	uncompletedTodosCount++;
	completedTodosCount--;
	notCompleted.textContent = "UnCompleted Todos" + " "+uncompletedTodosCount;
	completed.textContent = "Completed Todos" + " "+completedTodosCount;
	var key = element.firstChild.textContent;
	var value = "uncompletedTodosCount";
	localStorage.setItem(key,value);
	

}





function deleteElement(){
	var li = this.parentElement;
	var text = li.textContent;
	
	for(var i =0;i<todos.length;i++){
		
	
		if(todos[i]===text){
			todos.splice(i,1);
			
			
		}
	}
	const key = li.firstChild.textContent;
	const value = localStorage.getItem(key);
	
	if(value === "uncompletedTodos"){
	uncompletedTodosCount --;
	var notCompleted = document.getElementById("UncompletedElementsHeader");
	notCompleted.textContent = "UnCompleted Todos" + " "+uncompletedTodosCount;

}
if(value === "completedTodos"){
	completedTodosCount--;	
	var completed = document.getElementById("CompletedElementHeader");
	completed.textContent = "Completed Todos" + " "+completedTodosCount;

}

	for(var i = 0;i<localStorage.length;i++){
		const keyValue = localStorage.key(i);

		if (key === keyValue) {
			localStorage.removeItem(keyValue);
			
		}
	}

	li.remove();
   
}
