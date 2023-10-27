package lesson5;

import java.util.Collection;

/**
 * Интерфейс БД
 */
public interface Database {

    void load();
    void save();
    void del();

    Collection<Entity> getAll();

}
