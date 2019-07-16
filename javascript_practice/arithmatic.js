
document.addEventListener('DOMContentLoaded', bindButtons);

function bindButtons() {
	document.getElementById('plus').addEventListener('click', function(event) {
	//x and y are integers to be operated on
	var x = Number(document.getElementById('first').value);
	var y = Number(document.getElementById('second').value);
	var answer = x + y;

	document.getElementById('answer').textContent = answer;
	console.log('test');

	event.preventDefault();
	});

	//subtract
	document.getElementById('minus').addEventListener('click', function(event) {
	//x and y are integers to be operated on
	var x = Number(document.getElementById('first').value);
	var y = Number(document.getElementById('second').value);
	var answer = x - y;

	document.getElementById('answer').textContent = answer;
	console.log('test');

	event.preventDefault();
	});

	//multiply
	document.getElementById('times').addEventListener('click', function(event) {
	//x and y are integers to be operated on
	var x = Number(document.getElementById('first').value);
	var y = Number(document.getElementById('second').value);
	var answer = x * y;

	document.getElementById('answer').textContent = answer;
	console.log('test');

	event.preventDefault();
	});
	
	//divide
	document.getElementById('divide').addEventListener('click', function(event) {
	//x and y are integers to be operated on
	var x = Number(document.getElementById('first').value);
	var y = Number(document.getElementById('second').value);
	var answer = x / y;

	document.getElementById('answer').textContent = answer;
	console.log('test');

	event.preventDefault();
	});
}
