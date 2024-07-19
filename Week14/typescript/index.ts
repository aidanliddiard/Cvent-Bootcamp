interface Mountain {
    name: string;
    height: number;
}

const mountains: Array<Mountain> = [
    { name: "Kilimanjaro", height: 19341 },
    { name: "Everest", height: 29029},
    { name: "Denali", height: 20310}
];

function findNameOfTallestMountain(arrayOfMts: Array<Mountain>): string{
        const tallest: Mountain = {name: '', height: 0};
        arrayOfMts.forEach(mountain => {
            if (mountain.height > tallest.height) {
                tallest.name = mountain.name;
                tallest.height = mountain.height;
            }
        }); 
        return tallest.name;
    }

    const tallestMt: string = findNameOfTallestMountain(mountains);
    console.log(tallestMt);