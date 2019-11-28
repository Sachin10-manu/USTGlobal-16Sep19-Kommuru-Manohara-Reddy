const items = [{
    name : 'Ear Ring',
    id : 2,
    price : 5000
},{
    name : 'kajal',
    id : 2,
    price : 1000
},{
    name : 'Trimmer',
    id : 3,
    price : 3000
},{
    name : 'Beard oil',
    id : 4,
    price : 170
}]

const updatedItem = items.map(function(item,index){
    item.price = item.price+300
    return item;
})
console.log(updatedItem)

// const items1 = 
const itemsArrow = items.map(value => {
    // const store = {}; 
    // store.name= value.name;
    // store.id=value.id;
    // store
    value.price=value.price+300;
    return value;
})
console.log(itemsArrow); 


// const items2 = items.map(value => value.price+300);
// console.log('After Map arrow function',items2);

console.log('=========2==============')
const cars = [{
    name : 'Audi',
    id : 2,
    price : 500000
},{
    name : 'BMW',
    id : 2,
    price : 1000000
},{
    name : 'Nano',
    id : 3,
    price : 100000
},{
    name : 'Swift',
    id : 4,
    price : 500000
}]

const cars1 = cars.map(value =>{
    const store = {};
    store.name = value.name;
    store.id = value.id;
    store.price = value.price+300;
    return store;
})
console.log(cars1)
//console.log(items)

// const cars2 = cars.map(value => value.price+300);
// console.log('After Map arrow function',cars2);

console.log('=========3===================')

const bikes = [{
    name : 'Duke',
    id : 2,
    price : 200000
},{
    name : 'NS200',
    id : 2,
    price : 200000
},{
    name : 'CBR',
    id : 3,
    price : 150000
},{
    name : 'KTM',
    id : 4,
    price : 200000
}]

const bikes1 = bikes.map(value =>{
    const store = {};
    store.name = value.name;
    store.id = value.id;
    store.price = value.price+300;
    return store;
})
console.log(bikes1)
//console.log(items)

// const bikes2 = bikes.map(value => value.price+300);
// console.log('After Map arrow function',bikes2);

console.log('=========4===================')

const mobiles = [{
    name : 'Redmi',
    id : 2,
    price : 20000
},{
    name : 'Honor 7x',
    id : 2,
    price : 20000
},{
    name : 'Nokia',
    id : 3,
    price : 15000
},{
    name : 'Samsung',
    id : 4,
    price : 25000
}]

const mobiles1 = mobiles.map(value =>{
    const store = {};
    store.name = value.name;
    store.id = value.id;
    store.price = value.price+300;
    return store;
})
console.log(mobiles1)
//console.log(items)

// const mobiles2 = mobiles.map(value => value.price+300);
// console.log('After Map arrow function',mobiles2);

console.log('=========5===================')

const books = [{
    name : 'A',
    id : 2,
    price : 200
},{
    name : 'B',
    id : 2,
    price : 300
},{
    name : 'C',
    id : 3,
    price : 150
},{
    name : 'D',
    id : 4,
    price : 2000
}]

const books1 = books.map(value =>{
    const store = {};
    store.name = value.name;
    store.id = value.id;
    store.price = value.price+300;
    return store;
})
console.log(books1)
//console.log(items)

// const books2 = books.map(value => value.price+300);
// console.log('After Map arrow function',books2);

console.log('=========6===================')

const movieTickets = [{
    name : 'Sahoo',
    id : 2,
    price : 200
},{
    name : 'Valmiki',
    id : 2,
    price : 150
},{
    name : 'Sye ra',
    id : 3,
    price : 300
},{
    name : 'Arjun reddy',
    id : 4,
    price : 200
}]

const movieTickets1 = movieTickets.map(value =>{
    const store = {};
    store.name = value.name;
    store.id = value.id;
    store.price = value.price+300;
    return store;
})
console.log(movieTickets1)
//console.log(items)

// const movieTickets2 = movieTickets.map(value => value.price+300);
// console.log('After Map arrow function',movieTickets2);

console.log('=========7===================')

const pens = [{
    name : 'Reynolds',
    id : 2,
    price : 20
},{
    name : 'B',
    id : 2,
    price : 20
},{
    name : 'C',
    id : 3,
    price : 15
},{
    name : 'D',
    id : 4,
    price : 20
}]

const pens1 = pens.map(value =>{
    const store = {};
    store.name = value.name;
    store.id = value.id;
    store.price = value.price+300;
    return store;
})
console.log(pens1)
//console.log(items)

// const pens2 = pens.map(value => value.price+300);
// console.log('After Map arrow function',pens2);

console.log('=========8===================')

const pencils = [{
    name : 'A',
    id : 2,
    price : 20
},{
    name : 'B',
    id : 2,
    price : 20
},{
    name : 'C',
    id : 3,
    price : 15
},{
    name : 'D',
    id : 4,
    price : 20
}]

const pencils1 = pencils.map(value =>{
    const store = {};
    store.name = value.name;
    store.id = value.id;
    store.price = value.price+300;
    return store;
})
console.log(pencils1)
//console.log(items)

// const pencils2 = pencils.map(value => value.price+300);
// console.log('After Map arrow function',pencils2);

console.log('=========9===================')

const Shoes = [{
    name : 'Reebook',
    id : 2,
    price : 2000
},{
    name : 'Adidas',
    id : 2,
    price : 2500
},{
    name : 'Puma',
    id : 3,
    price : 3000
},{
    name : 'Sparx',
    id : 4,
    price : 1000
}]

const Shoes1 = Shoes.map(value =>{
    const store = {};
    store.name = value.name;
    store.id = value.id;
    store.price = value.price+300;
    return store;
})
console.log(Shoes1)
//console.log(items)

// const Shoes2 = Shoes.map(value => value.price+300);
// console.log('After Map arrow function',Shoes2);

console.log('=========10===================')

const Shirts = [{
    name : 'Puma',
    id : 2,
    price : 1500
},{
    name : 'Arrow',
    id : 2,
    price : 700
},{
    name : 'Allen solley',
    id : 3,
    price : 1500
},{
    name : 'Reymond',
    id : 4,
    price : 2000
}]

const Shirts1 = Shirts.map(value =>{
    const store = {};
    store.name = value.name;
    store.id = value.id;
    store.price = value.price+300;
    return store;
})
console.log(Shirts1)
//console.log(items)

// const Shirts2 = Shirts.map(value => value.price+300);
// console.log('After Map arrow function',Shirts2);