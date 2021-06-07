public class MainClass {

    public int[] firstTask(int... inputArr) {
        int[] resultArr;
        int counter = 0;
        int arrCounter = 0;
        int currentI = 0;
        for(int i = inputArr.length - 1; i >= 0; i--) {
            if (inputArr[i] == 4) {
                currentI = i;
                break;
            } counter++;
        }
        resultArr = new int[counter];
        if (counter != inputArr.length) {
            for (int j = currentI + 1; j < inputArr.length; j++) {
                resultArr[arrCounter] = inputArr[j];
                arrCounter++;
            }
        } else {
            throw new RuntimeException();
        }
        return resultArr;
    }

    public boolean secondTask(int... inputArr){
        int sum = 0;
        int division;
        for (int elem: inputArr) {
            sum += elem;
            if (elem != 4 && elem != 1) return false;
        }
        division = sum / inputArr.length;
        return division != 4 && division != 1;
    }
}
