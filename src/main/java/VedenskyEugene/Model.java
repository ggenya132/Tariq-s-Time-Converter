package VedenskyEugene;

/**
 * Created by eugenevendensky on 2/14/17.
 */
public class Model {



    public String[] splitTimeInputStringByColon(String time){

        return time.split(":");
    }

    public String buildTimeIntoString(String[] timeInputStringArray) throws CustomException{

        StringBuilder stringBuilder = new StringBuilder();

        if(Integer.parseInt(timeInputStringArray[0])>12 | Integer.parseInt(timeInputStringArray[1])>60){
            throw new CustomException();
        }

        switch (timeInputStringArray[0]) {
            case "0":
            throw new CustomException();
            case "1" :
            stringBuilder.append("one");
            break;
            case "2" :
            stringBuilder.append("two");
            break;
            case "3" :
            stringBuilder.append("three");
            break;
            case "4" :
            stringBuilder.append("four");
            break;
            case "5" :
            stringBuilder.append("five");
            break;
            case "6" :
            stringBuilder.append("six");
            break;
            case "7" :
            stringBuilder.append("seven");
            break;
            case "8" :
            stringBuilder.append("eight");
            break;
            case "9" :
            stringBuilder.append("nine");
            break;
            case "10" :
            stringBuilder.append("ten");
            break;
            case "11" :
            stringBuilder.append("eleven");
            break;
            case "12" :
            stringBuilder.append("twelve");
            break;


        }


        switch (timeInputStringArray[1]){

            case "01" :
            stringBuilder.append(" o' one");
            break;
            case "02" :
                stringBuilder.append(" o' two");
                break;
            case "03" :
                stringBuilder.append(" o' three");
                break;
            case "04" :
                stringBuilder.append(" o' four");
                break;
            case "05" :
                stringBuilder.append(" o' five");
                break;
            case "06" :
                stringBuilder.append(" o' six");
                break;
            case "07" :
                stringBuilder.append(" o' seven");
                break;
            case "08" :
                stringBuilder.append(" o' eight");
                break;
            case "09" :
                stringBuilder.append(" o' nine");
                break;
            case "10" :
                stringBuilder.append(" ten ");
                break;
            case "11" :
                stringBuilder.append(" eleven ");
                break;
            case "12" :
                stringBuilder.append(" twelve ");
                break;
            case "13" :
                stringBuilder.append(" thirteen ");
                break;
            case "14" :
                stringBuilder.append(" fourteen ");
                break;
            case "15" :
                stringBuilder.append(" fifteen ");
                break;
            case "16" :
                stringBuilder.append(" sixteen ");
                break;
            case "17" :
                stringBuilder.append(" seventeen ");
                break;
            case "18" :
                stringBuilder.append(" eighteen ");
                break;
            case "19" :
                stringBuilder.append(" nineteen ");
                break;
            case "20" :
                stringBuilder.append(" twenty ");
                break;
            case "21" :
                stringBuilder.append(" twenty-one ");
                break;
            case "22" :
                stringBuilder.append(" twenty-two ");
                break;
            case "23" :
                stringBuilder.append(" twenty-three ");
                break;
            case "24" :
                stringBuilder.append(" twenty-four ");
                break;
            case "25" :
                stringBuilder.append(" twenty-five ");
                break;
            case "26" :
                stringBuilder.append(" twenty-six ");
                break;
            case "27" :
                stringBuilder.append(" twenty-seven ");
                break;
            case "28" :
                stringBuilder.append(" twenty-eight ");
                break;
            case "29" :
                stringBuilder.append(" twenty-nine ");
                break;
            case "30" :
                stringBuilder.append(" thirty ");
                break;
            case "31" :
                stringBuilder.append(" thirty-one ");
                break;
            case "32" :
                stringBuilder.append(" thirty-two ");
                break;
            case "33" :
                stringBuilder.append(" thirty-three ");
                break;
            case "34" :
                stringBuilder.append(" thirty-four ");
                break;
            case "35" :
                stringBuilder.append(" thirty-five ");
                break;
            case "36" :
                stringBuilder.append(" thirty-six ");
                break;
            case "37" :
                stringBuilder.append(" thirty-seven ");
                break;
            case "38" :
                stringBuilder.append(" thirty-eight ");
                break;
            case "39" :
                stringBuilder.append(" thirty-nine ");
                break;
            case "40" :
                stringBuilder.append(" forty ");
                break;
            case "41" :
                stringBuilder.append(" forty-one ");
                break;
            case "42" :
                stringBuilder.append(" forty-two ");
                break;
            case "43" :
                stringBuilder.append(" forty-three ");
                break;
            case "44" :
                stringBuilder.append(" forty-four ");
                break;
            case "45" :
                stringBuilder.append(" forty-five ");
                break;
            case "46" :
                stringBuilder.append(" forty-six ");
                break;
            case "47" :
                stringBuilder.append(" forty-seven ");
                break;
            case "48" :
                stringBuilder.append(" forty-eight ");
                break;
            case "49" :
                stringBuilder.append(" forty-nine ");
                break;
            case "50" :
                stringBuilder.append(" fifty ");
                break;
            case "51" :
                stringBuilder.append(" fifty-one ");
                break;
            case "52" :
                stringBuilder.append(" fifty-two ");
                break;
            case "53" :
                stringBuilder.append(" fifty-three ");
                break;
            case "54" :
                stringBuilder.append(" fifty-four ");
                break;
            case "55" :
                stringBuilder.append(" fifty-five ");
                break;
            case "56" :
                stringBuilder.append(" fifty-six ");
                break;
            case "57" :
                stringBuilder.append(" fifty-seven ");
                break;
            case "58" :
                stringBuilder.append(" fifty-eight ");
                break;
            case "59" :
                stringBuilder.append(" fifty-nine ");
                break;
            case "60" :
                stringBuilder.append(" sixty ");
                break;


        }

        return stringBuilder.toString();
    }


}
