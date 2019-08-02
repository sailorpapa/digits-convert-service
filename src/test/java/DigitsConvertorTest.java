import com.marslin.showtime.convertor.DigitsConvertor;
import com.marslin.showtime.convertor.DigitsConvertor99;
import org.junit.Test;

public class DigitsConvertorTest {
    @Test
    public void zeroToNine(){
        int[] number = {2,3};
        int len = number.length;
        DigitsConvertor dc = new DigitsConvertor(number, len);
        dc.letterCombinationsZeroToNine();
    }
    @Test
    public void zeroTo99(){
        int[] number = {5,99};
        int len = number.length;
        DigitsConvertor99 dc99 = new DigitsConvertor99(number, len);
        dc99.letterCombinationsZeroTo99();
    }

}
