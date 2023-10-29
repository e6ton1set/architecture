package lesson6.database;

import lesson6.infrastructure.persistance.Database;

public class NotesDatabase implements Database {

    private NotesTable notesTable = new NotesTable();


    public NotesTable getNotesTable() {
        return notesTable;
    }
}
