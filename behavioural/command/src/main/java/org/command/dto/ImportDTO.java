package org.command.dto;

public class ImportDTO {
    private String source;
    private String filePath;
    private String dataFormat;
    private String compressionType;

    public ImportDTO(String source, String filePath, String dataFormat, String compressionType) {
        this.source = source;
        this.filePath = filePath;
        this.dataFormat = dataFormat;
        this.compressionType = compressionType;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getDataFormat() {
        return dataFormat;
    }

    public void setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
    }

    public String getCompressionType() {
        return compressionType;
    }

    public void setCompressionType(String compressionType) {
        this.compressionType = compressionType;
    }
}
