package org.command.dto;

public class ExportDTO {
    private String destination;
    private String destinationPath;
    private String fileType;
    private boolean includeHeaders;

    public ExportDTO(String destination, String destinationPath, String fileType, boolean includeHeaders) {
        this.destination = destination;
        this.destinationPath = destinationPath;
        this.fileType = fileType;
        this.includeHeaders = includeHeaders;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestinationPath() {
        return destinationPath;
    }

    public void setDestinationPath(String destinationPath) {
        this.destinationPath = destinationPath;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public boolean isIncludeHeaders() {
        return includeHeaders;
    }

    public void setIncludeHeaders(boolean includeHeaders) {
        this.includeHeaders = includeHeaders;
    }
}
