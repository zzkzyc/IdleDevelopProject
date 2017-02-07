package com.zzk.tool.util.csv; /**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
import java.io.*;
import java.util.*;

/**
 * CSV导出工具类
 *
 * @author zhouzongkun
 * @version : cardprod-parent, v 0.1 2016/7/11 9:44 zhouzongkun Exp $$
 */
public class CSVUtils {

    /**
     * 生成为CVS文件
     * @param exportData
     *       源数据List
     * @param map
     *       csv文件的列表头map
     * @param outPutPath
     *       文件路径
     * @param fileName
     *       文件名称
     * @return
     */

    public static File createCSVFile(List exportData, Map map, String outPutPath, String fileName) {
        File csvFile = null;
        try {
            File file = new File(outPutPath);
            if (!file.exists()) {
                file.mkdir();
            }
            //定义文件名格式并创建
            csvFile = File.createTempFile(fileName, ".csv", new File(outPutPath));
        } catch (Exception e) {
           e.printStackTrace();
        }
        // GB2312使正确读取分隔符","
        try (BufferedWriter csvFileOutputStream = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(csvFile), "GB2312"), 1024)) {
            // 写入文件头部
            for (Iterator propertyIterator = map.entrySet().iterator(); propertyIterator
                    .hasNext();) {
                java.util.Map.Entry propertyEntry = (java.util.Map.Entry) propertyIterator.next();
                csvFileOutputStream.write((String) propertyEntry.getValue() != null
                        ? (String) propertyEntry.getValue() : "");
                if (propertyIterator.hasNext()) {
                    csvFileOutputStream.write(",");
                }
            }
            csvFileOutputStream.newLine();
            // 写入文件内容
            for (Iterator iterator = exportData.iterator(); iterator.hasNext();) {
                LinkedHashMap row = (LinkedHashMap) iterator.next();
                for (Iterator propertyIterator = row.entrySet().iterator(); propertyIterator
                        .hasNext();) {
                    java.util.Map.Entry propertyEntry = (java.util.Map.Entry) propertyIterator
                            .next();
                    csvFileOutputStream.write("\"" + propertyEntry.getValue().toString() + "\"");
                    if (propertyIterator.hasNext()) {
                        csvFileOutputStream.write(",");
                    }
                }
                if (iterator.hasNext()) {
                    csvFileOutputStream.newLine();
                }
            }
            csvFileOutputStream.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return csvFile;
    }

    public static void main(String[] args) {
        List exportData = new ArrayList<Map>();
        Map row1 = new LinkedHashMap<>();
        row1.put("1", "11");
        row1.put("2", "12");
        row1.put("3", "13");
        row1.put("4", "14");
        exportData.add(row1);
        row1 = new LinkedHashMap<>();
        row1.put("1", "21");
        row1.put("2", "22");
        row1.put("3", "23");
        row1.put("4", "24");
        exportData.add(row1);
        row1 = new LinkedHashMap<>();
        row1.put("1", "中文1");
        row1.put("2", "中文122");
        row1.put("3", "中文13");
        row1.put("4", "中文124");
        exportData.add(row1);
        LinkedHashMap map = new LinkedHashMap();
        map.put("1", "第一列");
        map.put("2", "第二列");
        map.put("3", "第三列");
        map.put("4", "第四列");
        CSVUtils.createCSVFile(exportData, map, "d:/test", "活动目录");
    }
}
