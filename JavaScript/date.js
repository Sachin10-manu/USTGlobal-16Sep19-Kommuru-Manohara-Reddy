var todayDate=new Date();
console.log('Todays Date ',todayDate);

console.log('Day ',todayDate.getDay());
console.log('Year ',todayDate.getFullYear());
console.log('Month ',todayDate.getMonth());
console.log('Date ',todayDate.getDate());

var constmilli = new Date(0);
console.log('Date ',constmilli);
var constString = new Date('Nov 10');
console.log('Date String Constructor ',constString);
var constYear = new Date(2017,10);
console.log('Date Year Constructor ',constYear);