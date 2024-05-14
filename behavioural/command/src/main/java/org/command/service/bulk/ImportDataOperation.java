package org.command.service.bulk;

import org.command.dto.ImportDTO;
import org.command.service.DataService;
import org.command.service.bulk.BulkOperation;

public class ImportDataOperation implements BulkOperation {
    private final ImportDTO importRequest;
    private final DataService dataService;

    public ImportDataOperation(ImportDTO importRequest, DataService dataService) {
        this.importRequest = importRequest;
        this.dataService = dataService;
    }

    @Override
    public void execute() {
        dataService.importData(importRequest);
    }
}
