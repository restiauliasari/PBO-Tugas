/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestiAuliaSari15122020;

/**
 *
 * @author USER
 */
public class StudentRecordExample {
    public static void main (String[] args)
    {
        StudentRecord annaRecord = new  StudentRecord();
        StudentRecord aliRecord = new  StudentRecord("Ali","Bukittinggi");
        
        annaRecord.setName("Anna"); 
        annaRecord.setAddress("Padang"); 
        annaRecord.setAge(25); 
        annaRecord.setMathGrade(70); 
        annaRecord.setEnglishGrade(80); 
        annaRecord.setScienceGrade(80); 
        
       
        System.out.println("Nama        :"+annaRecord.getName());
        System.out.println("Alamat      :"+annaRecord.getAddress());
        System.out.println("Umur        :"+annaRecord.getAge());
        System.out.println("matematika  :"+annaRecord.getMathGrade());
        System.out.println("B.inggris   :"+annaRecord.getEnglishGrade());
        System.out.println("Pengetahuan :"+annaRecord.getScienceGrade());
        System.out.println("Rata-Rata   :"+annaRecord.getAverage());
        
        // ali 
        aliRecord.print("");
        aliRecord.print(90,80,70);
       
        System.out.println("Jumlah Siswa  :"+ annaRecord.getStudentCount());
    }
}
