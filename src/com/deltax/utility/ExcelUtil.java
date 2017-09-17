package com.deltax.utility;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.*;


public class ExcelUtil
{

    public static HashMap getExcelUtil(File fileName)
    {
        // Used the LinkedHashMap and LikedList to maintain the order
        HashMap<Integer, LinkedHashMap<Integer, List>> outerMap = new LinkedHashMap<Integer, LinkedHashMap<Integer, List>>();

        LinkedHashMap<Integer, List> hashMap = new LinkedHashMap<Integer, List>();

        String sheetName = null;
        // Create an ArrayList to store the data read from excel sheet.
        // List sheetData = new ArrayList();
        FileInputStream fis = null;
        try
        {
            fis = new FileInputStream(fileName);
            // Create an excel workbook from the file system
            XSSFWorkbook workBook = new XSSFWorkbook(fis);
            // Get the first sheet on the workbook.
            for (int i = 0; i < 1; i++)
            {
                XSSFSheet sheet = workBook.getSheetAt(i);
                // XSSFSheet sheet = workBook.getSheetAt(0);
                sheetName = workBook.getSheetName(i);

                Iterator rows = sheet.rowIterator();
                while (rows.hasNext())
                {
                    XSSFRow row = (XSSFRow) rows.next();
                    Iterator cells = row.cellIterator();

                    List data = new LinkedList();
                    while (cells.hasNext())
                    {
                        XSSFCell cell = (XSSFCell) cells.next();
                        cell.setCellType(Cell.CELL_TYPE_STRING);
                        data.add(cell.getStringCellValue());
                    }
                    hashMap.put(row.getRowNum(), data);

                    // sheetData.add(data);
                }
                outerMap.put(i, hashMap);
//                hashMap = new LinkedHashMap<Integer, List>();
                break;
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (fis != null)
            {
                try
                {
                    fis.close();
                }
                catch (IOException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

        return hashMap;

    }

    public static ArrayList<HashMap<String,String>> getMapOfRows(){
        String excelFilePath="./src/com/deltax/resources/TestData.xlsx";
        HashMap<Integer,List> sheetData=getExcelUtil(new File(excelFilePath));
        ArrayList<HashMap<String,String>> hashData=new ArrayList<HashMap<String, String>>();
        List<String> header= sheetData.entrySet().iterator().next().getValue();
        sheetData.remove(sheetData.entrySet().iterator().next().getKey());
        Iterator itr = sheetData.entrySet().iterator();
        List<String> eachRow=null;
        while (itr.hasNext()) {
            Map.Entry pair = (Map.Entry)itr.next();
            eachRow= (List<String>) pair.getValue();
            HashMap<String,String>  eachDataSet=new HashMap<String,String>();
            for (int i=0;i<header.size();i++) {
                try{ eachDataSet.put(header.get(i).toString(),eachRow.get(i).toString());}catch(Exception e){
                    e.printStackTrace();
                }
            }
            hashData.add(eachDataSet);
        }
        return hashData;
    }

    public static HashMap<String,HashMap<String,String>> prepareTestDataMap(){
        ArrayList<HashMap<String,String>> list_maps_rows=getMapOfRows();
        HashMap<String,HashMap<String,String>> test_data_map=new HashMap<String,HashMap<String,String>>();


        for(HashMap<String,String> each_row_map: list_maps_rows){

            test_data_map.put(each_row_map.get("TestCaseId"),each_row_map);

        }


        return test_data_map;
    }



}
