package com.java.buddies.players.commons;

import java.io.*;
import java.util.List;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class CsvReader {

  public CsvReader() {}

  public static List<CSVRecord> getRecords(String filePath, char delimiter) throws IOException {
    InputStream inputStream = CsvReader.class.getResourceAsStream(filePath);
    InputStreamReader reader = new InputStreamReader(inputStream);
    CSVFormat csvFormat = CSVFormat.newFormat(delimiter).withHeader().withTrim();
    CSVParser csvParser = new CSVParser(reader, csvFormat);
    return csvParser.getRecords();
  }

}
