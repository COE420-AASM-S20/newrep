import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.Scanner;


public class MenuController {

	 public static void main(String[] args) throws Exception {
		 Scanner input = new Scanner(System.in);
	       
	        System.out.println("1\t For Writing Data");
	        System.out.println("2\t For Reading Data");
	        int choice=input.nextInt();
	         
	        //Display the title of the chosen module
	        switch (choice) {
	            case 1:
	            	WriteData();
		     break;
	            case 2: 
	            	ReadData();
	         break;
	            default: System.out.println("Invalid choice");
	        }
	       	   
	 }
		 
		 public static void WriteData() throws IOException {
	 //Create blank workbook
     XSSFWorkbook menubook = new XSSFWorkbook();
     
     //Create a blank sheet
     XSSFSheet spreadsheet = menubook.createSheet( " Restaurant Info ");

     //Create row object
     XSSFRow row;

     //This data needs to be written (Object[])
     Map < String, Object[] > empinfo = new TreeMap < String, Object[] >();
     empinfo.put( "1", new Object[] {
        "ID", "DISH", "DESCRIPTION" });
     
     empinfo.put( "2", new Object[] {
        "1", "Pasta", "exmaple" });
     
     empinfo.put( "3", new Object[] {
        "2", "Pizza", "exmaple"  });
     
     empinfo.put( "4", new Object[] {
        "3", "Biryani", "exmaple " });
     
     empinfo.put( "5", new Object[] {
        "4", "Macroni", "exmaple" });
     
     empinfo.put( "6", new Object[] {
        "5", "Burger", "exmaple" });

     //Iterate over data and write to sheet
     Set < String > keyid = empinfo.keySet();
     int rowid = 0;
     
     for (String key : keyid) {
        row = spreadsheet.createRow(rowid++);
        Object [] objectArr = empinfo.get(key);
        int cellid = 0;
        
        for (Object obj : objectArr){
           Cell cell = row.createCell(cellid++);
           cell.setCellValue((String)obj);
        }
     }
     //Write the workbook in file system
     FileOutputStream out = new FileOutputStream(
        new File("Restaurant.xlsx"));
     
     menubook.write(out);
     out.close();
     System.out.println("Restaurant.xlsx written successfully");
     
		 }
     
     public static void ReadData() throws IOException {
     String excelFilePath = "Restaurant.xlsx";
       FileInputStream inputStream = new FileInputStream(new File("Restaurant.xlsx"));
        
       XSSFWorkbook menubook = new XSSFWorkbook(inputStream);
       XSSFSheet firstSheet = menubook.getSheetAt(0);
       Iterator<Row> iterator = firstSheet.iterator();
        
       while (iterator.hasNext()) {
           Row nextRow = iterator.next();
           Iterator<Cell> cellIterator = nextRow.cellIterator();
            
           while (cellIterator.hasNext()) {
               Cell cell = cellIterator.next();
                
               switch (cell.getCellType()) {
                   case Cell.CELL_TYPE_STRING:
                       System.out.print(cell.getStringCellValue());
                       break;
                   case Cell.CELL_TYPE_BOOLEAN:
                       System.out.print(cell.getBooleanCellValue());
                       break;
                   case Cell.CELL_TYPE_NUMERIC:
                       System.out.print(cell.getNumericCellValue());
                       break;
               }
               System.out.print(" - ");
           }
           System.out.println();
       }
        
       menubook.close();
       inputStream.close();
     
     }
	 
	      
	   }


