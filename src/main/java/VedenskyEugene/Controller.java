package VedenskyEugene;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by eugenevendensky on 2/14/17.
 */
public class Controller {

    Model model = new Model();
    View view = new View();





    public void coreLoop(){
        try {
            String userTimeInput =  view.askUserTime();
            Pattern standardTimeCheckerPattern = Pattern.compile("([01]?[0-9]|2[0-3])(:|\\s?)[0-5][0-9]((\\s?)[a|A|p|P](.?)[m|M](.?))");
            Pattern militaryTimeCheckerPattern = Pattern.compile("([0-2][0-9]:[0-6][0-9])");
            Matcher militaryTimeMatcher = militaryTimeCheckerPattern.matcher(userTimeInput);
            Matcher standardTimeMatcher = standardTimeCheckerPattern.matcher(userTimeInput);
            if (standardTimeMatcher.find()) {

                view.returnParsedTime(model.buildTimeIntoString(model.splitTimeInputStringByColon(userTimeInput)));

                //It's my code and I'll do this if I want to
            }
            else if(militaryTimeMatcher.find()){

                view.returnParsedTime(model.buildTimeIntoStringMilitary(model.splitTimeInputStringByColon(userTimeInput)));
            }

            else{
                throw new InvalidTimeException();
            }
        }

        catch (InvalidTimeException e){System.out.println("Not a valid time");}
    }
    }


