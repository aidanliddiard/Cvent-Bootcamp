import {Product} from './products';

interface InventoryItem {
    product: Product,
    quantity: number
}

const inventoryArray : InventoryItem[] = [
    {product: {name: "motor", price: 10.00}, quantity: 10},
    {product: {name: "sensor", price: 12.50}, quantity: 4},
    {product: {name: "LED", price: 1.00}, quantity: 20}
];

function calcInventoryValue(array: InventoryItem[]): number {
    let totalValue: number = 0;
    array.forEach(item => {
        totalValue += item.product.price * item.quantity;
    })
    return totalValue;
}

console.log(calcInventoryValue(inventoryArray));

