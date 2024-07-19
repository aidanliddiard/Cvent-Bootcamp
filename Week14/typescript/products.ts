export interface Product {
    name: string;
    price: number;
}

const productsArray: Product[] = [
    {name: "toothbrush", price: 2.99},
    {name: "toothpaste", price: 4.99},
    {name: "floss", price: 1.99},
    {name: "mouthwash", price: 5.99}
];

function calcAverageProductPrice(array: Product[]){
    let totalPrice : number = 0;
    array.forEach(product => {
        totalPrice += product.price;
    }) 
    let average = totalPrice / array.length;
    return average;
}

console.log(calcAverageProductPrice(productsArray));