var btn = document.getElementById("startTest");
btn.addEventListener("click",startTest);

var correctAnswers = 0;
var currentQuestion = 1;
var count = 0;
var isAnswerGiven = false;

const Questions = [{id:1, 
	text: "What is capital of India?", 
	option:["Mumbai","Delhi","Chennai"],
    answer: "Delhi"
},
{id:2, 
	text: "Which is the national animal of India?", 
	option:["Lion","Tiger","Fox"],
    answer: "Tiger"
},
{id:3, 
	text: "Which is the national bird of India?", 
	option:["Sparrow","Peacock","Ostrich"],
    answer: "Peacock"
},
{id:4, 
	text: "Which is the national game of India?", 
	option:["Badminton","Cricket","Hockey"],
    answer: "Hockey"
},
{id:5, 
	text: "How many union territories India has?", 
	option:["8","4","3"],
    answer: "8"
},
	
	]

function startTest(){
	this.remove();
	getQuestion();    
 }

 

 function getQuestion(){
 	answerIsAnswerGiven = false;
 	var form = document.createElement("question");
 	form.id = "question";
	var question = Questions[count];
	count++;
	var i = document.createElement("h2");
	i.textContent = "Question "+currentQuestion+" of "+Questions.length;
	form.appendChild(i);
	var questionText = document.createElement("h2");
	questionText.textContent = question.id+"."+question.text;
    form.appendChild(questionText);
   
    
    for(var i =0;i<question.option.length;i++){
     var options = document.createElement("li");
     var text = document.createTextNode(question.option[i]);
     theInput = document.createElement("input");
     theInput.setAttribute("type","radio");
     theInput.setAttribute("name",question.id);
     theInput.onclick = function(){
     	checkCorrectAnswer(this.parentElement.textContent,question.answer);
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




function checkCorrectAnswer(answerGiven,correctAnswer){
	if(answerGiven === correctAnswer)
		correctAnswers++;

	isAnswerGiven = true;	
}

function checkQuizStatus(){	
 	if(isAnswerGiven == true){ 
 	var form = document.getElementById("question");
 	form.remove();
 	currentQuestion++
 	if(currentQuestion <= Questions.length){
 		
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