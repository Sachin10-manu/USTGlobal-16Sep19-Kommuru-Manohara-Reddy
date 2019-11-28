// Named Functions
// function add(num1,num2){
//     console.log('Sum =',num1+num2);
// }
// add(10,20);

// //Function Expression {Anonymous}
// var sub = function(num1,num2){
//     var subValue = num1 - num2;
//     return subValue;
// }
// var value = sub(90,89);
// console.log('Value =',value);

// // function add(num1,num2)
// // {
// //     console.log('Sum =',num1+num2);
// // }

// // function add(num1,num2,num3)
// // {
// //     console.log('Sum =',num1+num2+num3);
// // }

// // add(10,20,30);

// (function(num1,num2){
//     console.log('value =',num1+num2);
// })(20,20)

// var div1 = (num1,num2)=>{
//     console.log('value =',num1/num2);
// }
// div1(10,5);

// var div2 = num1 => console.log(num1)

// div1(10);

// var add = (num1,num2)=>num1+num2;
// var value = add(10,50);
// console.log(value);

// greeting('Manu');
// function greeting(msg){
//     console.log('Hello',msg);
// }

// greet('Sai');
// var greet = function(msg1){
//     console.log('Hi',msg1);
// }

// greets('Reddy')
// var greets = (msg2)=>{
//     console.log('hi',msg);
// }

console.log(hoist);
var hoist;

function hoisting(){
    console.log(hoistingA);
    var hoistingA=10;
}
hoisting();