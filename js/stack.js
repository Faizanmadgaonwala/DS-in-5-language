class stack{
    constructor(){
        this.items = [];
    }
    insert(element) {
        this.items.push(element);
    }
    display() {
        console.log(this.items);
    }
}
stack.insert(1);
stack.insert(2);
stack.insert(3);
stack.display();