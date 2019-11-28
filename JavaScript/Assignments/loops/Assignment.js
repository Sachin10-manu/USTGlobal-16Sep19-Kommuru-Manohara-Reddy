var cars = ['Audi','Ferrari','BMW','Skoda','Scorpio','Swift',]
for (var element of cars){
    console.log('Cars =',element);
}

console.log("==================================")

for (var index in cars){
    console.log('Cars =',cars[index]);
}

console.log("===================================")

var Car = {
    name : 'Audi',
    Color : "White",
    Model : 2020,
}
for (var key in Car){
    console.log('Cars =',Car[key]);
}

console.log("=====================================")

for (var i=0;i<cars.length;i++){
    console.log('Cars =',cars[i]);
}

console.log("======================================")

cars.forEach(function(value,index){
    console.log('Value =',cars);
    console.log('index =',index);
})

console.log("===========examples for for loop==========");
var colors = ["red","pink","blue","yellow","black"];
var i;
for( i = 0;i<colors.length; i++)
{
    console.log("colors are = ",colors[i]);
}

console.log("===============2nd==================");

var bikes = ["Shine","royal","duke",];
for(var i = 0;i<bikes.length;i++)
{
    console.log("bikes are = ",bikes[i]);
}
console.log("===============3rd==================");
var brands = ["bukadi","vodka","jhony walker","king fisher"];
for(var i = 0;i<brands.length;i++)
{
    console.log("brands are = ",brands[i]);
}

console.log("===============4th==================");

var Devices = ["laptop","mobile","charger"];
for(var i = 0;i<Devices.length;i++)
{
    console.log("electronics are = ",Devices[i]);
}

console.log("===========5th===================== ");
var books = ["Hima","Theja","Swamy","Mani"];
for(var i = 0;i<books.length;i++)
{
    console.log("books are = ",books[i]);
}
console.log("===================6th=============");
var pensil = ["P1","P2","P3"];
for(var i = 0;i<pensil.length;i++)
{
    console.log("pensils are = ",pensil[i]);
}

console.log("============7th===========");
var colors = ["red","black","pink","green"];
for(var i = 0;i<colors.length;i++)
{
    console.log("colors are = ",colors[i]);
}

console.log("==============8th==============");
var state = ["mp","up","ap","bihar"];
for(var i = 0;i<state.length;i++)
{
    console.log("states are = ",state[i]);
}

console.log("===============9th================");
var actor = ["ranbineer","Vijay","Nithin","Prabhas"];
for(var i = 0;i<actor.length;i++)
{
    console.log("actors are = ",actor[i]);
}

console.log("===============10th=============");
var heroine = ["Kajal","Samantha","Thamanna","Meena"];
for(var i = 0;i<heroine.length;i++)
{
    console.log("heroines are = ",heroine[i]);
}

console.log("===========for of=============");
var books = ["B1","B2","B3","B4"];

for( var values of books)
{
    console.log("value = ",values);
}

console.log("============2nd==============");

var Devices = ["laptop","mobile","charger"];
for( var example of Devices)
{
    console.log("Devices are = ",example);
}

console.log("==========3rd=============");
var restuarants = ["swathi","kruthanga","nanadana","druid"];
for(var element of restuarants)
{
    console.log("restaurants are = ",element);

}
console.log("==============4th================");
var shopping = ["cloths","jeans","earphone"];
for(var result of shopping)
{
    console.log("shopping are = ",result);
}

console.log("============5th========");
var bikes = ["fz","royal","duke","unicorn"];
for(var result of bikes)
{
    console.log("bikes are = ",result);

}
console.log("============6th================");
var heroine = ["Kajal","Samantha","Thamanna","Meena"];
for(var result of heroine)
{
    console.log("heroines are = ",result);
}
console.log("============7th==============");
var actors = ["Vijay","Nithin","Ram","Cherry"];
for(var result of actors)
{
    console.log("actors are = ",result);
}

console.log("============8th===========");
var colors = ["red","black","pink","green"];
for(var result of colors)
{
    console.log("actorss are = ",result);
}
console.log("===========9th=============");
var countries = ["USA","SA","Australia","Singapore"];
for(var result of countries)
{
    console.log("Countries are = ",result);
}
console.log("===============10th==============");
var pen = ["red","black","blue","green"];
for(var result of pen)
{
    console.log("Pens are = ",result);
}


console.log("==========for in=============");


var books = ["Hima","Theja","Swamy","Mani"];

for( var values in books)
{
    console.log("value = ",books[values]);
}

console.log("============2nd=============");
var bikes = ["fz","royal","duke"];
for(var result in bikes)
{
    console.log("bikes are = ",bikes[result]);
}
console.log("=========3rd=======");
var books = ["Hima","Theja","Swamy","Mani"];

for( var values in books)
{
    console.log("value = ",books[values]);
}
console.log("============4th=============");

var shopping = ["cloths","jeans","earphone"];
for(var result in shopping)
{
    console.log("shopping are = ",shopping[result]);
}
console.log("============5th=============");
var restaurants = ["swathi","kruthanga","nanadana","druid"];
for(var element in restuarants)
{
    console.log("restaurants are = ",restuarants[element]);

}
console.log("============6th=============");
var heroine = ["Kajal","Samantha","Thamanna","Meena"];
for(var result in heroine)
{
    console.log("actoress are = ",heroine[result]);
}
console.log("============7th=============");
var actors = ["ranbineer","Vijay","Nithin","Prabhas"];
for(var result in actors)
{
    console.log("actors are = ",actors[result]);
}

console.log("============8th=============");
var colors = ["red","black","pink","green"];
for(var result in colors)
{
    console.log("Colors are = ",colors[result]);
}
console.log("============9th=============");
var countries = ["USA","SA","Australia","Singapore"];
for(var result in countries)
{
    console.log("Countries are = ",countries[result]);
}
console.log("============10th=============");
var pen = ["red","black","pink","green"];
for(var result in pen)
{
    console.log("Pens are = ",pen[result]);
}


console.log("============for each==============");
var cars = ['audi','bmw','ferrari'];
cars.forEach(function(value,index){
    console.log('car = ',value);
})

console.log("============2nd=============");
var restaurants = ["swathi","kruthanga","nanadana","druid"];
restuarants.forEach(function(value,index){
    console.log('restaurants = ',value);
})

console.log("============3rd=============");
var books = ["Hima","Theja","Swamy","Mani"];
books.forEach(function(value,index){
    console.log('books = ',value);
})

console.log("============4th=============");
var bikes = ["royal enfiels","duke","unicorn"];
bikes.forEach(function(value,index){
    console.log('bikes = ',value);
})

console.log("============5th=============");
var shopping = ["cloths","jeans","earphone"];
shopping.forEach(function(value,index){
    console.log('shopping = ',value);
})
console.log("============6th=============");
var heroine = ["Kajal","Samantha","Thamanna","Meena"];
heroine.forEach(function(value,index){
    
    console.log("heroines are = ",value);
})

console.log("============7th=============");
var actor = ["ranbineer","Vijay","Nithin","Prabhas"];
actor.forEach(function(value,index)
    {
    console.log("actors are = ",value);
})

console.log("============8th=============");
var colors = ["red","black","blue","green"];
colors.forEach(function(value,index){
    
    console.log("colors are = ",value);
})
console.log("============9th=============");
var countries = ["USA","SA","Australia","Singapore"];
countries.forEach(function(value,index){
    
    console.log("Countries are = ",value);
})

console.log("============10th=============");
var pen = ["red","black","pink","green"];
pen.forEach(function(value,index){
    
    console.log("Pens are = ",value);
})

