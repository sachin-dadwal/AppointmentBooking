package storage;
import java.util.*;
import java.io.*;
public class A{

    HashMap<String,String> hm;
    public A(){
        hm=new HashMap<String,String>();

        hm.put("1","A");
        hm.put("2","B");
        hm.put("3","C");
        hm.put("4", "sachin");

        method1(hm);

    }

public void method1(HashMap<String,String> map){
    //write to file : "fileone"
    try{
    File fileOne=new File("fileone.txt");
    FileOutputStream fos=new FileOutputStream(fileOne);
        ObjectOutputStream oos=new ObjectOutputStream(fos);

        oos.writeObject(map);
        oos.flush();
        oos.close();
        fos.close();
    }catch(Exception e){}

    //read from file 
    try{
        File toRead=new File("fileone.txt");
        FileInputStream fis=new FileInputStream(toRead);
        ObjectInputStream ois=new ObjectInputStream(fis);

        HashMap<String,String> mapInFile=(HashMap<String,String>)ois.readObject();

        ois.close();
        fis.close();
        //print All data in MAP
        for(Map.Entry<String,String> m :mapInFile.entrySet()){
            System.out.println(m.getKey()+" : "+m.getValue());
        }
    }catch(Exception e){}
  }

public static void main(String args[]){
        new A();
}

}