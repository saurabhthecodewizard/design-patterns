package org.command.service.bulk;

import org.command.dto.ExportDTO;
import org.command.dto.ImportDTO;
import org.command.service.DataService;

public class ExportDataOperation implements BulkOperation {
    private final ExportDTO exportRequest;
    private final DataService dataService;

    public ExportDataOperation(ExportDTO exportRequest, DataService dataService) {
        this.exportRequest = exportRequest;
        this.dataService = dataService;
    }

    @Override
    public void execute() {
        dataService.exportData(exportRequest);
    }
}
