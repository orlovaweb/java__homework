const array = [8, 6, 9, 4, 5, 7, 1, 2, 3]

const merge = (leftArray, rightArray) => {
  const resultArray = []
  const len = rightArray.length + leftArray.length;
  for (let i = 0; i < len; i++) {
    if (leftArray[0] < rightArray[0]) {
      resultArray.push(...leftArray.splice(0, 1));
    }
    else {
      resultArray.push(...rightArray.splice(0, 1));
    }
    if (rightArray.length === 0) resultArray.push(...leftArray.splice(0, 1));
  }
  return resultArray;
}

const split = (array) => {
  const splitedArray = [];
  for (let i = 0; i < array.length; i = i + 2) {
    if (array[i + 1])
      splitedArray.push([array[i], array[i + 1]])
    else splitedArray.push([array[i]])
  }
  for (let i = 0; i < splitedArray.length; i++) {
    if (splitedArray[i][1]) {
      if (splitedArray[i][0] > splitedArray[i][1]) {
        [splitedArray[i][0], splitedArray[i][1]] = [splitedArray[i][1], splitedArray[i][0]]
      }
    }
  }

  while (splitedArray.length > 1) {
    splitedArray.push(merge(splitedArray[0], splitedArray[1]));
    splitedArray.splice(0, 2);
  }
  return splitedArray;
}
console.log(...split(array));
