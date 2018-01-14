/*
 * a ^ b  可以完成 a,b不带进位的伪加法
 * (a & b) << 1 得到的是进位
 * (a ^ b) + (a & b) << 1 == a + b
 * 因为不能用+ 操作符, 并且(a & b) << 1 == 0 时结果
 * 就是 a ^ b, 所以可以用递归的方式解决
 */
public class Solution {
    /*
     * @param : An integer
     * @param : An integer
     * @return: The sum of a and b
     */
    public int aplusb(int a, int b) {
        // write your code here

        if ( (a & b) << 1 == 0)
			return a ^ b;
		else
			return aplusb(a ^ b, (a & b) << 1);
    }
};
