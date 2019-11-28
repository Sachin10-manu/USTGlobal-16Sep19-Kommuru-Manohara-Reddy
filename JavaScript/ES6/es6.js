const message = new Promise(function(resolve,reject){
    if(30>20){
        resolve('Success')
    }else{
        reject('Failed')
    }
})
message.then(function(msg){
    console.log('Success Message',msg)
}).catch(function(error){
    console.log('Failed Message',error)
})

// ======================================

const employees = new Promise(function(resolve,reject){
    if(50>20){
        resolve([{
            name : 'Billgates',
            age : 67
        },{
            name : 'Mark Zukerbarg',
            age : 47
        },{
            name : 'Jeff Bezos',
            age : 46
        }])
    }else{
        reject('Failed')
    }
})
employees.then(function(data){
    console.log('Employee data',data)
}).catch(function(error){
    console.log('Failed Message',error)
})

// Clousers
function outerFunction(counter){
    function innerFunction(){
        let count;
        count = counter + 10
        return count;
    }
    return innerFunction;
}
let innerFunc = outerFunction(10)
let counter = innerFunc()
console.log('Counter Value',counter)

const person = {
    name : 'Manu',
    age : 23,
    Weight : 56
}
let {name,age} = person