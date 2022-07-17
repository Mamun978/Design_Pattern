package Prototype3;

public class File implements CopyFolder {

    private String fileName;

    

    public File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public Object copy() {
        
     return new File(this.fileName);

    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return "File{" +
                "fileName='" + fileName + '\'' +
                '}';
    }
}
