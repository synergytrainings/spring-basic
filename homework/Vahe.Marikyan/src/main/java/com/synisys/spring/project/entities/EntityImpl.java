package com.synisys.spring.project.entities;
import java.util.Objects;

/**
 * @author vahe.marikyan
 * @since 2/13/2016.
 */
public class EntityImpl implements Entity {

    private Integer id;

    public EntityImpl(Integer id) {
        this.id = Objects.requireNonNull(id);
    }

    @Override
    public Integer getId() {
        return id;
    }
}
