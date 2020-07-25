var todos = [];
var completedTodos = 0;
var uncompletedTodos = 0;

function addElement(){
		var li = document.createElement("li");
		var text = document.getElementById("InputBox").value;
		var t = document.createTextNode(text);
		li.appendChild(t);
		if(text === ''){
			alert("You must type something")
		}
		else{
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

function addCompletedElement(){
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
}

function revokeCompletedElement(){
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
   
}
