package baseball.Domain;

public class ThrowBall {
    private int firstCount;
    private int secondCount;
    private int thirdCount;

    public ThrowBall(String readLine) {
        firstCount = readLine.charAt(0)-'0';
        secondCount = readLine.charAt(1)-'0';
        thirdCount = readLine.charAt(2)-'0';
    }
    public int getTrowBall(int i)
    {
        if(i==0)
        {
           return firstCount;
        }else if(i==1)
        {
            return secondCount;
        }else if(i==2)
        {
            return thirdCount;
        }
        //다른곳에서 예외처리해서 도달하지 않을 영역
        return 0;
    }

}
