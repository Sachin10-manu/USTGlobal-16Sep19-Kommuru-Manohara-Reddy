const person = {
    name : 'Manu',
    age : 24,
    color : 'White',
    address : {
        city : 'ATP',
        state : 'AP',
        pincode : 515001
    },
    hobbies : ['coding','Bird Watching','singing']
}

console.log('Javascript person object',person)
const jsonObject = JSON.stringify(person)
console.log('JSON person object',jsonObject)
const javaScriptpersonobject = JSON.parse(jsonObject)
console.log('Javascript person object after parse',javaScriptpersonobject)

localStorage.setItem('email','manoharr604@gmail.com')
const emailId = localStorage.getItem('email')
// console.log('EmailId ',localStorage.getItem('email'))
console.log('EmailId',emailId)
localStorage.clear()