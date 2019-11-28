const hobbies = ['Sleeping','eating','cricket','coding','roaming'];
console.log(typeof hobbies);
const isArrayOrNot = Array.isArray(hobbies)
console.log('Hobbies array or not',isArrayOrNot);
const hasCricket = hobbies.includes('cricket',0);
console.log('using includes method',hasCricket)
console.log('After push method',hobbies.push('guitar','volley ball'))
console.log('After pop method',hobbies.pop());
console.log('After unshift',hobbies.unshift('numiusmatics','singing'))
console.log('After shift',hobbies.shift())

const hobbies1 = ['Sleeping','eating','cricket','coding','roaming']
// hobbies1.splice(1,2,'Bird Watching','PUBG')
// console.log('After splice',hobbies1)
// const afterSlice = hobbies1.slice(2,4)
// console.log('After slice',afterSlice)

console.log('Index of',hobbies1.indexOf('cricket',3))
console.log('After join =',hobbies1.join('*'))

const numbers = [100,200,300,400]
const numbers1 = numbers.map(function(value,Index){
    const newValue = value+50;
    return newValue;
})
console.log('After Map Method ',numbers1);

const numbers2 = numbers.map(value => value+50);
console.log('After Map arrow function',numbers2);

const num = numbers.filter(function(value,index){
    if(value>200){
        return true;
    }else{
        return false;
    }
})
console.log('After filter Method ',num)

const num1 = numbers.filter(value => value>200)
console.log('After filter arrow function ',num1)

