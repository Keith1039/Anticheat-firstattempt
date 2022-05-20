import java.io.*;
import java.util.Scanner;
public class FileComparison {

    public Boolean issame(File file,File file_ref) throws IOException{
        Boolean flag =true;
        Scanner scanner1= new Scanner(file);
        Scanner scanner2= new Scanner(file_ref);
        
        while(scanner1.hasNext() == true && scanner2.hasNext() && flag==true){
            if(scanner1.nextLine()!=scanner2.nextLine()){
                flag=false;
            }
        }
        //check to see if the files are the same length
        if((scanner1.hasNext()==true&&scanner2.hasNext()==false) ||(scanner2.hasNext()==true||scanner1.hasNext()==false)){
            flag=false;
        }
        scanner1.close();
        scanner2.close();

        return(flag);
    }
    
}
