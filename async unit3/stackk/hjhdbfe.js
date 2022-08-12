// Row with maximum number of 1's Ended
// Description

// Given a row-wise sorted 2D binary matrix A  of dimensions NxM determine the row that contains a maximum number of 1s.

// Note-The matrix contains only 1s and 0s. Also, if two or more rows contain the maximum number of 1s, the answer is the lowest of those indices.


// Input
// Input Format

// First-line contains T, no of test cases.

// First-line of each test case contains N, number of rows, and M, number of columns.

// Following N-lines contain M space-separated integers.

// Constraints

// 1 <= T <= 10

// 1 <= N <= 10^3

// 1 <= M <= 10^3

// 0 <= A[i][j] <= 1


// Output
// For each test case, print the row-index (1-based indexing) having a maximum number of 1s, and if there is no row that contains 1s print index of the first row in a new line.


// Sample Input 1 

// 3
// 3 3
// 0 0 0
// 0 0 0
// 0 0 0
// 3 3
// 0 1 1
// 0 1 1
// 0 1 1
// 2 2
// 0 1
// 1 1
// Sample Output 1

// 1
// 1
// 2
// Hint

// For the first test case, there is no row that contains 1s therefore answer is 1.

// For the second test case, all the three rows have an equal number of 1s therefore answer is the lowest of them that is 1.

// For the third test case, the 2nd row has a maximum number of 1s therefore the answer is 2.