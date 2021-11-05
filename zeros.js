function zeroesToEnd(array){
    if (array.indexOf(0) !== -1) {
        array.splice(array.indexOf(0),1);
        zeroesToEnd(array);
        array.push(0);
    }
    return array;
}

console.log(zeroesToEnd([1, 2, 0, 0, 4, 0, 5]));
console.log(zeroesToEnd([0, 0, 2, 0, 5]));
console.log(zeroesToEnd([4, 4, 5]));
console.log(zeroesToEnd([0, 0]));