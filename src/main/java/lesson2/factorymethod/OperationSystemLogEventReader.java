package lesson2.factorymethod;

import lesson2.templatemethod.LogEntry;
import lesson2.templatemethod.LogReader;

public class OperationSystemLogEventReader extends LogReader {
    @Override
    public Object getDataSource() {
        return null;
    }

    @Override
    public void setDataSource(Object data) {

    }

    @Override
    protected Iterable<String> readEntries(int position) {
        return null;
    }

    @Override
    protected LogEntry parseLogEntry(String stringEntry) {
        return null;
    }
}
