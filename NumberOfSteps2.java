class NumberOfSteps 2{
public int numberOfSteps(int num) {
    if(num == 0) 
        return 0;
    if((num & 1) == 0) { // num为偶数
        return numberOfSteps1(num >>> 1) + 1;
    }
    else {               // num为奇数       
        return numberOfSteps1(num - 1) + 1;
    }
}
