package Prototype3;

import java.util.ArrayList;
import java.util.List;

public class Folder implements CopyFolder {

    private String folderName;
    private List<Folder> folderList;
    private List<File> fileList;

    public Folder(String folderName) {
        this.folderName = folderName;
        folderList=new ArrayList<>();
        fileList=new ArrayList<>();

    }

    public void addFile(File f) {
        fileList.add(f);
    }

    public void addFolder(Folder fol) {
        this.folderList.add(fol);
    }

    public String rename(String name){

         String temp = "";

          temp=folderName;
          folderName=name;
          return temp;

//        temp=temp.replace(folderName, name);




    }

    @Override
    public Object copy() {

  Folder folder=new Folder(folderName);

       for(File file: fileList){

         folder.addFile((File) file.copy());
         
       }

       for(Folder folder2: folderList){

        folder.addFolder(folder2);
       }

        return folder;
       

    }

    @Override
    public String toString() {
        return "Folder [fileList=" + fileList+ ", folderList=" + folderList + ", folderName=" + folderName + "]";
    }

    

}
