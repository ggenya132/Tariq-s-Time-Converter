package VedenskyEugene;

/**
 * Created by eugenevendensky on 2/14/17.
 */
public class Controller {

    Model model = new Model();
    View view = new View();

    public void coreLoop(){
        try {
            view.returnParsedTime(model.buildTimeIntoString(model.splitTimeInputStringByColon(view.askUserTime())));
            //It's my code and I'll do this if I want to
        }
        catch (CustomException e){System.out.println("Not a valid time");}
    }
    }


