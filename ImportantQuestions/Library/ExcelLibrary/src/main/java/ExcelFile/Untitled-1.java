



Read File
    static String ExcelPath = "C:\\Users\\DOS\\OneDrive\\Code java\\ImportantQuestions\\Library\\ExcelLibrary\\Record\\Student.xlsx";
    XSSFWorkbook workbook,workbook1;
    XSSFSheet sheet,sheet1;
    DataFormatter formatter;
    int rowCount;
    int flag=0,rowNo=0;
    public ReadFile(){
        try {
            workbook = new XSSFWorkbook(ExcelPath);
            sheet = workbook.getSheet(sheetName);
            formatter = new DataFormatter();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public ReadFile(String ExcelPath){
        try {
            workbook = new XSSFWorkbook(ReadFile.ExcelPath);
            sheet = workbook.getSheet(sheetName);
            workbook1 = new XSSFWorkbook(ExcelPath);
            sheet1 = workbook.getSheet(sheetName);
            formatter = new DataFormatter();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void getRowCount(){
        rowCount = sheet.getPhysicalNumberOfRows();
	}
    boolean checkRollNo() throws IOException {
        for(int i=0;i<rowCount;i++){
            int rollNo = (int)sheet.getRow(i).getCell(1).getNumericCellValue();
		    if(roll == rollNo) {
		    	flag++;
                rowNo=i;
		    	break;
		    }
        }
        if(flag==1){
            return true;
        }
        else{
            System.out.println("Entered roll number is not available in record ");
            return false;
        }
    }
    void printRecord(){
        Object[][] data = new Object[1][5];
        for(int i=0;i<5;i++){
            data[0][i] = formatter.formatCellValue(sheet.getRow(rowNo).getCell(i));
        }
        JFrame f = new JFrame();
        Object[] column= new Object[5];
        for(int i=0;i<5;i++){
            column[i] = formatter.formatCellValue(sheet.getRow(rowNo).getCell(i));
        }
        JTable jt=new JTable(data,column);    
        jt.setBounds(30,40,200,300);          
        JScrollPane sp=new JScrollPane(jt);    
        f.add(sp);          
        f.setSize(300,400);    
        f.setVisible(true);
    }
    void checkBook(int column,String book){
        ExcelPath = "C:\\Users\\DOS\\OneDrive\\Code java\\Library\\Book.xlsx";
        getRowCount();
        int rowNumber=0;
        for(int i=0;i<rowCount;i++){
            Object value = formatter.formatCellValue(sheet1.getRow(i).getCell(column));
            if(value.equals(book)) {
		    	flag++;
                rowNumber=i;
		    	break;
		    }
        } 
        if(flag==1){
            int available = (int)sheet1.getRow(rowNumber).getCell(5).getNumericCellValue();
            int issueAvailable = (int)sheet.getRow(rowNo).getCell(4).getNumericCellValue();
            if(available>0 && issueAvailable>0){
                Object value = formatter.formatCellValue(sheet1.getRow(rowNumber).getCell(0));
                System.out.println("Name of the book issued : "+value);
            }
        } 
    }
Write File
static String ExcelPath;
XSSFWorkbook workbook;

File xlsxFile;
String sheetName;
Object[][] newStudent;

public WriteFile(/*String sheetName/* */){
    //this.sheetName = sheetName;
    ExcelPath="C:\\Users\\DOS\\OneDrive\\Code java\\ImportantQuestions\\Library\\ExcelLibrary\\Record\\Student.xlsx";
    xlsxFile= new File(ExcelPath);
    newStudent = new Object[1][5];
}
public WriteFile(String ExcelPath,String sheetName){
    this.sheetName = sheetName;
    xlsxFile= new File(ExcelPath);
}
void dataOfStudent() throws IOException{
    System.out.print("Enter class Roll number: ");
    newStudent[0][0]=sc.nextInt();
    System.out.print("Enter name: ");
    newStudent[0][1]= sc.nextLine();
    System.out.print("Enter Unviersity registration number: ");
    newStudent[0][2]= sc.nextLine();
    System.out.print("Create password: ");   
    newStudent[0][3]= sc.nextLine();
    newStudent[0][4]= 3;
    if(checkSession()){
        writeData();
    } 
}
void writeData(){
    try{
    FileInputStream inputStream = new FileInputStream(xlsxFile);
    Workbook workbook = WorkbookFactory.create(inputStream);
    Sheet sheet = (Sheet) workbook.getSheet(sheetName);
    int rowCount = ((XSSFSheet) sheet).getLastRowNum();
    for (Object[] student : newStudent) {
        Row row = ((XSSFSheet) sheet).createRow(++rowCount);
        int columnCount = 0;
        for (Object info : student) {
            Cell cell = row.createCell(columnCount++);
            if (info instanceof String) {
                cell.setCellValue((String) info);
            } else if (info instanceof Integer) {
                cell.setCellValue((Integer) info);
            }
        }
    }
    inputStream.close();
    FileOutputStream os = new FileOutputStream(xlsxFile);
    workbook.write(os);
    workbook.close();
    os.close();         
    System.out.println("Student has been registered successfully.");   
}
 catch(EncryptedDocumentException  e) {
    System.err.println("Exception while registering the student.");
    e.printStackTrace();
} catch (IOException e) {
    System.err.println("Exception while registering the student.");
    e.printStackTrace();
    }    

}
void book(int bookCode,int noAvailable ){
    try{
    FileInputStream inputStream = new FileInputStream(xlsxFile);
    Workbook workbook = WorkbookFactory.create(inputStream);
    Sheet sheet = (Sheet) workbook.getSheetAt(0);
    Cell cell= ((XSSFSheet) sheet).getRow(1).getCell(3);
    cell.setCellValue(30);
    inputStream.close();
    FileOutputStream os = new FileOutputStream(xlsxFile);
    workbook.write(os);
    workbook.close();
    os.close();         
    System.out.println("Student has been registered successfully.");
    }catch(EncryptedDocumentException  e) {
        System.err.println("Exception while issuing book.");
        e.printStackTrace();
    } catch (IOException e) {
        System.err.println("Exception while issuing book.");
        e.printStackTrace();
        } 
}
void editData(){
    

}
// boolean checkPassword(){
        //     System.out.print("Enter password: ");
        //     String enteredPassword = sc.next();
        //     if(read_obj.checkData(i,3,enteredPassword)){
        //         password = read_obj.data;
        //         choice();
        //         return true;
        //     }else{
        //         return false;
        //     }
        // }