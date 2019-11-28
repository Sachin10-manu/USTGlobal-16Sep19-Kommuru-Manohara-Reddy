// var brands = ['kingfisher','bisleri','aqua','kinley']
// for(var element of brands){
//     console.log('Brand =',element);
// }
// console.log('=============================');

// console.log('For In Loop');
// for(var index in brands){
//     console.log('Brand =',brands[index]);
// }

// console.log('==============================');
// var person = {
//     name :'Sundari',
//     age : 33,
//     color : 'White'
// }
// for(var key in person){
//     console.log('Value =',person[key]);
// }

// console.log('forEach')
// var movies = ['sholey','Mayabazar','jurassic park','titanic']
// movies.forEach(function(value,index){
//     console.log('Movie =',value);
//     console.log('Movie index =',index);
// })

// var items = [{
//     item : 'bangle',
//     id : 1,
//     price : 100
// },
// {
//     item : 'eyeliner',
//     id : 2,
//     price : 100
// },
// {
//     item : 'watch',
//     id : 3,
//     price : 5000
// },
// {
//     item : 'Bike',
//     id : 4,
//     price : 100000
// }]
// items.forEach(function(item,index){
//     console.log('Item =',item);
//     console.log('Index of item =',index);
// })

//var keyword

var name; //declaration
var name = 'pailwan' //initialization
name = 'prasthanam' //re assigning

//let keyword

//console.log(name1) hoisting
let name1; //declaration
//let name1 = 'saaho' //initialization
name1 = 'Valmiki' // re assigning

//const keyword

//const name2; //declaration
const name2 = 'Dream Girl' //initialization
// name2 = 'kabir' //reassigning

console.log('=======using var keyword========')

for(var i=0;i<5;i++){
    console.log('Inside for loop',i);    
}
console.log('Outside for loop',i);

console.log('=======using let keyword========')

for(let j=0;j<5;j++){
    console.log('Inside for loop',j);    
}
console.log('Outside for loop',j);