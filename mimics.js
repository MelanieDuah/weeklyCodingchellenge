function rightShiftOperator(a, b) {
    return Math.floor(a / Math.floor(Math.pow(2, b)));
}
console.log(rightShiftOperator(80,3));
console.log(rightShiftOperator(-24,2));
console.log(rightShiftOperator(-5,1));
console.log(rightShiftOperator(4666,6));
console.log(rightShiftOperator(3777,6));
console.log(rightShiftOperator(-512,10));