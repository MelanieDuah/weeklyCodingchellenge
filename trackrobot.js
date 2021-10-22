let endCoordinates= trackRobot([20, 30, 10, 40]);
console.log(endCoordinates);

function trackRobot(movements) {
    let currentX = 0;
    let currentY = 0;

    let direction = 'UP';

    for (let movement of movements) {
        if (direction == 'UP') {
            currentY += movement;
            direction = 'RIGHT';
        } else if (direction == 'RIGHT') {
            currentX += movement;
            direction = 'DOWN';
        } else if (direction == 'DOWN'){
            currentY -= movement;
            direction = 'LEFT';
        } else if(direction == 'LEFT'){
            currentX -= movement;
            direction = 'UP';
        }
    }

    return [currentX, currentY];
}