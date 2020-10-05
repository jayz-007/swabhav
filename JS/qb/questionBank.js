function Questions(id,text,options,answer){
	var _id = id , _text = text,_options = options,_answer = answer;
	var _correctAnswerGiven = false;

	this.getId = function(){
		return _id;
	}
	 this.getText=function(){
		 return _text;
	 }

	 this.getOptions = function(){
		 return _options;
	 }

	 this.getAnswer=function(){
		 return _answer;
	 }
	 this.setCorrectAnswerrGiven = function(value){
		 _correctAnswerGiven = value;
	 }
	 this.getCorrectAnswerrGiven = function(){
		return _correctAnswerGiven;
	

}
}

var QuestionBankload = [];



var btn = document.getElementById("startTest");
btn.addEventListener("click",startTest);

var correctAnswers = 0;
var currentQuestion = 1;
var count = 0;
var isAnswerGiven = false;

/*var Questions = [{id:1, 
	text: "What is capital of India?", 
	option:["Mumbai","Delhi","Chennai"],
	answer: "Delhi",
	answerGivenflag : false
},
{id:2, 
	text: "Which is the national animal of India?", 
	option:["Lion","Tiger","Fox"],
	answer: "Tiger",
	answerGivenflag : false
},
{id:3, 
	text: "Which is the national bird of India?", 
	option:["Sparrow","Peacock","Ostrich"],
	answer: "Peacock",
	answerGivenflag : false
},
{id:4, 
	text: "Which is the national game of India?", 
	option:["Badminton","Cricket","Hockey"],
	answer: "Hockey",
	answerGivenflag : false
},
{id:5, 
	text: "How many union territories India has?", 
	option:["8","4","3"],
	answer: "8",
	answerGivenflag : false

},
	
	]
*/
function startTest(){
	this.remove();
	const xhr = new XMLHttpRequest();
xhr.open("GET","questions.json",true);
xhr.onload = function() {
	var questionBank = JSON.parse(this.responseText);
	console.log(questionBank);
	for (var i=0;i<questionBank.length;i++){
		var question = new Questions(questionBank.id,questionBank.text,questionBank.option,questionBank.answer);
		QuestionBankload.push(question);
	}
}
xhr.send();
	getQuestion();    
 }

 

 function getQuestion(){
 	answerIsAnswerGiven = false;
 	var form = document.createElement("question");
 	form.id = "question";
	var question = QuestionBankload[count];
	count++;
	var i = document.createElement("h2");
	i.textContent = "Question "+currentQuestion+" of "+QuestionBankload.length;
	form.appendChild(i);
	var questionText = document.createElement("h2");
	questionText.textContent = question.getId()+"."+question.text;
    form.appendChild(questionText);
   
    
    for(var i =0;i<question.getOptions.length;i++){
     var options = document.createElement("li");
     var text = document.createTextNode(question.getOptions()[i]);
     var theInput = document.createElement("input");
     theInput.setAttribute("type","radio");
     theInput.setAttribute("name",question.id);
     theInput.onclick = function(){
     	checkCorrectAnswer(this.parentElement.textContent,question.getAnswer(),question.getCorrectAnswerrGiven(),question);
     }
     var btn = document.createElement("Button");
     btn.innerHTML = "nextQuestion";
     btn.addEventListener("click",checkQuizStatus,false);


     
     options.appendChild(theInput);
     options.appendChild(text);
     form.appendChild(options);

     
     
  }
  form.appendChild(btn);  
  document.body.appendChild(form);
 }




function checkCorrectAnswer(answerGiven,correctAnswer,que){
	isAnswerGiven = true;	
	if(answerGiven === correctAnswer && answerGivenflag === false){
		 correctAnswers++;
		 
		 alert(answerGivenflag + " "+ correctAnswer);
		 que.setCorrectAnswerrGiven(true);
		
	}
	if(answerGiven !== correctAnswer && answerGivenflag === true){
		correctAnswer--;
		que.setCorrectAnswerrGiven(false);
	}




	
}

function checkQuizStatus(){	
 	if(isAnswerGiven == true){ 
 	var form = document.getElementById("question");
 	form.remove();
 	currentQuestion++
 	if(currentQuestion <= QuestionBankload.length){
 		
 		getQuestion();
 	}
 	else 
 		getScore();
}
else{
	alert("Please give a answer");
}

 }

function getScore(){
	var form = document.createElement("result");
	form.id = "result";
	var score = document.createElement("h2");
	score.textContent = "Score is " + correctAnswers;
	form.appendChild(score);
	var result = document.createElement("h2");
	

	if(correctAnswers<2){
		document.body.style.backgroundColor = "red";
		result.textContent = "Result is "+ "Fail";
	}
	else{
		document.body.style.backgroundColor = "green";
		result.textContent="Result is"+" Pass";
	}

	var btn = document.createElement("Button");
	btn.innerHTML = "Try Again";
	btn.addEventListener("click",tryAgain,false);
	form.appendChild(result);
	form.appendChild(btn);


	document.body.appendChild(form);
}

function tryAgain(){
	var element = document.getElementById("result");
	element.remove();

 correctAnswers = 0;
 currentQuestion = 1;
 count = 0;
 document.body.style.backgroundColor = "white";
getQuestion();

}