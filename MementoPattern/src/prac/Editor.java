package prac;

public class Editor implements Cloneable{
    private String text="";
    private String color="red";

    public void setText(String text){
        this.text=this.text+text;
    }

    public String getState(){
        return "Text: "+ this.text + " Color : "+this.color;
    }
    public void setColor(String c){
        this.color=c;
    }
    public Editor clone(){
        Editor e  = new Editor();
        e.setColor(this.color);
        e.setText(this.text);

        return e;
    }



}
