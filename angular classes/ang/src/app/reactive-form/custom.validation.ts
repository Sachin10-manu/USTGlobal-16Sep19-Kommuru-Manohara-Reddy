import { AbstractControl, ValidationErrors } from '@angular/forms';




export class CustomValidation {
    constructor() {}
    static unique(control: AbstractControl): ValidationErrors | null {
        if (control.value === 'manoharr604@gmail.com') {
            return {unique : true};
        } else {
            return null;
        }
    }
}
