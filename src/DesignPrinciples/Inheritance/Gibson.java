package DesignPrinciples.Inheritance;

public class Gibson {

    public String model = "Les Paul";
    public String color;



    public void setModel (String model){
        this.model = model;
        color = "Sunburst";
    }

    public String getModel (){
        return model;
    };

    public String getColor(){ // Color will only be populated if the setModel function is executed.
        return color;
    };
}
