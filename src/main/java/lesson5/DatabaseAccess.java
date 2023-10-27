package lesson5;

import java.util.Collection;

/**
 * Интерфейс Data Access Layer
 */
public interface DatabaseAccess {

    void addEntity(Entity entity);
    void removeEntity();

    Collection<Texture> getAllTextures();
    Collection<Model3D> getAllModels();

}
