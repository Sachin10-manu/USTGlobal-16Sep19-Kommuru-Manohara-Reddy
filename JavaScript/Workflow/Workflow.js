// function first(){
//     setTimeout(function(){
//     console.log('First Function Executed');
//     },0)

//     console.log('Executed')
// }

// function second(){
//     console.log('Second Function Executed');
// }

// first();
// second();


// callback function.....................................
function first(callback){
    setTimeout(function(){
    console.log('First Function Executed');
    callback();
    },0)

    //console.log('Executed')
}

function second(){
    console.log('Second Function Executed');
}

first(second);
//second();