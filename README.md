# Java Loops II 

We use the integers , , and  to create the following series: <br>
(a + 2^0 * b), (a + 2^0 * b + 2^1 * b),...,(a + 2^0 * b + 2^1 * b + ... + 2^n-1 * b) <br>

You are given q queries in the form of a, b, and n. For each query, print the series corresponding to the given a, b, and n values as a single line of  space-separated integers.

Input Format

The first line contains an integer, q, denoting the number of queries.
Each line i of the q subsequent lines contains three space-separated integers describing the respective a(subscript i), b(subscript i), and n(subscript i) values for that query.

Constraints <br>
- 0 <= q <= 500 <br>
- 0 <= a,b <= 50 <br>
- 1 <= n <= 15

Output Format

For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of n space-separated integers.

Sample Input

2 <br>
0 2 10 <br>
5 3 5 <br>

Sample Output <br>

2 6 14 30 62 126 254 510 1022 2046 <br>
8 14 26 50 98 <br><br>

Explanation

We have two queries:

1. We use a = 0, b = 2, and n = 10 to produce some series s0,s1,...s(subscript n-1):
- s0 = 0 + 1 * 2 = 2
- s1 = 0 + 1 * 2 + 2 * 2 = 6
- s2 = 0 + 1 * 2 + 2 * 2 + 4 * 2 = 14

... and so on.

Once we hit n = 10, we print the first ten terms as a single line of space-separated integers.

We use a = 5, b = 3, and n = 5 to produce some series s0,s1,...,s(subscript n-1):
- s0 = 5 + 1 * 3 = 8
- s1 = 5 + 1 * 3 + 2 * 3 = 14
- s2 = 5 + 1 * 3 + 2 * 3 + 4 * 3 = 26
- s3 = 5 + 1 * 3 + 2 * 3 + 4 * 3 + 8 * 3 = 50
- s4 = 5 + 1 * 3 + 2 * 3 + 4 * 3 + 8 * 3 + 16 * 3 = 98

We then print each element of our series as a single line of space-separated values. <br>

Hackerrank Link: https://www.hackerrank.com/challenges/java-loops/problem

