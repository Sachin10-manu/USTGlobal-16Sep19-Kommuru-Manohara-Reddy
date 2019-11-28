import { ElementRef, Directive, HostBinding, HostListener } from "@angular/core";


@Directive({
    selector : '[custDir]'
})


export class customDirective {
    constructor(private el: ElementRef) {
        this.el.nativeElement.style.backgroundColor = 'green';
    }

    @HostBinding('style.color') color = 'red';
    @HostBinding('style.backgroundColor') colorName = 'blue';

    @HostListener('mouseenter') m() {
        this.el.nativeElement.style.backgroundColor = 'black';
    }
    @HostListener('mouseleave') n() {
        this.el.nativeElement.style.backgroundColor = 'yellow';
    }
}
