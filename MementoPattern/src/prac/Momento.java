package prac;

public class Momento {
    private  Editor editor;

    Momento(Editor e){
        this.editor=e.clone();

    }

    public String getState(){
        return this.editor.getState();
    }
    public Editor getEditor(){
        return editor;
    }
}

