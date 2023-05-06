package BatchInsert;

import com.mysql.jdbc.Driver;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BatchInsert {
    Map<Integer, List<String>> data = new HashMap<>();


    public Map<Integer, List<String>> readFromExcel() {
        try {
            FileInputStream fis = new FileInputStream(new File("C:\\Users\\Mirza\\Desktop\\Book1.xlsx"));
            Workbook wb = new XSSFWorkbook(fis);

            Sheet sheet = wb.getSheetAt(0);

            int i = 1;

            for (Row row : sheet) {
                data.put(i,new ArrayList<>());
                for (Cell cell : row) {
                    switch (cell.getCellType()) {
                        case STRING:
                            data.get(i).add(cell.getStringCellValue());
                            break;

                        case NUMERIC:
                            data.get(i).add(String.valueOf(cell.getNumericCellValue()));
                            break;
                    }


                }

                i++;




//
//                for (Map.Entry<Integer,List<String>> entry: data.entrySet()
//                     ) {
//                    System.out.println(entry.getKey());
//                    System.out.println(entry.getValue().get(1));
//                }
            }

            if (data.size() >= 1) {
                return data;
            } else
                return null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            System.out.println(e.getStackTrace());
        }

        return data;
    }


    public void batchInsert(Map<Integer, List<String>> data) {
        try {
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/corebanking","cbadmin","cb");
            connection.setAutoCommit(true);
            PreparedStatement preparedStatement=connection.prepareStatement("insert into corebanking.cities values (?,?,?,?)");
            for (Map.Entry<Integer,List<String>>  entry: data.entrySet()
                 ) {
                List<String> value =entry.getValue();
                preparedStatement.setString(1,value.get(0));
                preparedStatement.setString(2,value.get(1));
                preparedStatement.setString(3,value.get(2));
                preparedStatement.setString(4,value.get(3));
                preparedStatement.addBatch();
            }
            
            /*
            for (int i = 1; i < data.size(); i++) {
                preparedStatement.setString(1,"fsdsdf");
                preparedStatement.setString(2,"fsdfdsffds");
                preparedStatement.setString(3,data.get(i).get(3));
                preparedStatement.setDouble(4,Double.valueOf(data.get(i).get(4)));

            }

             */
            preparedStatement.executeBatch();



        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            System.out.println(e.getCause());
        }
    }

    public static void main(String[] args) {
        BatchInsert bi = new BatchInsert();
        bi.batchInsert(bi.readFromExcel());
    }

}
