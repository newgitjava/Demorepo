package day12.learning;

import java.io.File;

class FileInfo {  
    public static void main(String[] args) {  
        // Creating file object  
        File f2 = new File("D:FileOperationExample.txt");  
        if (f2.exists()) {  
            // Getting file name  
            System.out.println("The name of the file is: " + f2.getName());  
   
            // Getting path of the file   
            System.out.println("The absolute path of the file is: " + f2.getAbsolutePath());     
   
            // Checking whether the file is writable or not  
            System.out.println("Is file writeable?: " + f2.canWrite());    
   
            // Checking whether the file is readable or not  
            System.out.println("Is file readable " + f2.canRead());    
   
            // Getting the length of the file in bytes  
            System.out.println("The size of the file in bytes is: " + f2.length());    
        } else {  
            System.out.println("The file does not exist.");  
        }  
    }  
}  

