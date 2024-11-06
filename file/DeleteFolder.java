package file;

import java.io.File; 

public class DeleteFolder {
  public static void main(String[] args) { 
    File myObj = new File("D:\\Java\\Tutorial\\src\\regex"); 
    if (myObj.delete()) { 
      System.out.println("Deleted the folder: " + myObj.getName());
    } else {
      System.out.println("Failed to delete the folder.");// cannot delete a folder if exist file in the folder
    } 
  } 
}