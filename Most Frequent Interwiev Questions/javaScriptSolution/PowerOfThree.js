function isPowerOfThree(n) {
  if (n <= 0) {
    return false;
  }
  while (n % 3 === 0) {
    n /= 3;
  }
  return n === 1;
}

console.log(isPowerOfThree(27));  // Output: true
console.log(isPowerOfThree(0));   // Output: false
console.log(isPowerOfThree(-1));  // Output: false
