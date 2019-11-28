console.log('window object',window);
console.log('This keyword',this);
console.log(this === window);

// window.alert('Hi')
// alert('Welcome')
// let confirmDelete = confirm('Are you sure to delete');
// console.log('Confirm Delete',confirmDelete)

// let username = prompt('what is your name','Manu')
// console.log('User Name',username)

const person = {
    firstName : 'Alia',
    age : 26,
    lastName : 'Kapoor',
    getName : function(){
        //console.log('This Keyword',this)
        return this.firstName + ' ' +this.lastName
    }
}
let fullname = person.getName()
console.log('Full Name',fullname)